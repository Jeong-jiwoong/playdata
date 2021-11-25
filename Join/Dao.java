package Join;



//db작업 전담 클래스
//배열로 대체. 이 클래스는 배열에 추가, 검색, 삭제만 구현

public class Dao {
	private Member[] members;
	private int cnt; // 배열의 저장된 데이터 개수

	public Dao(int size) { // size 만한 배열 생성
		members = new Member[size]; //방은 만들어지지만 각 방에는 null로 초기화.
		                                                    //저장된 값이 하나도 없다. cnt=0
		//members[0] = new Member(); -> 멤버 객체를 하나 생성해 0번 방에 저장
	}

	// 추가 메서드. 배열에 추가할 객체 파라메터로 받아서 배열에 추가
	public void insert(Member m) { // 파라메터는 배열 타입과 동일
		// 배열이 찼나 확인
		if (cnt == members.length) {
			System.out.println("배열 찼음. 추가 취소");
			return;
		}
		members[cnt] = m;
		cnt++; // cnt+=1
	}

	// id가 동일한 객체의 인덱스 반환
	public int selectById(String id) {
		int idx = -1; // 못찾았음 표시값
		for (int i = 0; i < cnt; i++) {
			Member m = members[i];
			if (m.getId().equals(id)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	// 파라메터로 받아온 방번호로 그 위치의 멤버 객체를 반환.
	public Member selectByIdx(int idx) {
		Member m = null;
		if (idx >= 0) {
			m = members[idx];
		}
		return m;
	}
	public void delete(int idx) {
		if (idx >= 0) {
			for (int i = idx; i< cnt - 1; i++) {
				members[i] = members[i+1];
			}
		}
	}
	
}
