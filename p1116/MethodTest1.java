package p1116;

class Test1 {
	//�Լ�Ÿ�� int: int���� ��ȯ�ϴ� �Լ�
	//�Ķ���ͷ� int 2�� ����
	int add(int x, int y) { //�������� : x, y, z ���������� �Լ� �ȿ����� ����, �Լ������ϸ� ���� ��������
		return x + y;
	}
	
	//�Լ�Ÿ�� String: String���� ��ȯ�ϴ� �Լ�
	//�Ķ���ͷ� String 2�� ����
	String addString1(String x, String y) {
		return x + y;
	}
	
	//�Լ�Ÿ�� void: ��ȯ�� ����
	//�Ķ���ͷ� String 2�� ����
	void addString2(String x, String y) {
		System.out.println(x + y);
	}
}

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� �޼��带 ȣ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		Test1 t1 = new Test1();
		
		int res1 = t1.add(4, 8);
		System.out.println("res1: " + res1);
		String res2 = t1.addString1("aaa", "bbb");
		System.out.println("res2: " + res2);
		t1.addString2("ccc", "ddd");
		
		
	}

}
