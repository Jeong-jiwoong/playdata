package address;

import java.util.Scanner;

//메뉴 돌리는 클래스
//사용자가 선택한 메뉴 기능을 수행하는 
public class Menu {
	Service service = new Service();
	
	void run(Scanner sc) {
		boolean flag = true;
		int menu;
		while(flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.종료") ;
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				service.addPerson(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				service.printAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
}
