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
		for (i = 0; i < 2; i++) {// �ټ���ŭ �ݺ�
			for (j = 0; j < 3; j++) {// ĭ����ŭ �ݺ�
				//a[i][j] = 3 * i + j + 1;
				a[i][j] = cnt++;
			}
		}

//		for (i = 0; i < 2; i++) {// �ټ���ŭ �ݺ�
//			for (j = 0; j < 3; j++) {// ĭ����ŭ �ݺ�
//				System.out.println(a[i][j]);
//			}
//		}

		for (i = 0; i < a.length; i++) {//a�� ����:2
			for (j = 0; j < a[i].length; j++) {//�� ���� ��� �迭�� ����: 3
				System.out.println(a[i][j]);
			}
		
	}
	}
}
