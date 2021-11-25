package p1122;


	//바로 윗단계 클래스만 생각. 
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
		// p.a = 0  //private 멤버 밖에서 못씀
		p.b = 1;  //protected: 같은 패키지에서는 상속관계 아니어도 보임
		p.c = 2;
		
		//p.test1();
		p.test2();
		p.test3();
		p.printData();//a,b,c
		
		Child c = new Child();
		//c.a=1;  private은 상속받지 않음
		c.b =10;
		c.c = 20;
		c.d = 30;
		c.setA(100);
		c.test2();
		c.test3();
		c.printData();//a,b,c,d.메서드가 재정의 되면 부모 메서드는 호출되지 않고 재정의 된 메서드가 호출됨. 
		//재정의 이전의 부모 메서드를 호출하고 싶으면 super.메서드()
	}

}
