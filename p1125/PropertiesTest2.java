package p1125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			//loadFromXML() xml 파일에 저장된 프라퍼티스 값을 로드
			prop.loadFromXML(new FileInputStream("out.xml"));
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.get("serverip"));
		System.out.println(prop.get("port"));
		System.out.println(prop.get("id"));
		System.out.println(prop.get("pwd"));
	}
}
