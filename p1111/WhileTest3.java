package p1111;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("피카추 게임");
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;
		int hp = 35; //밥먹기(5증가), 잠자기(10증가), 놀기(8감소), 운동하기(15감소) / hp가 0이 되면 캐릭터 사망. 게임종료
		int exp = 0; //놀기(5증가), 운동하기(10증가) / 경험치 20마다 레벨 1증가
		int level =1; 
		
		
		while (flag) {
			System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.종료 6.상태확인");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("피카추 밥먹음");
				hp += 5;
				break;
			case 2:
				System.out.println("피카추 잠잠");
				hp += 10;
				break;
			case 3:
				System.out.println("피카추 논다");
				hp -= 8;
				if (hp <= 0) {
					System.out.println("캐릭터사망\n게임종료");
					flag = false;
				break;
				}
				exp += 5;
				if(exp >=20) {
					level++;
					System.out.println("레벨이 1 증가, level:" + level);
					exp -= 20;
				}
			case 4:
				System.out.println("피카추 운동함");
				hp -= 15;
				if (hp <= 0) {
					System.out.println("캐릭터사망\n게임종료");
					flag = false;
				break;
				}
				exp += 10;
				if(exp >=20) {
					level++;
					System.out.println("레벨이 1 증가, level:" + level);
					exp -= 20;
				}
				break;
			case 5:
				System.out.println("게임종료");
				flag = false;
				break;
			case 6:
				System.out.println("hp:" + hp);
				System.out.println("exp:" + exp);
				System.out.println("level:" + level);
				break;
			default:
				System.out.println("잘못된 메뉴");
			}
		}

}
}