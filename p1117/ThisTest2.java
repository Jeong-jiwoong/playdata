package p1117;

class Person3 {
	String name;
	String tel;
	String addr;

	// �Ķ���� �ִ� �����ڸ� ���� �ߴٸ� ����Ʈ �����ڸ� ������ ��������
	Person3() {
		this("aaa");//this()�Լ�. �ٸ� ������ ȣ��
		System.out.println("Person3() ����");
	}

	Person3(String name) {
		this(name, "111", "���ѹα�");
		System.out.println("Person3(String name) ����");
	}

	// �Է� �޼���
	Person3(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		System.out.println("Person3(3��) ����");
	}

	// ��� �޼���
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
