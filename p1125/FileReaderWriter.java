package p1125;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//FileReader: 파일에서 문자단위(2바이트)로 읽는 스트림
			//한글 안깨짐
			FileReader fr = new FileReader("d.txt");
			int ch;
			while ((ch = fr.read()) != -1) {// -1:EOF(end of file)
				System.out.print((char) ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//FileWriter: 파일에 문자단위로 씀
			//파일 미리 생성안해도 자동으로 생성됨
			FileWriter fw = new FileWriter("e.txt");
			String str = "안녕하세요";
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
