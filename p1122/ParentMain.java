package p1122;


	//�ٷ� ���ܰ� Ŭ������ ����. 
	class GrandChild extends Child{
		//b, c, d
		//test2(), test3(), childmethod()
		int e;
		public void GrandChildMethod() {
			System.out.println("GrandChildMethod");
		}
	}

	public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		// p.a = 0  //private ��� �ۿ��� ����
		p.b = 1;  //protected: ���� ��Ű�������� ��Ӱ��� �ƴϾ ����
		p.c = 2;
		
		//p.test1();
		p.test2();
		p.test3();
		p.printData();//a,b,c
		
		Child c = new Child();
		//c.a=1;  private�� ��ӹ��� ����
		c.b =10;
		c.c = 20;
		c.d = 30;
		c.setA(100);
		c.test2();
		c.test3();
		c.printData();//a,b,c,d.�޼��尡 ������ �Ǹ� �θ� �޼���� ȣ����� �ʰ� ������ �� �޼��尡 ȣ���. 
		//������ ������ �θ� �޼��带 ȣ���ϰ� ������ super.�޼���()
	}

}
