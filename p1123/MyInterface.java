package p1123;

public interface MyInterface {
	//public static final int SIZE = 10;	
	int SIZE = 10;	//상수
	
//	public abstract void test1();
//	public abstract void test2();
//	public abstract void test3();

	void test1();
	void test2();
	void test3();
}

 //인터페이스 상속 키워드: implements
class MyClass implements MyInterface{


	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(SIZE);
		//SIZE = 100;  //상수라서 변경 안됨
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
