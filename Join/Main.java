package Join;

import java.util.Scanner;

public class Main {
/*
	public static int dao(int x, int y) {
	return x+y;
}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 생성한후에는 객체에 있으므로 객체 이름으로
		//멤버 변수, 메서드 접근
		// this 가 필요없다
		Menu m = new Menu();
		Scanner sc = new Scanner(System.in);
		m.run(sc);
		
		
		/*
		Member m = new Member();
		
		m.setData("aaa", "namea", "aaa@email.com");
		System.out.println(m.getData());
		*/
	
		/*
		Object o = new Object();
		Member m = new Member("a", "b", "c", "d");
		Member m2 = new Member();
		
		//자바의 모든 클래스는 toString()을 갖는다.
		//toString() : 객체를 설명하는 메서드
		//어떤 클래스로 만든 객체냐, 객체가 어느 메모리 할당 받았나
		//"클래스 풀네임(패키지명, 클래스명)@참조값" 형태의 문자열 반환
		//객체를 출력하면 그 객체의 toString()이 반환하는 문자열을 출력
		System.out.println(m);
		System.out.println(m.getId());
		System.out.println(m.getPwd());
		System.out.println(m.getName());
		System.out.println(m.getEmail());
		*/
		
		
		
		//vo : 여러 객체를 저장
		//Member : 여러명의 회원 정보를 담을려고 만듬
		//여러 객체를 담기 위해 배열을 생성
		/*
		Member[] members = new Member[3];
		Member m1 = new Member("aaa", "111", "namea", "aaa@email.com");
		Member m2 = new Member("bbb", "222", "nameb", "aaa@email.com");
		Member m3 = new Member("ccc", "333", "namec", "aaa@email.com");
		
		for(Member m : members) {  //for(변수타입 변수명: 배열){ }
			System.out.println("id: " + m.getId());
			System.out.println("pwd: " + m.getPwd());
			System.out.println("name: " + m.getName());
			System.out.println("email: " + m.getEmail());
			}
			*/
		
		
		
		//사용자에게 제공할 기능 : service
		
		//배열에 담는다 (저장소 작업) : dao
	}

}
