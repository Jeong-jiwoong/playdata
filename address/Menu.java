package address;

import java.util.Scanner;

//�޴� ������ Ŭ����
//����ڰ� ������ �޴� ����� �����ϴ� 
public class Menu {
	Service service = new Service();
	
	void run(Scanner sc) {
		boolean flag = true;
		int menu;
		while(flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����") ;
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				service.addPerson(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				service.printAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
}
