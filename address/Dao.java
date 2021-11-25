package address;
//Person ��ü�� �����ϰų� �˻�, ����..... �����͸� ó���ϴ� ��� Ŭ����. 
//�ְ� �޼���
public class Dao {
	Person[] datas = new Person[30];// ��� 30�� ����
	int cnt;// ��濡 ������ ������ ����. �ʱⰪ�� 0

	// �ּ� �ϳ� �߰�
	void insert(Person p) {// �߰��� �� �̸�, ��ȭ, �ּҰ� ��� Person ��ü �Ķ���ͷ� ����
		if (cnt == datas.length) {
			System.out.println("�޸� Ǯ\n�߰� ���");
			return;
		}
		datas[cnt++] = p;
	}

	// ��ü �˻�
	Person[] selectAll() {
		Person[] tmp = new Person[cnt];
		System.arraycopy(datas, 0, tmp, 0, cnt);
		return tmp;
	}

	// �Ķ���ͷ� �̸��� �޾Ƽ� �迭�� ������ �̸��� ���� ��ü�� ������ �� ��ġ ��ȯ. ������ -1��ȯ
	int select(String name) {
		int i;
		for (i = 0; i < cnt; i++) {
			if (name.equals(datas[i].name)) {
				return i; // ã���� �� �ε��� ��ȯ
			}
		}
		return -1; // ��ã���� -1��ȯ
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
			System.out.println("���� �̸�");
			return;
		}
		for (int i = idx; i < cnt - 1; i++) {
			datas[i] = datas[i + 1];
		}
		cnt--;
	}

}
