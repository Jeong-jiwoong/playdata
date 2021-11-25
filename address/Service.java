package address;

import java.util.Scanner;

//���α׷� �ܺο� ������ ��� ����
//��κ� ����� ������ ó�� �ʿ�
public class Service {
	Dao dao = new Dao(); //������ ó�� ��ü
	
	//�߰� ��� 
	void addPerson(Scanner sc) {
		System.out.println("===�߰�===");
		String name = "";
		int idx = 0;
		do {
			System.out.print("name:");
			name = sc.next();
			idx = dao.select(name);
		} while (idx >= 0);
		System.out.print("tel:");
		String tel = sc.next();
		System.out.print("addr:");
		String addr = sc.next();

		Person p = new Person();
		p.inputData(name, tel, addr);

		dao.insert(p);
	}

	// ��ü���
	void printAll() {
		System.out.println("===��ü ���===");
		Person[] list = dao.selectAll();
		for (Person p : list) {
			p.printData();
		}
	}

	void printPerson(Scanner sc) {
		System.out.println("===�̸����� �˻�===");
		System.out.print("search name:");
		String name = sc.next();
		int idx = dao.select(name);
		if (idx < 0) {
			System.out.println("���� �̸�");
		} else {
			Person p = dao.getByIdx(idx);
			p.printData();
		}
	}

	void editPerson(Scanner sc) {
		System.out.println("===����===");
		System.out.print("edit name:");
		String name = sc.next();
		int idx = dao.select(name);
		if (idx < 0) {
			System.out.println("���� �̸�");
		} else {
			Person p = dao.getByIdx(idx);
			System.out.println("===������ info===");
			p.printData();
			System.out.print("new tel:");
			p.tel = sc.next();
			System.out.print("new addr:");
			p.addr = sc.next();
		}
	}
	
	void delPerson(Scanner sc) {
		System.out.println("===����===");
		System.out.print("del name:");
		String name = sc.next();
		dao.delete(name);
	}
}
