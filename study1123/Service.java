package study1123;

import java.util.Scanner;

public class Service {

	private Dao dao;
	
	public Service (int size) {
		dao = new Dao(size);
}
	//1.회원가입 기능
	public void add(Scanner sc) {
		System.out.println("===회원가입===");
		System.out.print("사용할 ID: ");
		String id = sc.next();
		
		//pwd, name, email  입력받기
		System.out.println("pwd: ");
		String pwd = sc.next();
		
		System.out.println("name: ");
		String name = sc.next();
		
		System.out.println("email: ");
		String email = sc.next();
		
		//입력받은 내용을 Member 객체 m 에 넣기             -> 공부할것.
		Member m = new Member(id, pwd, name, email);  
		
		//그 m을 dao에 insert 하기             ->공부
		dao.insert(m);
	}
}
