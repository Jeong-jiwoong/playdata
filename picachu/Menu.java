package picachu;

import java.util.Scanner;

public class Menu {
	//ĳ���� ���� ����
	private PoketMon p;
	
	public void selectCh(Scanner sc) {
		System.out.println("ĳ���� ����\n1.��ī��(�⺻) 2.���α� 3.�̻��ؾ�");
		int s = sc.nextInt();
		switch(s) {
			case 1:
				p = new Picachu(); //��ĳ����
				break;
			case 2:
				p = new Gobook(); //��ĳ����
				break;
			case 3:
				p = new Lee(); //��ĳ����
				break;
				default:
				p = new Picachu(); //��ĳ����
				break;
		}
	}
	public void run(Scanner sc) {
		selectCh(sc);
		boolean flag = true;
		while (flag) {
		System.out.println("�޴�\n1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.���� 7.Ư�����");
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
			//p�� Ÿ���� �����ΰ�
			//��ī�� : �鸸��Ʈ()
			//���α� : ������()
			//�̻��ؾ� : ����ä��()
			if(p instanceof Picachu) {
				((Picachu)p).�鸸��Ʈ();
				/*
				Picachu x = (Picachu)p;
				x.�鸸��Ʈ();      
				*/  //�̰ɷε� ����
			}else if (p instanceof Gobook) {
				((Gobook)p).������();
			}else if (p instanceof Lee) {
				((Lee)p).����ä��();
			}
			break;
			
	}
}
		System.out.println("��������");
	}
	}
