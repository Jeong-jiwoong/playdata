package p1109;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1 = "aaa";
		String n2 = "aaa";
		String n3 = new String("aaa");

		// ==는 주소값 비교
		System.out.println("n1==n2:" + (n1 == n2));
		System.out.println("n1==n3:" + (n1 == n3));

		// String의 equals(): 문자열의 내용을 비교하여 같으면 true, 아니면 false반환
		System.out.println("n1.equals(n2):" + (n1.equals(n2)));
		System.out.println("n1.equals(n3):" + (n1.equals(n3)));

		int a = 10, b = 20;
		String x = (a>b)?"a는 b보다 크다":"a는 b보다 크지 않다";
		System.out.println(x);
		
		int c = 4;
		//삼항 연산자를 활용하여 c가 짝수인지 홀수인지 출력
		String y = (c % 2)==0?"짝수입니다":"홀수입니다";
		System.out.println(y);
	}

}
