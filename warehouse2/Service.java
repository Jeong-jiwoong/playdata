package warehouse2;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
	private MyDao dao;

	public Service() {
		dao = new MyDao();
	}

	public void addProduct(Scanner sc) {
		System.out.println("제품등록");

		System.out.print("name:");
		String name = sc.next();

		System.out.print("price:");
		int price = sc.nextInt();

		System.out.print("amount:");
		int amount = sc.nextInt();

		dao.insert(new Product(name, price, amount));
	}

	// order에서 사용할 기능
	public Product getByNum(int num) {
		return dao.selectByNum(num);
	}

	// 제품 번호로 검색하여 정보 출력. 나는 번호 밖에 모른다. 나머지 정보를 알려달라
	public void printByNum(Scanner sc) {
		System.out.println("제품 번호로 검색");

		System.out.print("num:");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);

		if (p == null) {
			System.out.println("없는 제품 번호");
		} else {
			System.out.println(p);
		}
	}

	public void printByName(Scanner sc) {
		System.out.println("제품 이름으로 검색");

		System.out.print("name:");
		String name = sc.next();

		ArrayList prods = dao.selectByName(name);
		printAll(prods);
	}

	public void printAll(ArrayList<Product> al) {
		System.out.println("데이터 출력");
		if (al.isEmpty()) {
			System.out.println("데이터가 비었다");
		} else {
			for (Product x : al) {
				System.out.println(x);
			}
		}
	}

	// 전체 출력
	public void printProducts() {
		System.out.println("제품 전체 출력");
		ArrayList prods = dao.selectAll();
		printAll(prods);
	}

	// 제품 가격 수정
	public void editPrice(Scanner sc) {
		System.out.println("가격 수정");

		System.out.print("수정할 제품 num:");
		int num = sc.nextInt();

		System.out.print("new price:");
		int price = sc.nextInt();

		Product x = dao.selectByNum(num);
		if (x == null) {
			System.out.println("없는 제품 번호");
		} else {
			x.setPrice(price);
		}
	}

	// 제품 삭제
	public void delProduct(Scanner sc) {
		System.out.println("제품 삭제");

		System.out.print("삭제할 제품 num:");
		int num = sc.nextInt();

		if (dao.deleteByNum(num)) {
			System.out.println("삭제가 완료되었습니다. ");
		} else {
			System.out.println("없는 제품 번호");
		}
	}

	// 입고
	public void in(Scanner sc) {
		System.out.println("입고");

		System.out.print("입고할 제품 num:");
		int num = sc.nextInt();

		System.out.print("입고량:");
		int amount = sc.nextInt();

		boolean flag = dao.updateAmount(num, amount);
		
		if (flag) {
			System.out.println("입고가 완료되었음");
		}
	}

	// 출고(자동처리)
	public void out(ArrayList<Order> orders) {// orders: 출고 대상 주문. 결제true, 출고false
		for (Order o : orders) {
			//출고할 제품 번호
			int num = o.getP().getNum();
			
			//출고량. 음수로 표현
			int amount = -o.getAmount();
			
			//출고처리
			boolean flag = dao.updateAmount(num, amount);
			
			if (flag) {//정상처리
				o.setOut(true);//주문객체의 출고(out)을 true로 변경.
				System.out.println(num + "번 제품의 출고처리가 완료되었음");
			} else {
				System.out.println(num + "번 제품의 수량이 부족하여 출고처리가 취소되었음");
			}
		}
	}
}
