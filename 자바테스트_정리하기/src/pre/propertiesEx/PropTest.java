package pre.propertiesEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		//properties에 xml파일로 저장하기 
		
		p.setProperty("1", "패밀리맨 , 4 , 2000");
		p.setProperty("2", "엘리멘탈 , 5 , 2023");
		p.setProperty("3", "투모로우 , 5 , 2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movis is fun");
			fos.close();
			System.out.println("설정이 movies.xml파일에 저장되었습니다");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
		
	}
	
	
	
	
}
