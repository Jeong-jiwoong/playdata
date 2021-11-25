package p1117;

//생성자

//메서드(함수)
//이름은 클래스 이름과 동일
//함수타입이 없다
//마음대로 호출할 수 없고 객체 생성시에만 호출
//객체 초기화
//클래스에 생성자 작성안하면 디폴트 생성자를 컴파일러가 자동으로 만들어줌. 아무동작안함

class Test {
	int x;
	int y;

	// 생성자
	Test() {
		x = 10;// x를 10으로 초기화
		y = 20;// y를 20으로 초기화
	}

	Test(int a) {
		x = a;
		y = 20;
	}

	Test(int a, int b) {
		x = a;
		y = b;
	}

	void print() {
		System.out.println("x:" + x + ", y:" + y);
	}

}
public class ConstTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성
				Test t1 = new Test();
				t1.print();
				Test t2 = new Test(13);
				t2.print();
				Test t3 = new Test(15, 16);
				t3.print();
	}

}
