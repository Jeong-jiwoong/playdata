package p1116;

class Test1 {
	//함수타입 int: int값을 반환하는 함수
	//파라메터로 int 2개 받음
	int add(int x, int y) { //지역변수 : x, y, z 지역변수는 함수 안에서만 존재, 함수종료하면 같이 없어진다
		return x + y;
	}
	
	//함수타입 String: String값을 반환하는 함수
	//파라메터로 String 2개 받음
	String addString1(String x, String y) {
		return x + y;
	}
	
	//함수타입 void: 반환값 없다
	//파라메터로 String 2개 받음
	void addString2(String x, String y) {
		System.out.println(x + y);
	}
}

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//위 메서드를 호출하는 코드를 작성하시오
		Test1 t1 = new Test1();
		
		int res1 = t1.add(4, 8);
		System.out.println("res1: " + res1);
		String res2 = t1.addString1("aaa", "bbb");
		System.out.println("res2: " + res2);
		t1.addString2("ccc", "ddd");
		
		
	}

}
