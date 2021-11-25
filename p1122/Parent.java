package p1122;

public class Parent {
	private int a;// 클래스 안에서 만 사용. 밖에서는 안보임
	protected int b;// 같은 패키지에서는 상속 상관없이 보임. 다른 패키지에서는 상속관계 클래스에만 보임.
	public int c;// 모든 패키지에서 보임

	public Parent() {
		System.out.println("parent 생성자");
	}

	private void test1() {
		System.out.println("parent private method");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	protected void test2() {
		System.out.println("protected private method");
	}

	public void test3() {
		System.out.println("public private method");
	}

	public void printData() {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}

}
