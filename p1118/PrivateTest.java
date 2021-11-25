package p1118;

class Test2 {
	int a;// default
	private int b;
	public int c;
}

class Test3 {
	private String name;
	private int age;
	
	// setter: 외부에서 private멤버 변수의 값을 설정. 파라메터로 받은 값을 멤버 변수에 할당하는 메서드.
	void setName(String name) {
		this.name = name;
	}

	// getter: 멤버변수 값을 외부에서 읽을 수 있게 함 .반환타입은 멤버변수와 동일하고 멤버변수의 값 리턴만 함.
	String getName() {
		return name;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}
}

public class PrivateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t1 = new Test2();
		t1.a = 1;
		// t1.b = 2;
		t1.c = 3;

		Test3 tt = new Test3();
		// tt.name="aaa";
		tt.setName("aaa");
		// System.out.println(tt.name);
		System.out.println("name:" + tt.getName());
		tt.setAge(10);
		System.out.println("age:" + tt.getAge());
	}

}
