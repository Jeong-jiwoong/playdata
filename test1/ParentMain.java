package test1;

import p1122.Child;
import p1122.Parent;

//protected�� ���� ��Ű�������� ��� public.
//�ٸ� ��Ű�������� ��Ӱ��� Ŭ������ public, ��Ӱ��� �ƴ� Ŭ������ private���� ����

class Test extends Parent{
	public void test() {
		b = 1;
		c = 2;
		test2();
		test3();
	}


//Parent Ŭ������ ��Ӱ��谡 �ƴϱ� ������ protected ����� ����� �� ����.
//����Ϸ��� protected ��� ������ setter, getter�� �����ϰ�, �޼���� public���� ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Parent p = new Parent();
		// p.a = 0  //private ��� �ۿ��� ����
		p.b = 1;  //protected: ���� ��Ű�������� ��Ӱ��� �ƴϾ ����
		p.c = 2;
		
		//p.test1();
		p.test2();
		p.test3();
		
		Child c = new Child();
		//c.a=1;  private�� ��ӹ��� ����
		c.b =10;
		c.c = 20;
		c.test2();
		c.test3();
		*/
	}
}



