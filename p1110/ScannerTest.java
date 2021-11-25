package p1110;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.in : 표준입력(키보드)
		 * System.out : 표준 출력(콘솔)
		 */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch;
		try {
				while((ch=br.read())!='\n') {
							System.out.print((char)ch);
						}
				} catch (IOException e) {
						// TODO Auto-generated catch black
						e.printstackTrance();
					}
		*/
		//키보드 입력값은 문자열로 처리됨. 5도 "5"로 읽음
		//Scanner는 키보드로 입력된 값을 원하는 타입으로 자동 변환하여 전달
		Scanner scanner; //변수 선언
		scanner = new Scanner(System.in); //키보드로부터 읽어들이는 장치 생성
		
		System.out.println("이름을 입력하시오");//출력
		String name = scanner.next(); //공백없는 문자열 단어 하나를 입력받음
		System.out.println("name:" + name);
		
		System.out.println("나이를 입력하시오");
		int age = scanner.nextInt();
		System.out.println("age:" + age);
		
		System.out.println("키를 입력하시오");
		float height = scanner.nextFloat();
		System.out.println("height:" + height);
		
		scanner.close();
		
		
		
	}

}
