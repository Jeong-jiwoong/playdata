package study1123;

import java.util.Scanner;

// 1. ȸ������  2.�α���  3. ������Ȯ��  4. ����������  5. �α׾ƿ�  6. Ż��  7. ����
public class Menu {

	public void run(Scanner sc) {
		
		Service s = new Service(10);   //��ü ���� ok
		
		String str = "1. ȸ������  2.�α���  3. ������Ȯ��  4. ����������  5. �α׾ƿ�  6. Ż��  7. ���� ";
		
		boolean flag = true;
		while (flag) {
			System.out.println(str);
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				// ȸ������ ���
				s.add(sc);
				break;
				
				
			case 7:
				System.out.println("���α׷� ����");
				flag = false;
				break;
			}
		}
	}
}
