package p1112;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i , size, j;
		System.out.println("ũ�⸦ �Է��Ͻÿ�");
		size = sc.nextInt(); 

		// ���� ���
		System.out.println("���� ����ϱ�");
		for (i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println();

		// �簢�� ���
		System.out.println("�簢�� ����ϱ�");
		for (j = 0; j < size; j++) {
			for (i = 0; i < size; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���ﰢ�� ���
		System.out.println("���簢�� ����ϱ�");
		for (i = 1; i <= size; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �����ﰢ�� ���
		System.out.println("�����ﰢ�� ����ϱ�");
		char ch = ' ';
		for ( i=1; i<= size; i++) { // i: �ٹ�ȣ
			ch = ' ';
			for (j=size; j>0; j--) {  // j: i�� �ٿ� ����� ���� ����
				if(i==j) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println();
		}

		// �̵�ﰢ�� ���
		System.out.println("�̵�ﰢ�� ����ϱ�");
		int m = size/2;      //size�� Ȧ���̾�� ��
		for ( i=0; i< m+1; i++) {
			ch = ' ';
			for (j= 0; j < m+i+1; j++) {
				if (j==m-i) {
				ch ='*';
			}
			System.out.print(ch);
		}
		System.out.println();
		
		}
	}

}
