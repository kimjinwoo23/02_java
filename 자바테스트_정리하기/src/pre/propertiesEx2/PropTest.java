package pre.propertiesEx2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		
		p.setProperty("1", "순풍산부인과 , 1998 , 682");
		p.setProperty("2", "똑바로살아라 , 2002 , 239");
		p.setProperty("3", "눈물의여왕 , 2024 , 16");
		p.setProperty("4", "아내의유혹 , 2008 , 129");
		
		
		try {
			FileOutputStream fos = new FileOutputStream("drama.xml");
			p.storeToXML(fos, null);
			fos.close();
			System.out.println("재미있었나,.?");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
		
		
		
	
	
	
	
	
	
	
}

