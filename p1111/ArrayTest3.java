package p1111;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i;
		System.out.println("숫자 5개를 입력하시오");
		for (i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		for (i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}
