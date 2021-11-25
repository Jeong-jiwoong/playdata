package warehouse2;

import java.util.ArrayList;

public class MyDao {
	private ArrayList<Product> datas;

	public MyDao() {
		datas = new ArrayList<>();
	}

	// �߰�
	public void insert(Product p) {
		datas.add(p);// �Ķ���ͷ� ���� product ��ü�� arraylist�� �߰�
	}

	// �Ķ���ͷ� ���� num�� ������ ��ü�� ã�Ƽ� ��ȯ
	public Product selectByNum(int num) {
//		for(int i=0;i<datas.size();i++) {
//			Product x = datas.get(i);
//		}
		for (Product x : datas) {
			if (x.getNum() == num) {
				return x;
			}
		}
		return null;
	}

	// �˻��� ��ǰ���� �Ķ����� �޾Ƽ� �˻��� ��� ��ȯ.
	public ArrayList selectByName(String name) {
		ArrayList<Product> prods = new ArrayList<>();
		for (Product x : datas) {
			if (name.equals(x.getName())) {
				prods.add(x);
			}
		}
		return prods;
	}

	public boolean deleteByNum(int num) {
		for (int i = 0; i < datas.size(); i++) {
			Product x = datas.get(i);
			if (num == x.getNum()) {
				datas.remove(i);//i��° �濡 �ִ� ��ü�� ����
				return true;
			}
		}
		return false;
	}

	public ArrayList selectAll() {
		return datas;
	}

	// �����. �Ķ� amount�� ����� �԰�, ������ ���
	public boolean updateAmount(int num, int amount) {// Product ��ȣ�� �԰�(+), ���(-) ������ ��ü�� ��ƿ�
		Product x = selectByNum(num);
		if (amount < 0 && (x.getAmount() + amount < 0)) {// �ٰ����̰� �ܿ����� ����
			return false;
		}
		int qq = x.getAmount() + amount; // ����� ó��
		x.setAmount(qq);// ���� ����
		return true;
	}
}
