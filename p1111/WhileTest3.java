package p1111;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ī�� ����");
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;
		int hp = 35; //��Ա�(5����), ���ڱ�(10����), ���(8����), ��ϱ�(15����) / hp�� 0�� �Ǹ� ĳ���� ���. ��������
		int exp = 0; //���(5����), ��ϱ�(10����) / ����ġ 20���� ���� 1����
		int level =1; 
		
		
		while (flag) {
			System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.���� 6.����Ȯ��");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("��ī�� �����");
				hp += 5;
				break;
			case 2:
				System.out.println("��ī�� ����");
				hp += 10;
				break;
			case 3:
				System.out.println("��ī�� ���");
				hp -= 8;
				if (hp <= 0) {
					System.out.println("ĳ���ͻ��\n��������");
					flag = false;
				break;
				}
				exp += 5;
				if(exp >=20) {
					level++;
					System.out.println("������ 1 ����, level:" + level);
					exp -= 20;
				}
			case 4:
				System.out.println("��ī�� ���");
				hp -= 15;
				if (hp <= 0) {
					System.out.println("ĳ���ͻ��\n��������");
					flag = false;
				break;
				}
				exp += 10;
				if(exp >=20) {
					level++;
					System.out.println("������ 1 ����, level:" + level);
					exp -= 20;
				}
				break;
			case 5:
				System.out.println("��������");
				flag = false;
				break;
			case 6:
				System.out.println("hp:" + hp);
				System.out.println("exp:" + exp);
				System.out.println("level:" + level);
				break;
			default:
				System.out.println("�߸��� �޴�");
			}
		}

}
}