package p1111;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		while(true) {
			System.out.println("���ڸ� �Է��϶�. ���߷��� 0�Է�");
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			System.out.println("�Է°�:" + x);
		}
	}

}
