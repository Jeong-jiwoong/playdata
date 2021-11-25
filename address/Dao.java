package address;
//Person 객체를 저장하거나 검색, 수정..... 데이터를 처리하는 기능 클래스. 
//주가 메서드
public class Dao {
	Person[] datas = new Person[30];// 빈방 30개 생성
	int cnt;// 빈방에 저장한 데이터 개수. 초기값은 0

	// 주소 하나 추가
	void insert(Person p) {// 추가할 새 이름, 전화, 주소가 담긴 Person 객체 파라메터로 받음
		if (cnt == datas.length) {
			System.out.println("메모리 풀\n추가 취소");
			return;
		}
		datas[cnt++] = p;
	}

	// 전체 검색
	Person[] selectAll() {
		Person[] tmp = new Person[cnt];
		System.arraycopy(datas, 0, tmp, 0, cnt);
		return tmp;
	}

	// 파라메터로 이름을 받아서 배열에 동일한 이름을 갖는 객체가 있으면 그 위치 반환. 없으면 -1반환
	int select(String name) {
		int i;
		for (i = 0; i < cnt; i++) {
			if (name.equals(datas[i].name)) {
				return i; // 찾으면 방 인덱스 반환
			}
		}
		return -1; // 못찾으면 -1반환
	}

	Person getByIdx(int idx) {
		if (idx >= 0) {
			return datas[idx];
		}
		return null;
	}

	void delete(String name) {
		int idx = select(name);
		if (idx < 0) {
			System.out.println("없는 이름");
			return;
		}
		for (int i = idx; i < cnt - 1; i++) {
			datas[i] = datas[i + 1];
		}
		cnt--;
	}

}
