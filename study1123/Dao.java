package study1123;

/*
   ȸ�������� Dao ���
   0. Member �迭 ����
   1. Member ��ü (id / pwd / name / email)�� �����ϴ� ���
   2. �˻����
   3. ����
   4. ����
 
 	select(�˻�) , update(����),  insert(����), delete(����)
 */

public class Dao {
	Member[] members;
	private int cnt;
	
	//vo ��ü���� ���� �迭�� ����
	Dao(int size) {
		Member[] members = new Member[size];
	
	}
	
	//Dao ��� ���� ����� �����ϴ� ���� �ƴ϶�, �����Ϳ� ���� �����ϴ� ��.
	public void insert(Member m) {
		// 1. �Է�: id, pwd �� Member ��ü�� ����� ������ �Է¹޴´�.
		// 2. �迭�� �����Ѵ�.
		if(members.length == cnt) {
			System.out.println("�迭�� ��á��");
			return;   //�Լ��� �����Ѵ�.
		}
		members[cnt++] = m;
	
	}
	
	public void select(String id) {
		//id�� �̿��ؼ� ��ü�� �ε��� ã��
		//members ���� ��ü���� ���������� Ž���ϸ� �� ��ü�� id�� �Է¹��� id�� ���Ѵ�.
		int idx = -1;   //��ã����
		for (int i =0; i<cnt; i++) {
			if (members);
		}
	
	}
}
