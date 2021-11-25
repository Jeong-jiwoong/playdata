package warehouse;

import java.util.ArrayList;
import java.util.Scanner;

//1.��ǰ��� 2.�˻�(�̸�) 3.�˻�(��ȣ��) 4.����(��ȣ�� ã�Ƽ� ���ݼ���) 5.����(��ȣ�� ã�Ƽ� ����. ������� ��ǰ�� �����ȵ�) 6.��ü��� 7.�԰�
public class Service {
	private Dao dao;

	public Service() {
		dao = new Dao();
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
		Product p = new Product();
		p.setNum(num);
		return dao.selectByNum(p);
	}

	// ��ǰ ��ȣ�� �˻��Ͽ� ���� ���
	public void printByNum(Scanner sc) {
		System.out.println("��ǰ ��ȣ�� �˻�");

		System.out.print("num:");
		int num = sc.nextInt();

		Product p = new Product();
		p.setNum(num);

		p = dao.selectByNum(p);

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

	// ��ü ���
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

	// ��ǰ ���� ����
	public void editPrice(Scanner sc) {
		System.out.println("���� ����");

		System.out.print("������ ��ǰ num:");
		int num = sc.nextInt();

		System.out.print("new price:");
		int price = sc.nextInt();

		Product p = new Product();
		p.setNum(num);// ������ ��ǰ ��ȣ

		Product x = dao.selectByNum(p);
		if (x == null) {
			System.out.println("���� ��ǰ ��ȣ");
		} else {
			x.setPrice(price);
		}
	}

	//��ǰ ����
	public void delProduct(Scanner sc) {
		System.out.println("��ǰ ����");

		System.out.print("������ ��ǰ num:");
		int num = sc.nextInt();

		Product p = new Product();
		p.setNum(num);

		if (dao.deleteByNum(p)) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�. ");
		} else {
			System.out.println("���� ��ǰ ��ȣ");
		}
	}
	
	//�԰�
	public void in(Scanner sc) {
		System.out.println("�԰�");

		System.out.print("�԰��� ��ǰ num:");
		int num = sc.nextInt();
		
		System.out.print("�԰�:");
		int amount = sc.nextInt();

		Product p = new Product();
		p.setNum(num);
		p.setAmount(amount);
		
		boolean flag = dao.updateAmount(p);
		if(flag) {
			System.out.println("�԰� �Ϸ�Ǿ���");
		}
	}
	
	//���(�ڵ�ó��)
	public void out(ArrayList<Order> orders) {//orders: ��� ��� �ֹ�. ����true, ���false
		for(Order o: orders) {
			Product p = new Product();
			
			//���  ��ǰ ��ȣ
			p.setNum(o.getP().getNum());
			
			//������	. ������ ǥ��
			p.setAmount(-o.getAmount());
			
			//���ó��
			boolean flag = dao.updateAmount(p);
			
			if(flag) {  //����ó��
				o.setOut(true); //�ֹ���ü�� ��� true�� ����
				System.out.println(p.getNum()+"�� ��ǰ�� ���ó���� �Ϸ�Ǿ���");
			}else {
				System.out.println(p.getNum()+"�� ��ǰ�� ������ �����Ͽ� ���ó���� ��ҵǾ���");
			}
		}
	}
}
