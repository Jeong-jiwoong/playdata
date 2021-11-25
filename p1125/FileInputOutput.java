package p1125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// FileInputStream: ���Ͽ��� �� ����Ʈ ������ �д� ��Ʈ��
			// �������� �Ķ���ͷ� Ÿ�� ������ ��� ����
			// �б� ������ ������ ������ ����
			FileInputStream fi = new FileInputStream("a.txt");
			int ch;
			while ((ch = fi.read()) != -1) {// -1:EOF(end of file)
				System.out.print((char) ch);
			}
			fi.close();// ��Ʈ�� ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// FileOutputStream: ���Ͽ� ����Ʈ ������ ��� ��Ʈ��
			// ��� ��Ʈ���� ������ �ڵ� ������. �̸� �ȸ��� ��
			FileOutputStream fo = new FileOutputStream("b.txt");
			byte[] str = { 'h', 'e', 'l', 'l', 'o' };
			fo.write(str);//�迭 ��ü ������ ��Ʈ���� ��
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
