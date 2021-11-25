package p1125;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("serverip", "210.34.56.12");
		prop.put("port", "1234");
		prop.put("id", "scott");
		prop.put("pwd", "tiger");
		
		System.out.println(prop.get("serverip"));
		System.out.println(prop.get("port"));
		System.out.println(prop.get("id"));
		System.out.println(prop.get("pwd"));
		
		try {
			//properties 객체에 저장된 데이터를 파일에 저장
			prop.storeToXML(new FileOutputStream("out.xml"), "comment sample");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
