package p1116;

import java.util.Scanner;

class ArrayTes {
	int[] arr = new int[10]; // ���� ���� 10��
	int cnt; // �迭�� ����� ���� ����

	// ������ �߰� �޼���, �Ķ���ͷ� int�� �ϳ� �޾Ƽ� arr�� �߰�
	void addData(int x) {
		if (cnt == arr.length) {
			System.out.println("�迭�� á��. �߰� ���");
			return; // �Լ�����
		}
		arr[cnt] = x;
		cnt++;

	}

	// arr �迭�� ����� ��� ������ ���. 3�� ���� ������ 3���
	void printAll() {
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	
	//�ִ밪�� ã�Ƽ� ��ȯ���ִ� �Լ�
	int arrMax()  {
		int max = arr[0];
		for (int i=1; i< cnt; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
	return max;	
	}
	
}

public class ArratTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayTes at = new ArrayTes();
		for (int i = 1; i < 6; i++) {
			at.addData(i);
		}
		at.printAll();

		for (int i = 6; i < 16; i++) {
			at.addData(i);
		}
		at.printAll();
		*/
		
		ArrayTes at = new ArrayTes();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int menu, num, m;
		while (flag) {
			System.out.println("1.�߰� 2.��ü��� 3.�ִ밪 4.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("���ڸ� �Է��Ͻÿ�");
				num = sc.nextInt();
				at.addData(num);
				break;
			case 2:
				at.printAll();
				break;
			case 3:
				m = at.arrMax();
				System.out.println("max:" + m);
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}
}

