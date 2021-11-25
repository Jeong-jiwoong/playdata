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
			System.out.println("1.공장 2.편의점 3.종료");
			m = sc.nextInt();
			switch (m) {
			case 1:
				p_run(sc);// 공장 하위 메뉴 놀리는 함수
				break;
			case 2:
				o_run(sc);// 편의점 하위 메뉴 놀리는 함수
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
			System.out.println("1.제품등록 2.번호로검색 3.제품명으로 검색 4.가격수정 5.제품목록 6.입고 7.출고 8.삭제 9.종료");
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
		System.out.println("준비중");
	}
}
