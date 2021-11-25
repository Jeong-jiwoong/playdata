package p1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 표준입출력_보조스트림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;//표준입력: 키보드로 1바이트씩 읽는 스트림
		//바이트로 읽은 값을 문자로 변환. 한글 안깨짐
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(ir);//버퍼 장착
		int ch;
		//in.read(): 한바이트 읽음
		try {
			while ((ch = reader.read()) != '\n') {
				System.out.println((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
