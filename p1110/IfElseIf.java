package p1110;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("피카츄 게임");
		System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동하기");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu==1) {
			System.out.println("피카츄 밥먹음");
		}else if(menu==2) {
			System.out.println("피카츄 잠잠");
		}else if(menu==3) {
			System.out.println("피카츄 논다");
		}else if(menu==4) {
			System.out.println("피카츄 운동함");
		}else {
			System.out.println("잘못된 메뉴");
		}
	}

}
