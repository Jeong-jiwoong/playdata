package p1124;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����");
		String str = null;
		int[] arr = new int[3];
		try {//���ܰ� �߻��� ���� �ڵ带 try ��Ͽ� �ۼ�
			System.out.println("try ��� ��: ���� �߻� ��");
			//int x = 6 / 0;
			//str.concat("hello");
			arr[3] = 3;
			System.out.println("try ��� ��: ���� �߻� ��. ��¾ȵ�");
		} catch (ArithmeticException e) { //try ��Ͽ��� ������ ���� ��ü�� �޴� ���. ���� ��ü�� Ÿ���� ��ġ�ؾ� ����
			System.out.println(e);
		} catch (NullPointerException e) { //try ��Ͽ��� ������ ���� ��ü�� �޴� ���. ���� ��ü�� Ÿ���� ��ġ�ؾ� ����
			System.out.println(e);
		} catch (Exception e) { //try ��Ͽ��� ������ ���� ��ü�� �޴� ���. ���� ��ü�� Ÿ���� ��ġ�ؾ� ����
			System.out.println(e);
		}finally {
			System.out.println("���α׷� ������ �� �� �����");
		}
		System.out.println("���α׷� ��");
	}

}
