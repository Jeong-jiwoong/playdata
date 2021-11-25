package address;

import java.util.Scanner;

//프로그램 외부에 제공할 기능 구현
//대부분 기능이 데이터 처리 필요
public class Service {
	Dao dao = new Dao(); //데이터 처리 객체
	
	//추가 기능 
	void addPerson(Scanner sc) {
		System.out.println("===추가===");
		String name = "";
		int idx = 0;
		do {
			System.out.print("name:");
			name = sc.next();
			idx = dao.select(name);
		} while (idx >= 0);
		System.out.print("tel:");
		String tel = sc.next();
		System.out.print("addr:");
		String addr = sc.next();

		Person p = new Person();
		p.inputData(name, tel, addr);

		dao.insert(p);
	}

	// 전체출력
	void printAll() {
		System.out.println("===전체 출력===");
		Person[] list = dao.selectAll();
		for (Person p : list) {
			p.printData();
		}
	}

	void printPerson(Scanner sc) {
		System.out.println("===이름으로 검색===");
		System.out.print("search name:");
		String name = sc.next();
		int idx = dao.select(name);
		if (idx < 0) {
			System.out.println("없는 이름");
		} else {
			Person p = dao.getByIdx(idx);
			p.printData();
		}
	}

	void editPerson(Scanner sc) {
		System.out.println("===수정===");
		System.out.print("edit name:");
		String name = sc.next();
		int idx = dao.select(name);
		if (idx < 0) {
			System.out.println("없는 이름");
		} else {
			Person p = dao.getByIdx(idx);
			System.out.println("===수정전 info===");
			p.printData();
			System.out.print("new tel:");
			p.tel = sc.next();
			System.out.print("new addr:");
			p.addr = sc.next();
		}
	}
	
	void delPerson(Scanner sc) {
		System.out.println("===삭제===");
		System.out.print("del name:");
		String name = sc.next();
		dao.delete(name);
	}
}
