package p1115;

public class ArrCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };//힙에 생성됨
		int[] b = a; //배열의 얕은 복사
		int i;
		System.out.println("배열 a의 요소");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("배열 b의 요소");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		
		System.out.println("b[1]을 20으로 변경");
		b[1]=20;
		
		System.out.println("배열 a의 요소");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("배열 b의 요소");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		
		//배열의 깊은 복사
		//arraycopy(원본배열,복사할 원본배열의 위치, 복사대상배열, 대상배열의 위치, 복사할 요소 개수)
		int[] c = new int[] {8,9,10};
		System.arraycopy(a, 1, c, 0, 3);
		
		System.out.println("배열 c의 요소");
		for (i = 0; i < c.length; i++) {
			System.out.print(c[i] + "\t");
		}
		System.out.println();
		
		System.out.println("c[0]을 2으로 변경");
		c[0]=2;
		
		System.out.println("배열 a의 요소");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("배열 c의 요소");
		for (i = 0; i < c.length; i++) {
			System.out.print(c[i] + "\t");
		}
		System.out.println();
	}

}
