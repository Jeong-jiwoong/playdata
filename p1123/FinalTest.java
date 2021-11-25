package p1123;

final class A{
	public int x;
	public int y;
}//상속금지

/* class B extends A{
 }    -> final로 인해 상속 안됨
*/

class C{
	//상수정의. 정의시 한번만 값 할당 가능
	//초기화 블록과 생성자, 이중에서 한곳에서만 값 할당 가능
	public static final int MAX;      //변수 -> 소문자    / 상수 -> 대문자로 표기
	public int y=5;
	
	// static 초기화 블록. static 멤버 변수 초기화하는 블록
		static {
			MAX = 100;
		}

		// 일반 초기화 블록. 일반 멤버변수 초기화하는 블록
		{
			y = 20;
		}

		public C() {
			y = 300;
		}

		public void test1() {
			// MAX = 100; //에러
			System.out.println("이 메서드는 재정의 가능함");
		}

		public final void test2() {
			System.out.println("이 메서드는 재정의 안됨");
		}
	}

	class D extends C{

		@Override
		public void test1() {//일반 메서드는 재정의 가능
			// TODO Auto-generated method stub
			System.out.println("하위 클래스에서 재정의 함");
		}
		//final 메서드는 재정의가 안됨
//		public final void test2() {
//			System.out.println("이 메서드는 재정의 안됨");
//		}
	}

	public class FinalTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			C c = new C();
			System.out.println("max:" + C.MAX);//상수 읽기
			// C.MAX = 123; //상수이기 때문에 상수정의시, 초기화블록이나, 생성자에서만 한번 값 할당이 가능
			
			System.out.println("y:" + c.y);
			c.y = 400;
	}

}
