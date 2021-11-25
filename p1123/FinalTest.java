package p1123;

final class A{
	public int x;
	public int y;
}//��ӱ���

/* class B extends A{
 }    -> final�� ���� ��� �ȵ�
*/

class C{
	//�������. ���ǽ� �ѹ��� �� �Ҵ� ����
	//�ʱ�ȭ ��ϰ� ������, ���߿��� �Ѱ������� �� �Ҵ� ����
	public static final int MAX;      //���� -> �ҹ���    / ��� -> �빮�ڷ� ǥ��
	public int y=5;
	
	// static �ʱ�ȭ ���. static ��� ���� �ʱ�ȭ�ϴ� ���
		static {
			MAX = 100;
		}

		// �Ϲ� �ʱ�ȭ ���. �Ϲ� ������� �ʱ�ȭ�ϴ� ���
		{
			y = 20;
		}

		public C() {
			y = 300;
		}

		public void test1() {
			// MAX = 100; //����
			System.out.println("�� �޼���� ������ ������");
		}

		public final void test2() {
			System.out.println("�� �޼���� ������ �ȵ�");
		}
	}

	class D extends C{

		@Override
		public void test1() {//�Ϲ� �޼���� ������ ����
			// TODO Auto-generated method stub
			System.out.println("���� Ŭ�������� ������ ��");
		}
		//final �޼���� �����ǰ� �ȵ�
//		public final void test2() {
//			System.out.println("�� �޼���� ������ �ȵ�");
//		}
	}

	public class FinalTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			C c = new C();
			System.out.println("max:" + C.MAX);//��� �б�
			// C.MAX = 123; //����̱� ������ ������ǽ�, �ʱ�ȭ����̳�, �����ڿ����� �ѹ� �� �Ҵ��� ����
			
			System.out.println("y:" + c.y);
			c.y = 400;
	}

}
