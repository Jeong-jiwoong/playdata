package p1123;

interface Inter1 {
	void test1();
}

interface Inter2 {
	void test2();
}
class MyCls1{
	public void test3() {
		System.out.println("test3");
	}
}
//다중 상속의 예
class MyCls2 extends MyCls1 implements Inter1, Inter2 {

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
	}

}

public class 다중상속테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCls2 obj = new MyCls2();
		obj.test1();
		obj.test2();
		obj.test3();
	}
}
