package p1112;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cate = {"�Ƿ�", "ȭ��ǰ", "����", "��ǻ��"};
		
		String[][] cate2 = {{"������", "������", "�Ƶ���"}, 	{"����ȭ��ǰ", "����ȭ��ǰ"}, {"�����", "��Ź��", "TV"}, {"����ũž", "��Ʈ��", "�ֺ����"}};
		
		System.out.println("�� ī�װ�");
		int i;
		for (i=0; i < cate.length; i++) {
			System.out.println(i + ". " + cate[i]);
		}
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c<0 || c>= cate.length) {
			System.out.println("�߸��� ��ȣ");
			return;
		}
		for (i=0; i<cate2[c].length; i++) {
			System.out.print(cate2[c][i] + "/");
		}
		System.out.println();
}
}