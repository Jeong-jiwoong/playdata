package p1110;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.in : ǥ���Է�(Ű����)
		 * System.out : ǥ�� ���(�ܼ�)
		 */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch;
		try {
				while((ch=br.read())!='\n') {
							System.out.print((char)ch);
						}
				} catch (IOException e) {
						// TODO Auto-generated catch black
						e.printstackTrance();
					}
		*/
		//Ű���� �Է°��� ���ڿ��� ó����. 5�� "5"�� ����
		//Scanner�� Ű����� �Էµ� ���� ���ϴ� Ÿ������ �ڵ� ��ȯ�Ͽ� ����
		Scanner scanner; //���� ����
		scanner = new Scanner(System.in); //Ű����κ��� �о���̴� ��ġ ����
		
		System.out.println("�̸��� �Է��Ͻÿ�");//���
		String name = scanner.next(); //������� ���ڿ� �ܾ� �ϳ��� �Է¹���
		System.out.println("name:" + name);
		
		System.out.println("���̸� �Է��Ͻÿ�");
		int age = scanner.nextInt();
		System.out.println("age:" + age);
		
		System.out.println("Ű�� �Է��Ͻÿ�");
		float height = scanner.nextFloat();
		System.out.println("height:" + height);
		
		scanner.close();
		
		
		
	}

}
