package Join;

import java.util.Scanner;

//사용자의 메뉴 선택에 따라 Service의 메서드 호출
public class Menu {
	private Service service;

	public Menu() {
		service = new Service(10);
	}

	public void run(Scanner sc) {
		String str = "1.회원가입 2.로그인 3.내정보확인 4.내정보수정 5.로그아웃 6.탈퇴 7.종료";
		int menu;
		boolean flag = true;
		while (flag) {
			if (Service.login_id != null) {
				System.out.println(Service.login_id + "님 로그인 중");
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
