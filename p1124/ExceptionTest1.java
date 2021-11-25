package p1124;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		String str = null;
		int[] arr = new int[3];
		try {//예외가 발생할 만한 코드를 try 블록에 작성
			System.out.println("try 블록 안: 예외 발생 전");
			//int x = 6 / 0;
			//str.concat("hello");
			arr[3] = 3;
			System.out.println("try 블록 안: 예외 발생 후. 출력안됨");
		} catch (ArithmeticException e) { //try 블록에서 던져진 예외 객체를 받는 블록. 예외 객체의 타입이 일치해야 받음
			System.out.println(e);
		} catch (NullPointerException e) { //try 블록에서 던져진 예외 객체를 받는 블록. 예외 객체의 타입이 일치해야 받음
			System.out.println(e);
		} catch (Exception e) { //try 블록에서 던져진 예외 객체를 받는 블록. 예외 객체의 타입이 일치해야 받음
			System.out.println(e);
		}finally {
			System.out.println("프로그램 끝나기 전 꼭 실행됨");
		}
		System.out.println("프로그램 끝");
	}

}
