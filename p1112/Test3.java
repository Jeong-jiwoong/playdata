package p1112;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cate = "0.�Ƿ� 1.ȭ��ǰ 2.���� 3.��ǻ��";
		
		String[] cate0 = {"������", "������", "�Ƶ���"};
		String[] cate1 = {"����ȭ��ǰ", "����ȭ��ǰ"};
		String[] cate2 = {"�����", "��Ź��", "TV"};
		String[] cate3 = {"����ũž", "��Ʈ��", "�ֺ����"};
		
		System.out.println("�� ī�װ�\n" + cate);
		
		int i;
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String[] data = null; //������ ����. ����ڰ� ������ �迭(cate0, cate1, cate2, cate3)�� �������� ���� ����
		
		switch (c) {
		case 0:
			data = cate0;
			break;
		case 1:
			data = cate1;
			break;
		case 2:
			data = cate2;
			break;
		case 3:
			data = cate3;
			break;
		}
		if (data == null) {
			System.out.println("���� ī�װ�");
		}else {
			for (i=0; i< data.length; i++) {
				System.out.print(data[i] + "/");
			}
		}
		System.out.println();
	}

}
