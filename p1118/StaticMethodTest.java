package p1118;
	class Test1{
		int a;
		static int b;
		
		void test1() { //�Ϲ� �޼���� �Ϲ� ��� ���� / static ���� ��� ��� ����
			System.out.println("a: " + a);
			System.out.println("b: " + b);
		}
		
		static void test2() { //static �޼���� �Ϲ� ��� ���� ��� �Ұ� / static ���� ��� ��� ����
		//System.out.println("a: " + a); //�Ϲ� ��� ������ ��ü �����ؾ� �����ϹǷ� �� �޼���� ȣ��� ������ ����.
			System.out.println("b: " + b);
		}
		
		void test3() { //�Ϲݸ޼���� �Ϲݸ޼���, static �޼��� ��� ȣ�� �Ҽ� ����
			test1();
			test2();
		}
		
		static void test4() { //static �޼���� �Ϲݸ޼��� ȣ���Ҽ� ����, static �޼���� ȣ�� �Ҽ� �ִ�.
			//test1();
			test2();
		}
	}
public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ü ���� ��");
		Test.b = 10;
		System.out.println("Test1.b: " + Test1.b);
		Test1.test2();
		Test1.test4();
		
		System.out.println("��ü ���� ��");
		Test1 t = new Test1();
		t.a = 20;
		t.test1();
		Test1.test2();           //t.test2();
		t.test3();
		Test1.test4();          //t.test4();
	}

}
