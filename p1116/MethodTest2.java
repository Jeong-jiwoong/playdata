package p1116;

import java.util.Scanner;

class Calc{ // ��Ģ���� Ŭ����
	int num1;
	int num2;
	String op; //+, -, *, /
	int res; //�����
	
	//add�Լ�
	void add() {
		res = num1 + num2;
	}
	
	//sub�Լ�
	void sub() {
		res = num1 - num2;
	}
	
	//mu1�Լ�
	void mul() {
		res = num1 * num2;
	}
	
	//dev�Լ�
	void dev() {
		res = num1 / num2;
	}
	
	//�������Լ�
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
			System.out.println("����2��, ������(+,-,*,/)�� ������� �Է�");
			int a = sc.nextInt();//num1 �Է�
			int b = sc.nextInt();//num2 �Է�
			String op = sc.next();//������ �Է�
			
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
				System.out.println("�߸��� ������");
				break;
			}
			c.printRes();
		}
		
	}

}
