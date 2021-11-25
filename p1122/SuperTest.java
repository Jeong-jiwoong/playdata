package p1122;
//super : 상속관계에서 부모 객체를 나타내는 참조변수    this와 비슷함
class Father{
	public int num=1;
	public String name="aaa";
	
	public void test1() {
		System.out.println("Father 클래스 메서드");
		System.out.println("num: " + num);
		System.out.println("name: " + name);
	}
}
class Son extends Father{
	public String hobby;
	
	public Son(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		//super.test1();
		System.out.println("Son 클래스 메서드");
	}
	
}
public class SuperTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son("낚시");
		s.test1(); //정적결합 : 재정의된 메서드 호출시 데이터 타입을 따라 선택함
		
		Father f = new Father();
		f.test1();  //정적결합 : 재정의된 메서드 호출시 데이터 타입을 따라 선택함
		
		Father fs = new Son("피아노");
		fs.test1();  //동적결합 : 타입이 부모이지만 재정의된 메서드를 호출
	}

}
