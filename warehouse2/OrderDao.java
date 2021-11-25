package warehouse2;

import java.util.ArrayList;

//�ֹ�, �ֹ����, �ֹ����, �������, ���� 
public class OrderDao {
	private ArrayList<Order> orders;

	public OrderDao() {
		orders = new ArrayList<>();
	}

	// �ֹ��߰�
	public void insert(Order o) {
		orders.add(o);
	}

	// ��ü�˻�
	public ArrayList selectAll() {
		return orders;
	}

	// �ֹ���ȣ�� �˻��Ͽ� ��ü�� ��ȯ
	public Order selectByNum(int num) {
		for (Order o : orders) {
			if (o.getNum() == num) {
				return o;
			}
		}
		return null;
	}

	// �ֹ���ȣ�� �˻��Ͽ� ��ġ ��ȯ
	public int selectByNumIdx(int num) {
		for (int i = 0; i < orders.size(); i++) {
			Order o = orders.get(i);
			if (num == o.getNum()) {
				return i;
			}
		}
		return -1;
	}

	// �ֹ�����
	public boolean deleteByNum(int num) {
		Order o = selectByNum(num);
		if (o != null) {
			if (!o.isPay()) {// �������������� ���
				int idx = selectByNumIdx(num);// ��ȣ�� �ֹ��� ��ġ�� ã��
				orders.remove(idx);// idx ��ġ�� ��ü ����
				return true;// ����ó��
			}
		}
		return false;
	}

	// ������ �ֹ� ��ȣ �Ķ����� ����
	public boolean updatePay(int num) {
		Order o = selectByNum(num);
		if (o != null) {
			if (!o.isPay()) {// ������ �������� ���� ó����
				o.setPay(true);
				return true;
			}
		}
		return false;
	}

	// ���� ��� ��� ��ȯ
	public ArrayList<Order> payList() {
		ArrayList<Order> or = new ArrayList<>();
		for (Order o : orders) {
			if (!o.isPay()) { //������ ���� ����
				or.add(o);
			}
		}
		return or;
	}

	// ��� ��� ��� ��ȯ
	public ArrayList<Order> outList() {
		ArrayList<Order> or = new ArrayList<>();
		for (Order o : orders) {
			if (o.isPay() && !o.isOut()) {  //������ ������ ��� ���� �ʾ���
				or.add(o);
			}
		}
		return or;
	}
}
