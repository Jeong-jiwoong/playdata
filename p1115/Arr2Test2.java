package p1115;

public class Arr2Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		String[][] b = { { "aa", "bb" }, { "cc", "dd" } };

		int i, j;
		System.out.println("a �迭 ���");
		for (i = 0; i < 2; i++) {// a.length
			for (j = 0; j < 3; j++) {// a[i].length
				System.out.println(a[i][j]);
			}
		}
		System.out.println("b �迭 ���");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println(b[i][j]);
			}
		}

		int[][] c = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		System.out.println("�迭 c�� ����: " + c.length); // 3
		System.out.println("�迭 c[0]�� ����: " + c[0].length); // 2
		System.out.println("�迭 c[1]�� ����: " + c[1].length); // 3
		System.out.println("�迭 c[2]�� ����: " + c[2].length); // 4
		System.out.println("c �迭 ���");
		for (i = 0; i < c.length; i++) {
			for (j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
	}

}
