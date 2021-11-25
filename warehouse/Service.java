package warehouse;

import java.util.ArrayList;
import java.util.Scanner;

//1.제품등록 2.검색(이름) 3.검색(번호로) 4.수정(번호로 찾아서 가격수정) 5.삭제(번호로 찾아서 삭제. 출고대기인 상품은 삭제안됨) 6.전체출력 7.입고
public class Service {
	private Dao dao;

	public Service() {
		dao = new Dao();
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
		Product p = new Product();
		p.setNum(num);
		return dao.selectByNum(p);
	}

	// 제품 번호로 검색하여 정보 출력
	public void printByNum(Scanner sc) {
		System.out.println("제품 번호로 검색");

		System.out.print("num:");
		int num = sc.nextInt();

		Product p = new Product();
		p.setNum(num);

		p = dao.selectByNum(p);

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

	// 전체 출력
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

	// 제품 가격 수정
	public void editPrice(Scanner sc) {
		System.out.println("가격 수정");

		System.out.print("수정할 제품 num:");
		int num = sc.nextInt();

		System.out.print("new price:");
		int price = sc.nextInt();

		Product p = new Product();
		p.setNum(num);// 수정할 제품 번호

		Product x = dao.selectByNum(p);
		if (x == null) {
			System.out.println("없는 제품 번호");
		} else {
			x.setPrice(price);
		}
	}

	//제품 삭제
	public void delProduct(Scanner sc) {
		System.out.println("제품 삭제");

		System.out.print("삭제할 제품 num:");
		int num = sc.nextInt();

		Product p = new Product();
		p.setNum(num);

		if (dao.deleteByNum(p)) {
			System.out.println("삭제가 완료되었습니다. ");
		} else {
			System.out.println("없는 제품 번호");
		}
	}
	
	//입고
	public void in(Scanner sc) {
		System.out.println("입고");

		System.out.print("입고할 제품 num:");
		int num = sc.nextInt();
		
		System.out.print("입고량:");
		int amount = sc.nextInt();

		Product p = new Product();
		p.setNum(num);
		p.setAmount(amount);
		
		boolean flag = dao.updateAmount(p);
		if(flag) {
			System.out.println("입고가 완료되었음");
		}
	}
	
	//출고(자동처리)
	public void out(ArrayList<Order> orders) {//orders: 출고 대상 주문. 결제true, 출고false
		for(Order o: orders) {
			Product p = new Product();
			
			//출고  제품 번호
			p.setNum(o.getP().getNum());
			
			//출고수량	. 음수로 표현
			p.setAmount(-o.getAmount());
			
			//출고처리
			boolean flag = dao.updateAmount(p);
			
			if(flag) {  //정상처리
				o.setOut(true); //주문객체의 출고를 true로 변경
				System.out.println(p.getNum()+"번 제품의 출고처리가 완료되었음");
			}else {
				System.out.println(p.getNum()+"번 제품의 수량이 부족하여 출고처리가 취소되었음");
			}
		}
	}
}
