package p1125;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//FileReader: ���Ͽ��� ���ڴ���(2����Ʈ)�� �д� ��Ʈ��
			//�ѱ� �ȱ���
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
			//FileWriter: ���Ͽ� ���ڴ����� ��
			//���� �̸� �������ص� �ڵ����� ������
			FileWriter fw = new FileWriter("e.txt");
			String str = "�ȳ��ϼ���";
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
