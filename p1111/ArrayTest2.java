package p1111;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; //stack�� ���� �Ҵ����� ������ ������ ��
		
		//�迭 ����
		int[] arr = new int[3]; //���� �ڵ� �ʱ�ȭ�� �ǹǷ� ���� �Ҵ����� �ʾƵ� ����Ʈ���� �������. ���� : 0, ��ü : null, char: �ι���, boolean:false
		
		//�迭 �ʱ�ȭ ����
		int[] a = {1, 2, 3, 4, 5}; //���� ������ �ʱ�ȭ ���� ������ ����
		int[] a2 = new int[] {6, 7, 8};
		float[] b = {3.14f, 45.678f};
		String[] c = {"aaa", "bbb"};
		
		int i;
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(i=0; i<a.length; i++) {
			System.out.println(a[i]);
	}

		for(i=0; i<a2.length; i++) {
			System.out.println(a2[i]);
}
		
		for(i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		for(i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
