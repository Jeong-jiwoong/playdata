package p1111;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ũ�Ⱑ 10�� int �迭�� �����ϰ� 10�� ���ڸ� �Է¹޾Ƽ� �迭�� �Ҵ�
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("���� 10���� �Է��Ͻÿ�");
		for (i =0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("�迭 �� ���");
		for (i =0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		
		//  2. �� ������ �迭 �� ���� �հ� ����� ���
		int sum = 0;
		for ( i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr sum: " + sum);
		
		float avg = (float) sum / arr.length;
		System.out.println("arr avg: " + avg);
		
		// 3. 10�� �濡�� ���� ū ��, ���� ���� ���� ã�Ƽ� ���
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
		
		
		// 4. ã�� ���� ���� �Է¹޾Ƽ� �� ���� ���° �濡 �ִ��� �ε��� ���. ���ٸ� "����" ���
		System.out.println("ã�� �� �Է�");
		int num = sc.nextInt();
		boolean flag = true;
		for ( i=0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(i + "���� �濡 �ִ�");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("����");
		}
		
	}

}
