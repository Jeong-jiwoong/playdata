package p1115;

import java.util.Scanner;

public class ����ó��_�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3]; // 3���� �̸� (3ĭ)
		int[][] score = new int[3][5]; // 3���� ��ȣ, ��, ��, ��, �� (3�� 5ĭ)
		float[] avg = new float[3]; // 3���� ��� (3ĭ)

		// ����¿� ����� ���̺��
		String[] titles = { "name:", "num:", "kor:", "eng:", "math:", "total", "avg" };

		int i, j, k;

		for (i = 0; i < names.length; i++) {// ��� �� ��ŭ �ݺ�
			k = 0;// �迭 titles�� �ε���
			System.out.print(titles[k++]); // �̸� �Է�
			names[i] = sc.next();
			for (j = 0; j < score[i].length - 1; j++) { // score �Է�
				System.out.print(titles[k++]);
				score[i][j] = sc.nextInt();
				if (j != 0) {// ��ȣ�� �ƴϸ�
					score[i][4] += score[i][j];
				}
			}
			avg[i] = (float) score[i][4] / 3;
		}

		// ����
		int tmp;
		String tmp_s;
		float tmp_f;

		for (i = 0; i < names.length - 1; i++) {
			for (j = 0; j < names.length - 1 - i; j++) {
				if (score[j][4] < score[j + 1][4]) {
					// �̸� �迭 ��ü
					tmp_s = names[j];
					names[j] = names[j + 1];
					names[j + 1] = tmp_s;

					// score�� ��� ĭ ��ü
					for (k = 0; k < score[j].length; k++) {
						tmp = score[j][k];
						score[j][k] = score[j + 1][k];
						score[j + 1][k] = tmp;
					}

					// avg ��ü
					tmp_f = avg[j];
					avg[j] = avg[j + 1];
					avg[j + 1] = tmp_f;
				}
			}
		}

		for (i = 0; i < titles.length; i++) {
			System.out.print(titles[i] + "\t");
		}
		System.out.println();

		for (i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
			for (j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(avg[i] + "\n");
		}
	}

}
