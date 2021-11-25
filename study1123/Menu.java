package study1123;

import java.util.Scanner;

// 1. 회원가입  2.로그인  3. 내정보확인  4. 내정보수정  5. 로그아웃  6. 탈퇴  7. 종료
public class Menu {

	public void run(Scanner sc) {
		
		Service s = new Service(10);   //객체 생성 ok
		
		String str = "1. 회원가입  2.로그인  3. 내정보확인  4. 내정보수정  5. 로그아웃  6. 탈퇴  7. 종료 ";
		
		boolean flag = true;
		while (flag) {
			System.out.println(str);
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				// 회원가입 기능
				s.add(sc);
				break;
				
				
			case 7:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			}
		}
	}
}
