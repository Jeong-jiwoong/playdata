package p1125;

import java.io.IOException;
import java.io.InputStream;

public class 표준입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;//표준입력: 키보드로 1바이트씩 읽는 스트림
		int ch;
		//in.read(): 한바이트 읽음
		try {
			while ((ch = in.read()) != '\n') {
				System.out.println((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
