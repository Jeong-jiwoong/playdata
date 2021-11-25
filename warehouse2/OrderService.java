package warehouse2;

import java.util.ArrayList;
import java.util.Scanner;

//�ֹ�, �ֹ����, �ֹ����, �������, ���� 
public class OrderService {
	private OrderDao dao;

	public OrderService() {
		dao = new OrderDao();
	}

	public int selectProduct(Scanner sc) {
		System.out.println("�ֹ��� ��ǰ�� ����");
		return sc.nextInt();
	}

	public void addOrder(Scanner sc, Product p) {
		if (p == null) {
			System.out.println("�߸��� ��ǰ ��ȣ");
			return;
		}
		System.out.println("�ֹ�����");
		int amount = sc.nextInt();
		dao.insert(new Order(p, amount));
	}

	public void printAll(ArrayList<Order> list) {
		for (Order o : list) {
			System.out.println(o);
		}
	}

	public void printOrders() {
		System.out.println("�ֹ����");
		ArrayList<Order> list = dao.selectAll();
		printAll(list);
	}
}
