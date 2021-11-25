package test1;

import p1122.Child;
import p1122.Parent;

//protected는 같은 패키지에서는 모두 public.
//다른 패키지에서는 상속관계 클래스엔 public, 상속관계 아닌 클래스엔 private으로 동작

class Test extends Parent{
	public void test() {
		b = 1;
		c = 2;
		test2();
		test3();
	}


//Parent 클래스와 상속관계가 아니기 때문에 protected 멤버를 사용할 수 없다.
//사용하려면 protected 멤버 변수에 setter, getter를 제공하고, 메서드는 public으로 변경
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Parent p = new Parent();
		// p.a = 0  //private 멤버 밖에서 못씀
		p.b = 1;  //protected: 같은 패키지에서는 상속관계 아니어도 보임
		p.c = 2;
		
		//p.test1();
		p.test2();
		p.test3();
		
		Child c = new Child();
		//c.a=1;  private은 상속받지 않음
		c.b =10;
		c.c = 20;
		c.test2();
		c.test3();
		*/
	}
}



