package p1116;

class A {
	
}
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü �񱳴� equals() ��
				// ��ü �񱳸� == �ϸ� ��ü ��������� ���ϴ� ���� �ƴ϶� ������ ��

				String a = "aaa";
				String b = "bbb";
				String c = new String("aaa");
				String d = "aaa";

				System.out.println("a:" + a);
				System.out.println("b:" + b);
				System.out.println("c:" + c);
				System.out.println("d:" + d);
				System.out.println("a==b:" + (a == b));
				System.out.println("a==c:" + (a == c));
				System.out.println("a==d:" + (a == d));
				System.out.println("a.equals(b):" + a.equals(b));
				System.out.println("a.equals(c):" + a.equals(c));
				System.out.println("a.equals(d):" + a.equals(d));

				if(a.equals(c)) {
					//a�� c�� ������ ������ ����
				}
	}

}
