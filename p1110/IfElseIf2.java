package p1110;

import java.util.Scanner;

public class IfElseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int score = 0;
		score = sc.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("잘못된 정수");
			return;
		}
		
		if(score >= 90) {
			System.out.println("score:" + score + "/ grade:A");
		}else if(score >= 80 && score < 90) {
			System.out.println("score:" + score + "/ grade:B");
		}else if(score >= 70 && score < 80) {
			System.out.println("score:" + score + "/ grade:C");
		}else if(score >= 60 && score < 70) {
			System.out.println("score:" + score + "/ grade:D");
		}else {
			System.out.println("score:" + score + "/ grade:F");
		}
		
		
		}
	}


