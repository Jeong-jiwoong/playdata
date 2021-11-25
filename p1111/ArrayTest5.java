package p1111;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 크기가 10인 int 배열을 생성하고 10개 숫자를 입력받아서 배열에 할당
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("정수 10개를 입력하시오");
		for (i =0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("배열 값 출력");
		for (i =0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		
		//  2. 위 생성한 배열 각 방의 합과 평균을 출력
		int sum = 0;
		for ( i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr sum: " + sum);
		
		float avg = (float) sum / arr.length;
		System.out.println("arr avg: " + avg);
		
		// 3. 10개 방에서 가장 큰 값, 가장 작은 값을 찾아서 출력
		int max = arr[0], min = arr[0];
		
		for (i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
		}
		}
		System.out.println("arr max: " + max);
		System.out.println("arr min: " + min);
		
		
		// 4. 찾고 싶은 값을 입력받아서 그 값이 몇번째 방에 있는지 인덱스 출력. 없다면 "업다" 출력
		System.out.println("찾을 값 입력");
		int num = sc.nextInt();
		boolean flag = true;
		for ( i=0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(i + "번쨰 방에 있다");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("없다");
		}
		
	}

}
