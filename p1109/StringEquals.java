package p1109;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1 = "aaa";
		String n2 = "aaa";
		String n3 = new String("aaa");

		// ==�� �ּҰ� ��
		System.out.println("n1==n2:" + (n1 == n2));
		System.out.println("n1==n3:" + (n1 == n3));

		// String�� equals(): ���ڿ��� ������ ���Ͽ� ������ true, �ƴϸ� false��ȯ
		System.out.println("n1.equals(n2):" + (n1.equals(n2)));
		System.out.println("n1.equals(n3):" + (n1.equals(n3)));

		int a = 10, b = 20;
		String x = (a>b)?"a�� b���� ũ��":"a�� b���� ũ�� �ʴ�";
		System.out.println(x);
		
		int c = 4;
		//���� �����ڸ� Ȱ���Ͽ� c�� ¦������ Ȧ������ ���
		String y = (c % 2)==0?"¦���Դϴ�":"Ȧ���Դϴ�";
		System.out.println(y);
	}

}
