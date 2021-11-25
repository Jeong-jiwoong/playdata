package p1112;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 4, 6, 1, 9, 3, 10, 2, 5, 7 };
		int i, j, k, tmp;
		
		System.out.println("배열원본");
		for (i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		//bubble sort: 2개씩 비교해서 순서가 안 맞으면 바로 교체. 이 동작을 n-1번 반복
		/*
		for(j=0; j<a.length-1; j++) {
		for (i=0; i<a.length - 1 - j; i++) {
			if (a[i] > a[i + 1]) { //값 교체 대상
				tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
		}
		System.out.println("정렬후");
		for (i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		*/
		
		// insert sort: 배열이 비었다고 생각하고 값을 하나씩 자기 자리에 끼워넣는 방식으로 정렬.
		// ex) {5,1,4,6,3,2}  이렇게 있을때 
		//                    i(1~끝): 정렬대상 (자기 자리를 찾을 값의 위치)
		//                    j: i위치의 값이 들어갈 자리를 찾기위해 0~i-1 사이의 위치를 나타낸다
		//                    j의 시작값은 i-1.   j는 0이상일 동안 1씩 감소하면서 앞으로 이동
		
		//          1. i 위치의 값을 tmp 에 옮긴다.(i번 방에 값이 덮어쓰기 때문에)
		//          2. while(j가 0이상이고
	/*
		for (i=1; i <a.length; i++) {
			tmp = a[i];
			j=i-1;
			while(j>=0 && a[j] > tmp) { //tmp보다 큰 값들을 뒤로 한칸씩 이동하여 tmp값이 들어갈 한칸의 자리를 확보
				a[j+1] = a[j];
				j--;
			}
			j++;
			a[j] = tmp;
		}
		System.out.println("정렬후");
		for (i=0; i <a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		*/
		
		
		
		
		// select sort: 
		System.out.println("정렬후");
		for ( i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		
		
		
	}

}
