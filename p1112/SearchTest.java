package p1112;

import java.util.Scanner;

public class SearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, f, l, m;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 1. 순차탐색 : 첫 방부터 마지막방(또는 찾을 때까지) 모든 값을 찾는 값과 동일한지 비교해서 탐색
		
		 System.out.println("찾을 값 입력"); int num = sc.nextInt();
		
		 /*
		  for (i=0; i<arr.length; i++) { if (num == arr[i]) { System.out.println(i +
		 "번째 방에 있다"); break; } } if (i==10) { System.out.println("없다"); }
		 */

		// 2. 이진 탐색 (정렬이 선행되어야 함)
		// f: 첫번째 위치 , l: 마지막 위치 , m: 중간위치(f+1)/2
		// 찾는 값이 중간위치의 값보다 작으면 l가 m-1
		// 찾는 값이 중간위치의 값보다 크면 f가 m+1
		// 찾는 값이 중간위치의 값과 같으면 찾은 거임
		// f>=l : 못찾았음

		f = 0;
		l = arr.length - 1;
		while (f <= l) {
			m = (f + 1) / 2;
			if ( arr[m] > num) {
				l = m - 1;
			} else if (arr[m] < num) {
				f = m + 1;
			} else {
				System.out.println(m + "번째 방에 있음");
				break;
			}
		}
			if(f>l) {
				System.out.println("없다");
			}
	}

}
