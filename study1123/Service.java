package study1123;

import java.util.Scanner;

public class Service {

	private Dao dao;
	
	public Service (int size) {
		dao = new Dao(size);
}
	//1.ȸ������ ���
	public void add(Scanner sc) {
		System.out.println("===ȸ������===");
		System.out.print("����� ID: ");
		String id = sc.next();
		
		//pwd, name, email  �Է¹ޱ�
		System.out.println("pwd: ");
		String pwd = sc.next();
		
		System.out.println("name: ");
		String name = sc.next();
		
		System.out.println("email: ");
		String email = sc.next();
		
		//�Է¹��� ������ Member ��ü m �� �ֱ�             -> �����Ұ�.
		Member m = new Member(id, pwd, name, email);  
		
		//�� m�� dao�� insert �ϱ�             ->����
		dao.insert(m);
	}
}
