package p1115;

import java.util.Scanner;

public class 성적처리_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3]; // 3명의 이름 (3칸)
		int[][] score = new int[3][5]; // 3명의 번호, 국, 영, 수, 총 (3줄 5칸)
		float[] avg = new float[3]; // 3명의 평균 (3칸)

		// 입출력에 사용할 레이블들
		String[] titles = { "name:", "num:", "kor:", "eng:", "math:", "total", "avg" };

		int i, j, k;

		for (i = 0; i < names.length; i++) {// 사람 수 만큼 반복
			k = 0;// 배열 titles의 인덱스
			System.out.print(titles[k++]); // 이름 입력
			names[i] = sc.next();
			for (j = 0; j < score[i].length - 1; j++) { // score 입력
				System.out.print(titles[k++]);
				score[i][j] = sc.nextInt();
				if (j != 0) {// 번호가 아니면
					score[i][4] += score[i][j];
				}
			}
			avg[i] = (float) score[i][4] / 3;
		}

		// 정렬
		int tmp;
		String tmp_s;
		float tmp_f;

		for (i = 0; i < names.length - 1; i++) {
			for (j = 0; j < names.length - 1 - i; j++) {
				if (score[j][4] < score[j + 1][4]) {
					// 이름 배열 교체
					tmp_s = names[j];
					names[j] = names[j + 1];
					names[j + 1] = tmp_s;

					// score의 모든 칸 교체
					for (k = 0; k < score[j].length; k++) {
						tmp = score[j][k];
						score[j][k] = score[j + 1][k];
						score[j + 1][k] = tmp;
					}

					// avg 교체
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
