package warehouse2;

import java.util.Scanner;

public class Menu {
	private Service service;

	public Menu() {
		service = new Service();
	}

	public void run(Scanner sc) {
		boolean flag = true;
		int m = 0;
		while (flag) {
			System.out.println("1.���� 2.������ 3.����");
			m = sc.nextInt();
			switch (m) {
			case 1:
				p_run(sc);// ���� ���� �޴� ��� �Լ�
				break;
			case 2:
				o_run(sc);// ������ ���� �޴� ��� �Լ�
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}

	public void p_run(Scanner sc) {
		boolean flag = true;
		int m = 0;
		while (flag) {
			System.out.println("1.��ǰ��� 2.��ȣ�ΰ˻� 3.��ǰ������ �˻� 4.���ݼ��� 5.��ǰ��� 6.�԰� 7.��� 8.���� 9.����");
			m = sc.nextInt();
			switch (m) {
			case 1:
				service.addProduct(sc);
				break;
			case 2:
				service.printByNum(sc);
				break;
			case 3:
				service.printByName(sc);
				break;
			case 4:
				service.editPrice(sc);
				break;
			case 5:
				service.printProducts();
				break;
			case 6:
				service.in(sc);
				break;
			case 7:
				//service.out(null);
				break;
			case 8:
				service.delProduct(sc);
				break;
			case 9:
				flag = false;
				break;
			}
		}
	}

	public void o_run(Scanner sc) {
		System.out.println("�غ���");
	}
}
