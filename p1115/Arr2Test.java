package p1115;

public class Arr2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][3];
		int i, j;

//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//
//		a[1][0] = 4;
//		a[1][1] = 5;
//		a[1][2] = 6;
		int cnt = 1;
		for (i = 0; i < 2; i++) {// 줄수만큼 반복
			for (j = 0; j < 3; j++) {// 칸수만큼 반복
				//a[i][j] = 3 * i + j + 1;
				a[i][j] = cnt++;
			}
		}

//		for (i = 0; i < 2; i++) {// 줄수만큼 반복
//			for (j = 0; j < 3; j++) {// 칸수만큼 반복
//				System.out.println(a[i][j]);
//			}
//		}

		for (i = 0; i < a.length; i++) {//a의 길이:2
			for (j = 0; j < a[i].length; j++) {//각 방의 요소 배열의 길이: 3
				System.out.println(a[i][j]);
			}
		
	}
	}
}
