package p1123;

public interface MyInterface {
	//public static final int SIZE = 10;	
	int SIZE = 10;	//���
	
//	public abstract void test1();
//	public abstract void test2();
//	public abstract void test3();

	void test1();
	void test2();
	void test3();
}

 //�������̽� ��� Ű����: implements
class MyClass implements MyInterface{


	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(SIZE);
		//SIZE = 100;  //����� ���� �ȵ�
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
}
