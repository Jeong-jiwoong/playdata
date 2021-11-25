package p1110;

public class Problum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 1~100 사이의 소수 (약수가 1과 자신밖에 없는 수)
		 * 2,3,5,7,11,13,17....97까지
		 */
		int i=0;
		int j=0;
		int cnt = 0;
		for(i=2; i<101; i++) {
			cnt=0;
			for (j=2; j<i; j++) {
					if (i % j ==0) {
								cnt++;
	}
   		}
		if(cnt==0) {
			System.out.println(i);
	}
}	
	
		
		/*2. 사각형 출력
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		System.out.println();
		int a,b;
		for (a = 0; a <5; a++)  {
		for (b = 0; b < 5; b++) {
				System.out.print("*");
		}
			System.out.println();
		
		
		
		
		/* 
		 * 3. 삼각형 출력
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
	
			
			
		
		
		
		}
		 /* 4. 삼각형2
		 *         *
		 *        **
		 *      ***
		 *    ****
		 *  *****
		 */
		         
		
		
		
		
		 /*5. 삼각형3
		 *       *
		 *     ***
		 *    *****     
		 */
		
		
	
	}
		}
