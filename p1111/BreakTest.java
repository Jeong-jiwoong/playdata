package p1111;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		while(true) {
			System.out.println("숫자를 입력하라. 멈추려면 0입력");
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			System.out.println("입력값:" + x);
		}
	}

}
