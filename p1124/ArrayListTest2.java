package p1124;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String �� ��� ArrayList ����
		ArrayList<String> al = new ArrayList<>();

		al.add("aaa");// �� ���� �߰�
		al.add("bbb");
		al.add(1, "ccc");// ������ �ε����� ��������
		al.set(0, "abc");// ����

		System.out.println("��ü ���");
		for (String s : al) {
			System.out.println(s);
		}
		
		int idx = 0;

		System.out.println("bbb �˻�");
		if (al.contains("bbb")) {//ArrayList�� ���� �ֳ� Ȯ��. true/false�� ��ȯ
			idx = al.indexOf("bbb");//bbb�� ��ġ ��ȯ
			System.out.println("�˻� ��ġ:" + idx);
			System.out.println("��:" + al.get(idx));//idx ��ġ�� �ִ� �� ����
		} else {
			System.out.println("����");
		}
		
		al.remove(0); //0���濡 �ִ� �� ����
		System.out.println("��ü ���");
		for (String s : al) {
			System.out.println(s);
		}
		
		al.remove("bbb"); //���� ��ü�� ã�Ƽ� ����. equals() ������ �Ǿ� �־�� ��
		System.out.println("��ü ���");
		for (String s : al) {
			System.out.println(s);
		}
		
		al.clear();//��ü ��� ����
		
		if(al.isEmpty()) {
			System.out.println("����Ʈ�� �����");
		}
	}

}
