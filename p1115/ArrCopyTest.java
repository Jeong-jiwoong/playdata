package p1115;

public class ArrCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };//���� ������
		int[] b = a; //�迭�� ���� ����
		int i;
		System.out.println("�迭 a�� ���");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("�迭 b�� ���");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		
		System.out.println("b[1]�� 20���� ����");
		b[1]=20;
		
		System.out.println("�迭 a�� ���");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("�迭 b�� ���");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		
		//�迭�� ���� ����
		//arraycopy(�����迭,������ �����迭�� ��ġ, ������迭, ���迭�� ��ġ, ������ ��� ����)
		int[] c = new int[] {8,9,10};
		System.arraycopy(a, 1, c, 0, 3);
		
		System.out.println("�迭 c�� ���");
		for (i = 0; i < c.length; i++) {
			System.out.print(c[i] + "\t");
		}
		System.out.println();
		
		System.out.println("c[0]�� 2���� ����");
		c[0]=2;
		
		System.out.println("�迭 a�� ���");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("�迭 c�� ���");
		for (i = 0; i < c.length; i++) {
			System.out.print(c[i] + "\t");
		}
		System.out.println();
	}

}
