package p1125;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�� ����
		HashMap<String, String> map1 = new HashMap<>();

		//Ű�� �� �߰�
		map1.put("name", "aaa");// �� �׸� �߰�
		map1.put("tel", "111");
		map1.put("addr", "���ѹα�");
		
		//����: �̹� �ִ� Ű�� �� ���� ����
		map1.put("name", "bbb");// bbb�� ����

		//get(Ű). Ű�� �˻�
		System.out.println("<Ű�� �˻�>");
		System.out.println(map1.get("name"));
		System.out.println(map1.get("tel"));
		System.out.println(map1.get("addr"));

		System.out.println("<Ű�� ���� ���ͷ����� ���>");
		for (String key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}

		System.out.println("<values�� ���� ���ͷ����� ���>");
		for (String val : map1.values()) {
			System.out.println(val);
		}
		
		map1.remove("name");
		System.out.println("<Ű�� ���� ���ͷ����� ���>");
		for (String key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
		
		//��ü �׸� ����
		map1.clear();

	}
}
