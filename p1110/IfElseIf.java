package p1110;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ī�� ����");
		System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.��ϱ�");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu==1) {
			System.out.println("��ī�� �����");
		}else if(menu==2) {
			System.out.println("��ī�� ����");
		}else if(menu==3) {
			System.out.println("��ī�� ���");
		}else if(menu==4) {
			System.out.println("��ī�� ���");
		}else {
			System.out.println("�߸��� �޴�");
		}
	}

}
