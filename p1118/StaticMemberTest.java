package p1118;

class Test{
	int a;   //�Ϲ� ��� ����. ��ü �Ҽ�
	static int b;   //static ����. ��ü�� ���������� ����
	
	void addAll() {
		a++;
		b++;
	}
	
	void printAll() {
		System.out.println("a" + a);
		System.out.println("b" + b);
	}
}
public class StaticMemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.b);
		Test.b++;
		//System.out.println(Test.a); ->���� ��ü �Ҽ��̹Ƿ� ����ȵ�
		
		Test t1 = new Test();
		t1.addAll();
		t1.printAll();
		
		Test t2 = new Test();
		t2.addAll();
		t2.printAll();
		
		Test t3 = new Test();
		t3.addAll();
		t3.printAll();
	}

}
