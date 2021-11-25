package Join;

import java.util.Scanner;

//Menu�� ��� ����
//���� �޴����� ����ڰ� �����ϴ� ����� �޼���� ����
//��κ��� ����� �迭�� ������ ����, �˻�, �����ϴ� �κ��� �ʿ��ѵ� �� ��ɵ��� dao�� ������
//dao�� ����� ����� ����ϱ� ���ؼ� ������� dao ��ü�� �ʿ���

public class Service {
	private Dao dao;
	public static String login_id = null; //�α��� ����
	
	//����� dao ��ü����
	public Service(int size) {
		dao = new Dao(size);
	}
	
	//ȸ������ : �Է��� ������  Member�� ��Ƽ� �迭�� ����
	public void join(Scanner sc) {
		System.out.println("===ȸ������===");
		System.out.print("id: ");
		String id = sc.next();
		
		System.out.print("Pwd: ");
		String pwd = sc.next();
		
		System.out.print("name: ");
		String name = sc.next();
		
		System.out.print("email: ");
		String email = sc.next();
		
		Member m = new Member(id, pwd, name, email);
		dao.insert(m);
	}
	public void login(Scanner sc) {
		if(login_id != null) {
			System.out.println("�̹� �α��� ��. �α��� ��� ���");
			return;
		}
		System.out.println("=== �α��� ===");
		System.out.print("id:");
		String id = sc.next();

		System.out.print("pwd:");
		String pwd = sc.next();

		int idx = dao.selectById(id);
		if (idx < 0) {
			System.out.println("���� ���̵�. �α��� ����");
		} else {
			Member m = dao.selectByIdx(idx);
			if (pwd.equals(m.getPwd())) {
				System.out.println("�α��� ����");
				login_id = id;
			} else {
				System.out.println("�н����� ����ġ. �α��� ����");
			}
		}

	}
	
	public Member printMyInfo(Scanner sc) {
		Member m = null;
		if (login_id == null) {
			System.out.println("�α��� ����");
			login(sc);
		}else {
			int idx = dao.selectById(login_id);
			m = dao.selectByIdx(idx);
			m.printInfo();
		}
		return m;
	}
	
	public void editMyInfo(Scanner sc) {
		Member m = printMyInfo(sc);
		if (m != null) {
			System.out.println("new pwd: ");
			m.setPwd(sc.next());   //�н����� ����
		}
	}
	public void logout(Scanner sc) {
		if (login_id == null) {
			System.out.println("�α��� �ȵ�����");
			return;
		}
		int idx = dao.selectById(login_id);
		dao.delete(idx);  //����
		login_id = null;  //�α׾ƿ� ó��
	}
	
}
