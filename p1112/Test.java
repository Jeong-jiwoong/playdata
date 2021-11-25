package p1112;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 크기가 10인 배열을 하나 생성하여 1~20 사이의 짝수만 골라서 배열에 담고 출력하시오.
				int[] arr = new int[10];
				int i, cnt = 0;
				for (i = 1; i < 21; i++) {
					if (i % 2 == 0) {
						arr[cnt++] = i;
					}
					// if (cnt == arr.length) {
					// break;
					// }
				}

				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println();
				///////////////////////////////////////
				for (i = 1; i <= 10; i++) {
					arr[i - 1] = 2 * i;
				}
				
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println();
				
				//배열의 단점: 크기가 고정, 타입 고정 
				String[] names = {"aaa", "bbb", "ccc"};
				int[] scores = {87, 56, 98};
				String grade = "";
				System.out.println("name\tscore\tgrade");
				for (i = 0; i < names.length; i++) {			
					if(scores[i]>=90) {
						grade = "A";
					}else if(scores[i]>=80) {
						grade = "B";
					}else if(scores[i]>=70) {
						grade = "C";
					}else if(scores[i]>=60) {
						grade = "D";
					}else {
						grade = "F";
					}
					
					System.out.println(names[i] + "\t" + scores[i] + "\t" + grade);
				}
	}

}
