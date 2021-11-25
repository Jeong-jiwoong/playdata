package p1111;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 크기가 10인 int 배열을 생성하고 10개 숫자를 입력받아서 배열에 할당
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int i;
		for(i=0; i<a.length; i++) {
			System.out.println("a :" + a[i]);
		}
		
		// 2. 위 생성한 배열 각 방의 합과 평균을 출력
		int sum = 0;
		for( i = 0;  i <10; i++) {
			sum += a[i];
		}
		System.out.println("총합: " + sum);
		int j = sum / 10;
		System.out.println("평균: " + j);
		
		// 3. 10개 방에서 가장 큰 값, 가장 작은 값을 찾아서 출력
		
		
		
		
		// 4. 찾고 싶은 값을 입력받아서 그 값이 몇번째 방에 있는지 인덱스 출력. 없다면 "업다" 출력
		
		
		
		
	}

}
