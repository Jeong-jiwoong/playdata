package p1109;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 12;
		short b = 300;
		int c = 1300;
		long d = 12346;
		float e = 3.14f;
		double f = 45.345345;
		char g = 'x';
		boolean h = true;
		String i = "apple";

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		System.out.println("g=" + g);
		System.out.println("h=" + h);
		System.out.println("i=" + i);
		
		//���� ����ȯ
		System.out.println("g�� �����ڵ尪:" + (int)g);
		
		int x = 7;
		System.out.println(x/2);    //������ ������ ��µȴ�. �ڵ����� ����ȯ�� ��
		System.out.println((float)x/2);   //���� ����ȯ + �ڵ� ����ȯ
		//�ڵ� ����ȯ�� ���� Ÿ�Կ��� ū Ÿ������ ��ȯ��
		//�ڵ� ����ȯ�� Ÿ���� �ٸ� ������ �ϳ��� ���꿡�� ���ɶ� Ÿ���� �ϳ��� �����Ͽ� �����ؾ� �ϹǷ� �̶� �ڵ����� ����ȯ�� �Ͼ
		//����(byte<short<int<long) < �Ǽ�(float<double)
		
		 
	}

}
