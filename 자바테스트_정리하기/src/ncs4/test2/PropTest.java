package ncs4.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropTest {
	//파일저장
	public static void fileSave(Properties p ) throws IOException {
		//Properties 객체에 데이터 저장
		p.setProperty("1", "apple , 1200 , 3 ");
		p.setProperty("2", "banana , 2500 , 2 ");
		p.setProperty("3", "grape , 4500 , 5 ");
		p.setProperty("4", "orange , 800 , 10 ");
		p.setProperty("5", "melon , 5000 , 2 ");
		
		//Properties 객체를 XML파일로 저장
		FileOutputStream fos = new FileOutputStream("data.xml");
		p.storeToXML(fos, null); //xml파일로저장
		fos.close();
		
	}
	//파일읽기 
	public static void fileOpen(Properties p ) {
		try {
			//Properties 객체에 xml파일내용 읽어올 준비하기 
			FileInputStream fis = new FileInputStream("data.xml");
			p.loadFromXML(fis);
			fis.close();
			
			//Properties 객체에 키-값으로 Fruit각체를 List로 저장 
			List<Fruit> fruit = new ArrayList<>();
			//파일에 저장 
			for(String key : p.stringPropertyNames()) {
				//설정에 적혀있는 문자이름을 가져와서 key로 넣을예정
				String[] values = p.getProperty(key).split(" , ");
				//apple , 1200 ,3을 ,로 구분해서 각각 값을 저장하는것
				Fruit 과일 = new Fruit(values[0],Integer.parseInt(values[1]),Integer.parseInt(values[2]));
				
				fruit.add(과일);
			}
			//List 배열로 변환하고 오름차순 정렬 
			Fruit[] 과일배열 = fruit.toArray(new Fruit[0]);
			//정렬하기 
			Arrays.sort(과일배열);
			
			
			
			
			System.out.println("Fruit 배열출력 ");
			for(Fruit f : 과일배열) {
				System.out.println(f);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//최종출력
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		fileSave(p);
		fileOpen(p);
		
	}
	
	
	
	
	
	
	
	
}
