package p1110;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("###\n###");
		System.out.println();
		System.out.println("###");
		System.out.println("###");

		for (int i = 0; i < 7; i++) {
			if( i ==3)  {
				System.out.print("\n");
			}else  {
				System.out.print("#");
			}
		}
		System.out.println();
		System.out.println("<2�� for������ ����>");
		int i, j;
		for (i = 0; i <2; i++)  {
			for (j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		int dan = 0;
		for( dan = 2; dan<10; dan++) {       // �ܼ�
			System.out.println("<" + dan + "��>");
			for(i=1; i<10; i++)  {                // �ܿ� �������� ��(1~9)
				System.out.println(dan + "x" + i + "=" + (dan*i));
			}
		}
}
}