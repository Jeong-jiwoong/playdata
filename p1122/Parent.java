package p1122;

public class Parent {
	private int a;// Ŭ���� �ȿ��� �� ���. �ۿ����� �Ⱥ���
	protected int b;// ���� ��Ű�������� ��� ������� ����. �ٸ� ��Ű�������� ��Ӱ��� Ŭ�������� ����.
	public int c;// ��� ��Ű������ ����

	public Parent() {
		System.out.println("parent ������");
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
