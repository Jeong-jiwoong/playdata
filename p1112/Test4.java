package p1112;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i , size, j;
		System.out.println("크기를 입력하시오");
		size = sc.nextInt(); 

		// 한줄 출력
		System.out.println("한줄 출력하기");
		for (i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println();

		// 사각형 출력
		System.out.println("사각형 출력하기");
		for (j = 0; j < size; j++) {
			for (i = 0; i < size; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 직삼각형 출력
		System.out.println("직사각형 출력하기");
		for (i = 1; i <= size; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 역직삼각형 출력
		System.out.println("역직삼각형 출력하기");
		char ch = ' ';
		for ( i=1; i<= size; i++) { // i: 줄번호
			ch = ' ';
			for (j=size; j>0; j--) {  // j: i번 줄에 출력할 별의 개수
				if(i==j) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println();
		}

		// 이등변삼각형 출력
		System.out.println("이등변삼각형 출력하기");
		int m = size/2;      //size는 홀수이어야 함
		for ( i=0; i< m+1; i++) {
			ch = ' ';
			for (j= 0; j < m+i+1; j++) {
				if (j==m-i) {
				ch ='*';
			}
			System.out.print(ch);
		}
		System.out.println();
		
		}
	}

}
