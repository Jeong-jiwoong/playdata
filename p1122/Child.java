package p1122;

public class Child extends Parent {
	//��ӹ���
		//b, c
		//test2(), test3() 
		public int d;
		
		public Child() {
			System.out.println("child ������");
		}
		
		public void childMethod() {
			System.out.println("childMethod");
		}

		
		@Override
		public void printData() {
			// TODO Auto-generated method stub
			super.printData();//super. this�� ����� ��������. super�� �θ� ��ü
			System.out.println("d:" + d);
		
	}
}
