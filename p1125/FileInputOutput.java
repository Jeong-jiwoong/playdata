package p1125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// FileInputStream: 파일에서 한 바이트 단위로 읽는 스트림
			// 생성자의 파라메터로 타깃 파일의 경로 지정
			// 읽기 파일은 파일이 없으면 에러
			FileInputStream fi = new FileInputStream("a.txt");
			int ch;
			while ((ch = fi.read()) != -1) {// -1:EOF(end of file)
				System.out.print((char) ch);
			}
			fi.close();// 스트림 닫음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// FileOutputStream: 파일에 바이트 단위로 출력 스트림
			// 출력 스트림의 파일은 자동 생성됨. 미리 안말들어도 됨
			FileOutputStream fo = new FileOutputStream("b.txt");
			byte[] str = { 'h', 'e', 'l', 'l', 'o' };
			fo.write(str);//배열 전체 내용을 스트림에 씀
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
