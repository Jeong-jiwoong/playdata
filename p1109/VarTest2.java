package p1109;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 12;
		short b = 300;
		int c = 1300;
		long d = 12346;
		float e = 3.14f;
		double f = 45.345345;
		char g = 'x';
		boolean h = true;
		String i = "apple";

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		System.out.println("g=" + g);
		System.out.println("h=" + h);
		System.out.println("i=" + i);
		
		//강제 형변환
		System.out.println("g의 유니코드값:" + (int)g);
		
		int x = 7;
		System.out.println(x/2);    //정수는 정수로 출력된다. 자동으로 형변환이 됨
		System.out.println((float)x/2);   //강제 형변환 + 자동 형변환
		//자동 형변환은 작은 타입에서 큰 타입으로 변환됨
		//자동 형변환은 타입이 다른 값들이 하나의 연산에서 사용될때 타입을 하나로 통일하여 연산해야 하므로 이때 자동으로 형변환이 일어남
		//정수(byte<short<int<long) < 실수(float<double)
		
		 
	}

}
