package p1112;

import java.util.Scanner;

public class SearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, f, l, m;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 1. ����Ž�� : ù ����� ��������(�Ǵ� ã�� ������) ��� ���� ã�� ���� �������� ���ؼ� Ž��
		
		 System.out.println("ã�� �� �Է�"); int num = sc.nextInt();
		
		 /*
		  for (i=0; i<arr.length; i++) { if (num == arr[i]) { System.out.println(i +
		 "��° �濡 �ִ�"); break; } } if (i==10) { System.out.println("����"); }
		 */

		// 2. ���� Ž�� (������ ����Ǿ�� ��)
		// f: ù��° ��ġ , l: ������ ��ġ , m: �߰���ġ(f+1)/2
		// ã�� ���� �߰���ġ�� ������ ������ l�� m-1
		// ã�� ���� �߰���ġ�� ������ ũ�� f�� m+1
		// ã�� ���� �߰���ġ�� ���� ������ ã�� ����
		// f>=l : ��ã����

		f = 0;
		l = arr.length - 1;
		while (f <= l) {
			m = (f + 1) / 2;
			if ( arr[m] > num) {
				l = m - 1;
			} else if (arr[m] < num) {
				f = m + 1;
			} else {
				System.out.println(m + "��° �濡 ����");
				break;
			}
		}
			if(f>l) {
				System.out.println("����");
			}
	}

}
