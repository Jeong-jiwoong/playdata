package Join;

import java.util.Scanner;

//������� �޴� ���ÿ� ���� Service�� �޼��� ȣ��
public class Menu {
	private Service service;

	public Menu() {
		service = new Service(10);
	}

	public void run(Scanner sc) {
		String str = "1.ȸ������ 2.�α��� 3.������Ȯ�� 4.���������� 5.�α׾ƿ� 6.Ż�� 7.����";
		int menu;
		boolean flag = true;
		while (flag) {
			if (Service.login_id != null) {
				System.out.println(Service.login_id + "�� �α��� ��");
			}
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.join(sc);
				break;
			case 2:
				service.login(sc);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
		}
	}
	
}
