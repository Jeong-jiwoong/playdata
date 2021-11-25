package Join;



//db�۾� ���� Ŭ����
//�迭�� ��ü. �� Ŭ������ �迭�� �߰�, �˻�, ������ ����

public class Dao {
	private Member[] members;
	private int cnt; // �迭�� ����� ������ ����

	public Dao(int size) { // size ���� �迭 ����
		members = new Member[size]; //���� ����������� �� �濡�� null�� �ʱ�ȭ.
		                                                    //����� ���� �ϳ��� ����. cnt=0
		//members[0] = new Member(); -> ��� ��ü�� �ϳ� ������ 0�� �濡 ����
	}

	// �߰� �޼���. �迭�� �߰��� ��ü �Ķ���ͷ� �޾Ƽ� �迭�� �߰�
	public void insert(Member m) { // �Ķ���ʹ� �迭 Ÿ�԰� ����
		// �迭�� á�� Ȯ��
		if (cnt == members.length) {
			System.out.println("�迭 á��. �߰� ���");
			return;
		}
		members[cnt] = m;
		cnt++; // cnt+=1
	}

	// id�� ������ ��ü�� �ε��� ��ȯ
	public int selectById(String id) {
		int idx = -1; // ��ã���� ǥ�ð�
		for (int i = 0; i < cnt; i++) {
			Member m = members[i];
			if (m.getId().equals(id)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	// �Ķ���ͷ� �޾ƿ� ���ȣ�� �� ��ġ�� ��� ��ü�� ��ȯ.
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
