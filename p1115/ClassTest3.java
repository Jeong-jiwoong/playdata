package p1115;

//배열을 멤버 변수로 갖는 클래스
class Test3 {
		int[] a;
}

class Point {
	int x;
	int y;
}

class Circle {
	Point point; //중심점 좌표
	int r;            //반지름
}
public class ClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1 = new Test3();
	//t1.a[0] = 1;
	//t1.a[1] = 2;
	//t1.a[2] = 3;
		int i;
		for (i=0; i<t1.a.length; i++ ) {
			t1.a[i] = i + 1;
		}
		for (i=0; i<t1.a.length; i++) {
			System.out.println(t1.a[i]);
		}
		
		Circle c1 = new Circle();
		c1.point.x = 10;
		c1.point.y = 20;
		c1.r = 100;
		
		System.out.println(c1.point.x);
		System.out.println(c1.point.y);
		System.out.println(c1.r);
	}

}
