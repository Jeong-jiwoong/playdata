package p1125;

import java.io.IOException;
import java.io.InputStream;

public class ǥ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;//ǥ���Է�: Ű����� 1����Ʈ�� �д� ��Ʈ��
		int ch;
		//in.read(): �ѹ���Ʈ ����
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
