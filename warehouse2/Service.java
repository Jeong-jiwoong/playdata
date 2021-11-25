package warehouse2;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
	private MyDao dao;

	public Service() {
		dao = new MyDao();
	}

	public void addProduct(Scanner sc) {
		System.out.println("��ǰ���");

		System.out.print("name:");
		String name = sc.next();

		System.out.print("price:");
		int price = sc.nextInt();

		System.out.print("amount:");
		int amount = sc.nextInt();

		dao.insert(new Product(name, price, amount));
	}

	// order���� ����� ���
	public Product getByNum(int num) {
		return dao.selectByNum(num);
	}

	// ��ǰ ��ȣ�� �˻��Ͽ� ���� ���. ���� ��ȣ �ۿ� �𸥴�. ������ ������ �˷��޶�
	public void printByNum(Scanner sc) {
		System.out.println("��ǰ ��ȣ�� �˻�");

		System.out.print("num:");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);

		if (p == null) {
			System.out.println("���� ��ǰ ��ȣ");
		} else {
			System.out.println(p);
		}
	}

	public void printByName(Scanner sc) {
		System.out.println("��ǰ �̸����� �˻�");

		System.out.print("name:");
		String name = sc.next();

		ArrayList prods = dao.selectByName(name);
		printAll(prods);
	}

	public void printAll(ArrayList<Product> al) {
		System.out.println("������ ���");
		if (al.isEmpty()) {
			System.out.println("�����Ͱ� �����");
		} else {
			for (Product x : al) {
				System.out.println(x);
			}
		}
	}

	// ��ü ���
	public void printProducts() {
		System.out.println("��ǰ ��ü ���");
		ArrayList prods = dao.selectAll();
		printAll(prods);
	}

	// ��ǰ ���� ����
	public void editPrice(Scanner sc) {
		System.out.println("���� ����");

		System.out.print("������ ��ǰ num:");
		int num = sc.nextInt();

		System.out.print("new price:");
		int price = sc.nextInt();

		Product x = dao.selectByNum(num);
		if (x == null) {
			System.out.println("���� ��ǰ ��ȣ");
		} else {
			x.setPrice(price);
		}
	}

	// ��ǰ ����
	public void delProduct(Scanner sc) {
		System.out.println("��ǰ ����");

		System.out.print("������ ��ǰ num:");
		int num = sc.nextInt();

		if (dao.deleteByNum(num)) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�. ");
		} else {
			System.out.println("���� ��ǰ ��ȣ");
		}
	}

	// �԰�
	public void in(Scanner sc) {
		System.out.println("�԰�");

		System.out.print("�԰��� ��ǰ num:");
		int num = sc.nextInt();

		System.out.print("�԰�:");
		int amount = sc.nextInt();

		boolean flag = dao.updateAmount(num, amount);
		
		if (flag) {
			System.out.println("�԰� �Ϸ�Ǿ���");
		}
	}

	// ���(�ڵ�ó��)
	public void out(ArrayList<Order> orders) {// orders: ��� ��� �ֹ�. ����true, ���false
		for (Order o : orders) {
			//����� ��ǰ ��ȣ
			int num = o.getP().getNum();
			
			//���. ������ ǥ��
			int amount = -o.getAmount();
			
			//���ó��
			boolean flag = dao.updateAmount(num, amount);
			
			if (flag) {//����ó��
				o.setOut(true);//�ֹ���ü�� ���(out)�� true�� ����.
				System.out.println(num + "�� ��ǰ�� ���ó���� �Ϸ�Ǿ���");
			} else {
				System.out.println(num + "�� ��ǰ�� ������ �����Ͽ� ���ó���� ��ҵǾ���");
			}
		}
	}
}
