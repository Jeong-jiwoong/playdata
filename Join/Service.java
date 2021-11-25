package Join;

import java.util.Scanner;

//Menu에 기능 제공
//실제 메뉴에서 사용자가 선택하는 기능을 메서드로 구현
//대부분의 기능은 배열에 데이터 저장, 검색, 삭제하는 부분이 필요한데 이 기능들은 dao에 구현됨
//dao의 기능을 끌어다 사용하기 위해서 멤버변로 dao 객체가 필요함

public class Service {
	private Dao dao;
	public static String login_id = null; //로그인 유지
	
	//사용할 dao 객체생성
	public Service(int size) {
		dao = new Dao(size);
	}
	
	//회원가입 : 입력한 정보를  Member에 담아서 배열에 저장
	public void join(Scanner sc) {
		System.out.println("===회원가입===");
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
			System.out.println("이미 로그인 중. 로그인 기능 취소");
			return;
		}
		System.out.println("=== 로그인 ===");
		System.out.print("id:");
		String id = sc.next();

		System.out.print("pwd:");
		String pwd = sc.next();

		int idx = dao.selectById(id);
		if (idx < 0) {
			System.out.println("없는 아이디. 로그인 실패");
		} else {
			Member m = dao.selectByIdx(idx);
			if (pwd.equals(m.getPwd())) {
				System.out.println("로그인 성공");
				login_id = id;
			} else {
				System.out.println("패스워드 불일치. 로그인 실패");
			}
		}

	}
	
	public Member printMyInfo(Scanner sc) {
		Member m = null;
		if (login_id == null) {
			System.out.println("로그인 먼저");
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
			m.setPwd(sc.next());   //패스워드 수정
		}
	}
	public void logout(Scanner sc) {
		if (login_id == null) {
			System.out.println("로그인 안되있음");
			return;
		}
		int idx = dao.selectById(login_id);
		dao.delete(idx);  //삭제
		login_id = null;  //로그아웃 처리
	}
	
}
