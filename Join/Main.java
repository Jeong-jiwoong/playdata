package Join;

import java.util.Scanner;

public class Main {
/*
	public static int dao(int x, int y) {
	return x+y;
}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü�� �������Ŀ��� ��ü�� �����Ƿ� ��ü �̸�����
		//��� ����, �޼��� ����
		// this �� �ʿ����
		Menu m = new Menu();
		Scanner sc = new Scanner(System.in);
		m.run(sc);
		
		
		/*
		Member m = new Member();
		
		m.setData("aaa", "namea", "aaa@email.com");
		System.out.println(m.getData());
		*/
	
		/*
		Object o = new Object();
		Member m = new Member("a", "b", "c", "d");
		Member m2 = new Member();
		
		//�ڹ��� ��� Ŭ������ toString()�� ���´�.
		//toString() : ��ü�� �����ϴ� �޼���
		//� Ŭ������ ���� ��ü��, ��ü�� ��� �޸� �Ҵ� �޾ҳ�
		//"Ŭ���� Ǯ����(��Ű����, Ŭ������)@������" ������ ���ڿ� ��ȯ
		//��ü�� ����ϸ� �� ��ü�� toString()�� ��ȯ�ϴ� ���ڿ��� ���
		System.out.println(m);
		System.out.println(m.getId());
		System.out.println(m.getPwd());
		System.out.println(m.getName());
		System.out.println(m.getEmail());
		*/
		
		
		
		//vo : ���� ��ü�� ����
		//Member : �������� ȸ�� ������ �������� ����
		//���� ��ü�� ��� ���� �迭�� ����
		/*
		Member[] members = new Member[3];
		Member m1 = new Member("aaa", "111", "namea", "aaa@email.com");
		Member m2 = new Member("bbb", "222", "nameb", "aaa@email.com");
		Member m3 = new Member("ccc", "333", "namec", "aaa@email.com");
		
		for(Member m : members) {  //for(����Ÿ�� ������: �迭){ }
			System.out.println("id: " + m.getId());
			System.out.println("pwd: " + m.getPwd());
			System.out.println("name: " + m.getName());
			System.out.println("email: " + m.getEmail());
			}
			*/
		
		
		
		//����ڿ��� ������ ��� : service
		
		//�迭�� ��´� (����� �۾�) : dao
	}

}
