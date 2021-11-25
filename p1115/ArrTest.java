package p1115;

import java.util.Scanner;

public class ArrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] a = new String[3];
		int i;
		System.out.println("좋아하는 단어 3개 입력");
		for (i =0; i<a.length; i++) {
			a[i] = sc.next();
		}
		for (i=0; i<a.length; i++) {
			System.out.println("str" + i + ": " + a[i]);
		}
	}

}
