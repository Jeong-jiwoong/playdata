package p1111;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; //stack은 값을 할당하지 않으면 쓰레기 값
		
		//배열 생성
		int[] arr = new int[3]; //힙은 자동 초기화가 되므로 값을 할당하지 않아도 디폴트값이 들어있음. 숫자 : 0, 객체 : null, char: 널문자, boolean:false
		
		//배열 초기화 생성
		int[] a = {1, 2, 3, 4, 5}; //방의 개수는 초기화 값의 개수로 결정
		int[] a2 = new int[] {6, 7, 8};
		float[] b = {3.14f, 45.678f};
		String[] c = {"aaa", "bbb"};
		
		int i;
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(i=0; i<a.length; i++) {
			System.out.println(a[i]);
	}

		for(i=0; i<a2.length; i++) {
			System.out.println(a2[i]);
}
		
		for(i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		for(i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
