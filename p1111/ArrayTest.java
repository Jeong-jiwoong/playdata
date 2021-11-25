package p1111;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];

		// 배열 방에 값 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// 배열 값 출력
		System.out.println("a[0]:" + a[0]);
		System.out.println("a[1]:" + a[1]);
		System.out.println("a[2]:" + a[2]);
		System.out.println("a[3]:" + a[3]);
		System.out.println("a[4]:" + a[4]);

		for (int i = 0; i < 5; i++) { // <-배열 방에 값 할당 동일
			a[i] = i + 1;
		}
		for (int i = 0; i < 5; i++) { // <- 배열 값 출력 동일
			System.out.println("a[" + i + "]:" + a[i]);

		}

		int i = 0;
		float[] b = new float[3];
		b[0] = 3.45f;
		b[1] = 1.45f;
		b[2] = 2.45f;

		for (i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]:" + b[i]);
		}

		String[] c = new String[2];
		c[0] = "aaa";
		c[1] = "bbb";

		for (i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "]" + c[i]);

		}
	}
}
