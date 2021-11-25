package picachu;

import java.util.Scanner;

public class Menu {
	//캐릭터 담을 변수
	private PoketMon p;
	
	public void selectCh(Scanner sc) {
		System.out.println("캐릭터 선택\n1.피카츄(기본) 2.꼬부기 3.이상해씨");
		int s = sc.nextInt();
		switch(s) {
			case 1:
				p = new Picachu(); //업캐스팅
				break;
			case 2:
				p = new Gobook(); //업캐스팅
				break;
			case 3:
				p = new Lee(); //업캐스팅
				break;
				default:
				p = new Picachu(); //업캐스팅
				break;
		}
	}
	public void run(Scanner sc) {
		selectCh(sc);
		boolean flag = true;
		while (flag) {
		System.out.println("메뉴\n1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태확인 6.종료 7.특기공격");
		int s = sc.nextInt();
		switch(s) {
		case 1:
			p.eat();
			break;
		case 2:
			p.sleep();
			break;
		case 3:
			flag = p.play();
			break;
		case 4:
			flag = p.exc();
			break;
		case 5:
			p.printState();
			break;
		case 6:
			flag = false;
			break;
		case 7:
			//p의 타입이 무엇인가
			//피카츄 : 백만볼트()
			//꼬부기 : 물대포()
			//이상해씨 : 넝쿨채찍()
			if(p instanceof Picachu) {
				((Picachu)p).백만볼트();
				/*
				Picachu x = (Picachu)p;
				x.백만볼트();      
				*/  //이걸로도 가능
			}else if (p instanceof Gobook) {
				((Gobook)p).물대포();
			}else if (p instanceof Lee) {
				((Lee)p).넝쿨채찍();
			}
			break;
			
	}
}
		System.out.println("게임종료");
	}
	}
