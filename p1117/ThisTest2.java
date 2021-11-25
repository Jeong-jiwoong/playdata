package p1117;

class Person3 {
	String name;
	String tel;
	String addr;

	// 파라메터 있는 생성자를 정의 했다면 디폴트 생성자를 무조건 만들어줘라
	Person3() {
		this("aaa");//this()함수. 다른 생성자 호출
		System.out.println("Person3() 종료");
	}

	Person3(String name) {
		this(name, "111", "대한민국");
		System.out.println("Person3(String name) 종료");
	}

	// 입력 메서드
	Person3(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		System.out.println("Person3(3개) 종료");
	}

	// 출력 메서드
	void printData() {
		System.out.println("name:" + name);
		System.out.println("tel:" + tel);
		System.out.println("addr:" + addr);
	}
}

public class ThisTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person3 p = new Person3();
		p.printData();
	}

}
