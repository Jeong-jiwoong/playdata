package p1117;

//������

//�޼���(�Լ�)
//�̸��� Ŭ���� �̸��� ����
//�Լ�Ÿ���� ����
//������� ȣ���� �� ���� ��ü �����ÿ��� ȣ��
//��ü �ʱ�ȭ
//Ŭ������ ������ �ۼ����ϸ� ����Ʈ �����ڸ� �����Ϸ��� �ڵ����� �������. �ƹ����۾���

class Test {
	int x;
	int y;

	// ������
	Test() {
		x = 10;// x�� 10���� �ʱ�ȭ
		y = 20;// y�� 20���� �ʱ�ȭ
	}

	Test(int a) {
		x = a;
		y = 20;
	}

	Test(int a, int b) {
		x = a;
		y = b;
	}

	void print() {
		System.out.println("x:" + x + ", y:" + y);
	}

}
public class ConstTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ü ����
				Test t1 = new Test();
				t1.print();
				Test t2 = new Test(13);
				t2.print();
				Test t3 = new Test(15, 16);
				t3.print();
	}

}
