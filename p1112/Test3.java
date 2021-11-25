package p1112;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cate = "0.의류 1.화장품 2.가전 3.컴퓨터";
		
		String[] cate0 = {"여성복", "남성복", "아동복"};
		String[] cate1 = {"기초화장품", "색조화장품"};
		String[] cate2 = {"냉장고", "세탁기", "TV"};
		String[] cate3 = {"데스크탑", "노트북", "주변기기"};
		
		System.out.println("대 카테고리\n" + cate);
		
		int i;
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String[] data = null; //참조값 복사. 사용자가 선택한 배열(cate0, cate1, cate2, cate3)의 참조값을 담을 변수
		
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
			System.out.println("없는 카테고리");
		}else {
			for (i=0; i< data.length; i++) {
				System.out.print(data[i] + "/");
			}
		}
		System.out.println();
	}

}
