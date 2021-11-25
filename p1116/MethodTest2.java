package p1116;

import java.util.Scanner;

class Calc{ // 사칙연산 클래스
	int num1;
	int num2;
	String op; //+, -, *, /
	int res; //계산결과
	
	//add함수
	void add() {
		res = num1 + num2;
	}
	
	//sub함수
	void sub() {
		res = num1 - num2;
	}
	
	//mu1함수
	void mul() {
		res = num1 * num2;
	}
	
	//dev함수
	void dev() {
		res = num1 / num2;
	}
	
	//결과출력함수
	void printRes() {
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);
	}
	
	
	
}
public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		for (int i = 0; i < 4; i++) {
			System.out.println("정수2개, 연산자(+,-,*,/)를 순서대로 입력");
			int a = sc.nextInt();//num1 입력
			int b = sc.nextInt();//num2 입력
			String op = sc.next();//연산자 입력
			
			switch (op) {
			case "+":
				c.add();
				break;
			case "-":
				c.sub();
				break;
			case "*":
				c.mul();
				break;
			case "/":
				c.dev();
				break;
			default:
				System.out.println("잘못된 연산자");
				break;
			}
			c.printRes();
		}
		
	}

}
