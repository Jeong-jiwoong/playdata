package p1125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a.txt�� c.txt�� �����ϴ� �ڵ� �ۼ�
		
		try {
			FileInputStream fi = new FileInputStream("a.txt");
			FileOutputStream fo = new FileOutputStream("c.txt");
			
			int ch;
			while ((ch = fi.read()) != -1) {// -1:EOF(end of file)
				System.out.print((char) ch);
				fo.write(ch);//����
			}
			fi.close();// ��Ʈ�� ����
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
