package p1118;
	class Test1{
		int a;
		static int b;
		
		void test1() { //일반 메서드는 일반 멤버 변수 / static 변수 모두 사용 가능
			System.out.println("a: " + a);
			System.out.println("b: " + b);
		}
		
		static void test2() { //static 메서드는 일반 멤버 변수 사용 불가 / static 변수 모두 사용 가능
		//System.out.println("a: " + a); //일반 멤버 변수는 객체 생성해야 존재하므로 이 메서드는 호출시 없을수 있음.
			System.out.println("b: " + b);
		}
		
		void test3() { //일반메서드는 일반메서드, static 메서드 모두 호출 할수 있음
			test1();
			test2();
		}
		
		static void test4() { //static 메서드는 일반메서드 호출할수 없고, static 메서드는 호출 할수 있다.
			//test1();
			test2();
		}
	}
public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("객체 생성 전");
		Test.b = 10;
		System.out.println("Test1.b: " + Test1.b);
		Test1.test2();
		Test1.test4();
		
		System.out.println("객체 생성 후");
		Test1 t = new Test1();
		t.a = 20;
		t.test1();
		Test1.test2();           //t.test2();
		t.test3();
		Test1.test4();          //t.test4();
	}

}
