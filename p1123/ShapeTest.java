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

//�߻�Ŭ����. ����� �������� ����. ���̵���� ����
abstract class Shape {
	protected String name;// �����̸�
	protected Point[] points; // ��ǥ����

	public Shape(String name, Point[] points) {
		this.name = name;
		this.points = points;
	}

	public abstract void draw();// ���� Ŭ������ draw()�Լ� �����ϵ��� �䱸
}

class Circle extends Shape {// ���� �׸��� Ŭ����
	private int r;// ������

	public Circle(int x, int y, int r) {
		super("circle", new Point[] { new Point(x, y) });
		this.r = r;
	}

	@Override
	public void draw() {// ���� �׸��� ���� ����
		// TODO Auto-generated method stub
		System.out.println(name + "�� �׸���");
		System.out.println("�߽���:" + points[0]);
		System.out.println("������:" + r);
	}

}

class Rectangle extends Shape {//��ǥ 2��
	public Rectangle(Point[] points) {//main���� Point[]�迭�� Point��ü 2�� ��Ƽ� �Ķ���ͷ� ����
		super("Rectangle", points);
		// TODO Auto-generated constructor stub
	}
	//100, 150, 300, 300
	public Rectangle(int x1, int y1, int x2, int y2) {//��ǥ 2�� �Ķ���ͷ� �Է�
		super("Rectangle", new Point[] {new Point(x1, y1), new Point(x2, y2)});	
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(name + "�� �׸���");
		for(Point x:points) {
			System.out.println("��ǥ:" + x);
		}
	}
}
class Triangle extends Shape {//��ǥ 3��

	public Triangle(Point[] points) {
		super("Triangle", points);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(name + "�� �׸���");
		for(Point x:points) {
			System.out.println("��ǥ:" + x);
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
