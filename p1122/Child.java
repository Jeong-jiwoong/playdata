package p1122;

public class Child extends Parent {
	//상속받음
		//b, c
		//test2(), test3() 
		public int d;
		
		public Child() {
			System.out.println("child 생성자");
		}
		
		public void childMethod() {
			System.out.println("childMethod");
		}

		
		@Override
		public void printData() {
			// TODO Auto-generated method stub
			super.printData();//super. this랑 비슷한 참조변수. super는 부모 객체
			System.out.println("d:" + d);
		
	}
}
