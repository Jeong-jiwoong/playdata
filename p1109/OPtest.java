package p1109;

public class OPtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 10;
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
		System.out.println("a>b:" + (a > b));
		System.out.println("a>=b:" + (a >= b));
		System.out.println("a<b:" + (a < b));
		System.out.println("a<=b:" + (a <= b));
		System.out.println("a==b:" + (a == b));
		System.out.println("a==c:" + (a == c));
		System.out.println("a!=b:" + (a != b));
		System.out.println("a!=c:" + (a != c));
		
		// && -> and�� ����.  �ϳ��� �ٸ��� false
		System.out.println("a==10 && b==15:" + (a==10 && b==15));
		System.out.println("a==10 && b==20:" + (a==10 && b==20));
		
		// ||-> or�� ����.   �ϳ��� ���̶�� true
		System.out.println("a==10 || b==15:" + (a==10 || b==15));
		
		System.out.println("a:" + a);
		System.out.println("a++:" + a++);  //a�� ��� �� a�� ���� 1 ����
		System.out.println("a:" + a);
		System.out.println("++a:" + ++a);
		
		int z = 10, y;
		y = z++;   //y: 10, z:11
		y = ++z;  //y:12, z:12
		
	}

}
