package p1124;

import java.util.ArrayList;
class Test2{
	int x;
	int y;
}
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList ����
		ArrayList al = new ArrayList();
		
		//add(): ���� ������ �߰�
		al.add("aaa");
		al.add(2.345);
		al.add(new Test2());
		
		//get(�ε���): �ε��� ��ġ�� �� �ϳ� ����
		String a = (String) al.get(0);
		double b = (double) al.get(1);
		Test2 c = (Test2) al.get(2);
	}

}
