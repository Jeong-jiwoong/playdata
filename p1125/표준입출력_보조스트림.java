package p1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ǥ�������_������Ʈ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;//ǥ���Է�: Ű����� 1����Ʈ�� �д� ��Ʈ��
		//����Ʈ�� ���� ���� ���ڷ� ��ȯ. �ѱ� �ȱ���
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(ir);//���� ����
		int ch;
		//in.read(): �ѹ���Ʈ ����
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
