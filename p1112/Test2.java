package p1112;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cate = {"의류", "화장품", "가전", "컴퓨터"};
		
		String[][] cate2 = {{"여성복", "남성복", "아동복"}, 	{"기초화장품", "색조화장품"}, {"냉장고", "세탁기", "TV"}, {"데스크탑", "노트북", "주변기기"}};
		
		System.out.println("대 카테고리");
		int i;
		for (i=0; i < cate.length; i++) {
			System.out.println(i + ". " + cate[i]);
		}
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c<0 || c>= cate.length) {
			System.out.println("잘못된 번호");
			return;
		}
		for (i=0; i<cate2[c].length; i++) {
			System.out.print(cate2[c][i] + "/");
		}
		System.out.println();
}
}