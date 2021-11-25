package p1115;

public class Arr2Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		String[][] b = { { "aa", "bb" }, { "cc", "dd" } };

		int i, j;
		System.out.println("a 배열 요소");
		for (i = 0; i < 2; i++) {// a.length
			for (j = 0; j < 3; j++) {// a[i].length
				System.out.println(a[i][j]);
			}
		}
		System.out.println("b 배열 요소");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println(b[i][j]);
			}
		}

		int[][] c = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		System.out.println("배열 c의 길이: " + c.length); // 3
		System.out.println("배열 c[0]의 길이: " + c[0].length); // 2
		System.out.println("배열 c[1]의 길이: " + c[1].length); // 3
		System.out.println("배열 c[2]의 길이: " + c[2].length); // 4
		System.out.println("c 배열 요소");
		for (i = 0; i < c.length; i++) {
			for (j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
	}

}
