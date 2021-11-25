package p1116;

import java.util.Scanner;

class ArrayTes {
	int[] arr = new int[10]; // 방의 개수 10개
	int cnt; // 배열에 저장된 값의 개수

	// 데이터 추가 메서드, 파라메터로 int값 하나 받아서 arr에 추가
	void addData(int x) {
		if (cnt == arr.length) {
			System.out.println("배열이 찼음. 추가 취소");
			return; // 함수종료
		}
		arr[cnt] = x;
		cnt++;

	}

	// arr 배열에 저장된 모든 데이터 출력. 3개 저장 했으면 3출력
	void printAll() {
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	
	//최대값을 찾아서 반환해주는 함수
	int arrMax()  {
		int max = arr[0];
		for (int i=1; i< cnt; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
	return max;	
	}
	
}

public class ArratTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayTes at = new ArrayTes();
		for (int i = 1; i < 6; i++) {
			at.addData(i);
		}
		at.printAll();

		for (int i = 6; i < 16; i++) {
			at.addData(i);
		}
		at.printAll();
		*/
		
		ArrayTes at = new ArrayTes();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int menu, num, m;
		while (flag) {
			System.out.println("1.추가 2.전체출력 3.최대값 4.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("숫자를 입력하시오");
				num = sc.nextInt();
				at.addData(num);
				break;
			case 2:
				at.printAll();
				break;
			case 3:
				m = at.arrMax();
				System.out.println("max:" + m);
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}
}

