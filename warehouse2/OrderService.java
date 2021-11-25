package warehouse2;

import java.util.ArrayList;
import java.util.Scanner;

//주문, 주문목록, 주문취소, 출고대상목록, 결제 
public class OrderService {
	private OrderDao dao;

	public OrderService() {
		dao = new OrderDao();
	}

	public int selectProduct(Scanner sc) {
		System.out.println("주문할 제품을 선택");
		return sc.nextInt();
	}

	public void addOrder(Scanner sc, Product p) {
		if (p == null) {
			System.out.println("잘못된 제품 번호");
			return;
		}
		System.out.println("주문수량");
		int amount = sc.nextInt();
		dao.insert(new Order(p, amount));
	}

	public void printAll(ArrayList<Order> list) {
		for (Order o : list) {
			System.out.println(o);
		}
	}

	public void printOrders() {
		System.out.println("주문목록");
		ArrayList<Order> list = dao.selectAll();
		printAll(list);
	}
}
