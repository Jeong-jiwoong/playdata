package p1112;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 4, 6, 1, 9, 3, 10, 2, 5, 7 };
		int i, j, k, tmp;
		
		System.out.println("�迭����");
		for (i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		//bubble sort: 2���� ���ؼ� ������ �� ������ �ٷ� ��ü. �� ������ n-1�� �ݺ�
		/*
		for(j=0; j<a.length-1; j++) {
		for (i=0; i<a.length - 1 - j; i++) {
			if (a[i] > a[i + 1]) { //�� ��ü ���
				tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
		}
		System.out.println("������");
		for (i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		*/
		
		// insert sort: �迭�� ����ٰ� �����ϰ� ���� �ϳ��� �ڱ� �ڸ��� �����ִ� ������� ����.
		// ex) {5,1,4,6,3,2}  �̷��� ������ 
		//                    i(1~��): ���Ĵ�� (�ڱ� �ڸ��� ã�� ���� ��ġ)
		//                    j: i��ġ�� ���� �� �ڸ��� ã������ 0~i-1 ������ ��ġ�� ��Ÿ����
		//                    j�� ���۰��� i-1.   j�� 0�̻��� ���� 1�� �����ϸ鼭 ������ �̵�
		
		//          1. i ��ġ�� ���� tmp �� �ű��.(i�� �濡 ���� ����� ������)
		//          2. while(j�� 0�̻��̰�
	/*
		for (i=1; i <a.length; i++) {
			tmp = a[i];
			j=i-1;
			while(j>=0 && a[j] > tmp) { //tmp���� ū ������ �ڷ� ��ĭ�� �̵��Ͽ� tmp���� �� ��ĭ�� �ڸ��� Ȯ��
				a[j+1] = a[j];
				j--;
			}
			j++;
			a[j] = tmp;
		}
		System.out.println("������");
		for (i=0; i <a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		*/
		
		
		
		
		// select sort: 
		System.out.println("������");
		for ( i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		
		
		
	}

}
