package study1123;

/*
   회원가입의 Dao 기능
   0. Member 배열 생성
   1. Member 객체 (id / pwd / name / email)를 저장하는 기능
   2. 검색기능
   3. 수정
   4. 삭제
 
 	select(검색) , update(갱신),  insert(삽입), delete(삭제)
 */

public class Dao {
	Member[] members;
	private int cnt;
	
	//vo 객체들을 담을 배열을 선언
	Dao(int size) {
		Member[] members = new Member[size];
	
	}
	
	//Dao 라는 곳은 기능을 제공하는 곳이 아니라, 데이터에 직접 접근하는 곳.
	public void insert(Member m) {
		// 1. 입력: id, pwd 등 Member 객체에 저장될 정보를 입력받는다.
		// 2. 배열에 저장한다.
		if(members.length == cnt) {
			System.out.println("배열이 꽉찼다");
			return;   //함수를 종료한다.
		}
		members[cnt++] = m;
	
	}
	
	public void select(String id) {
		//id를 이용해서 객체의 인덱스 찾기
		//members 내에 객체들을 순차적으로 탐색하며 각 객체의 id와 입력받은 id를 비교한다.
		int idx = -1;   //못찾았음
		for (int i =0; i<cnt; i++) {
			if (members);
		}
	
	}
}
