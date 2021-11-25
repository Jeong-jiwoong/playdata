package p1110;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하라");
		num = sc.nextInt();
		if(num%2==0) {
				System.out.println(num + "은 짝수");
		}		else {
					System.out.println(num + "은 홀수");
		}
	}

}
