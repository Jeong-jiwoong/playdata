package p1118;

class Test{
	int a;   //일반 멤버 변수. 객체 소속
	static int b;   //static 변수. 객체에 독립적으로 동작
	
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
		//System.out.println(Test.a); ->에러 객체 소속이므로 적용안됨
		
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
