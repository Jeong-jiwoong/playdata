package p1116;

import java.util.Scanner;

class Point{
	int x;
	int y;
	
	void setData(int a, int b) {
		x= a;
		y =b;
	}
	 void printPoint() {
		 System.out.println("(" + x + ", " + y + ")");
	 }
}
public class ObjectArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points = new Point[5];//방만 생성됨. 방안에는 모두 null
		Scanner sc = new Scanner(System.in);
		int i, x, y;
		for (i = 0; i < points.length; i++) {
			points[i] = new Point();
			System.out.println("x,y 값 입력");
			x = sc.nextInt();
			y = sc.nextInt();
			points[i].setData(x, y);
		}
		
		for (i = 0; i < points.length; i++) {
			points[i].printPoint();
		}
		
	}

}
