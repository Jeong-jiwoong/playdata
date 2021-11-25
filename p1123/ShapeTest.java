package p1123;

class Point {
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

//추상클래스. 상속을 목적으로 만듬. 가이드라인 제공
abstract class Shape {
	protected String name;// 도형이름
	protected Point[] points; // 좌표저장

	public Shape(String name, Point[] points) {
		this.name = name;
		this.points = points;
	}

	public abstract void draw();// 하위 클래스에 draw()함수 구현하도록 요구
}

class Circle extends Shape {// 원을 그리는 클래스
	private int r;// 반지름

	public Circle(int x, int y, int r) {
		super("circle", new Point[] { new Point(x, y) });
		this.r = r;
	}

	@Override
	public void draw() {// 원을 그리는 내용 구현
		// TODO Auto-generated method stub
		System.out.println(name + "을 그린다");
		System.out.println("중심점:" + points[0]);
		System.out.println("반지름:" + r);
	}

}

class Rectangle extends Shape {//좌표 2개
	public Rectangle(Point[] points) {//main에서 Point[]배열에 Point객체 2개 담아서 파라메터로 전달
		super("Rectangle", points);
		// TODO Auto-generated constructor stub
	}
	//100, 150, 300, 300
	public Rectangle(int x1, int y1, int x2, int y2) {//좌표 2쌍 파라메터로 입력
		super("Rectangle", new Point[] {new Point(x1, y1), new Point(x2, y2)});	
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(name + "을 그린다");
		for(Point x:points) {
			System.out.println("좌표:" + x);
		}
	}
}
class Triangle extends Shape {//좌표 3개

	public Triangle(Point[] points) {
		super("Triangle", points);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(name + "을 그린다");
		for(Point x:points) {
			System.out.println("좌표:" + x);
		}
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p1 = new Point[] {new Point(10, 10), new Point(30, 30), new Point(200, 200)};
		Point[] p2 = new Point[] {new Point(10, 10), new Point(30, 30)};
		
		Shape[] shapes = {new Circle(100, 100, 50), 
				new Rectangle(100, 150, 300, 300), 
				new Triangle(p1),
				new Rectangle(p2)};
		
		for(Shape s: shapes) {
			s.draw();
		}
	}
}
