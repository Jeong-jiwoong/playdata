package p1118;

class Test2 {
	int a;// default
	private int b;
	public int c;
}

class Test3 {
	private String name;
	private int age;
	
	// setter: �ܺο��� private��� ������ ���� ����. �Ķ���ͷ� ���� ���� ��� ������ �Ҵ��ϴ� �޼���.
	void setName(String name) {
		this.name = name;
	}

	// getter: ������� ���� �ܺο��� ���� �� �ְ� �� .��ȯŸ���� ��������� �����ϰ� ��������� �� ���ϸ� ��.
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
