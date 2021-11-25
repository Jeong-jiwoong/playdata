package warehouse;

import java.util.ArrayList;

//1.��ǰ��� 2.�˻�(�̸�) 3.�˻�(��ȣ��) 4.����(��ȣ�� ã�Ƽ� ���ݼ���) 5.����(��ȣ�� ã�Ƽ� ����. ������� ��ǰ�� �����ȵ�) 6.��ü��� 7.�԰�

public class Dao {
	private ArrayList<Product> datas;

	public Dao() {
		datas = new ArrayList<>();
	}

	public void insert(Product p) {
		datas.add(p);// �Ķ���ͷ� ���� product ��ü�� arraylist�� �߰�
	}

	// �˻��� ��ǰ ��ȣ�� �Ķ����� �޾� �˻��� ��ü�� ��ȯ
	public Product selectByNum(Product p) {
		int idx = datas.indexOf(p);// p�� ��ǰ ��ȣ�� ���� �� ����
		if (idx < 0) {
			return null;
		} else {
			return datas.get(idx);
		}
	}

	// �˻��� ��ǰ���� �Ķ����� �޾Ƽ� �˻��� ��� ��ȯ.
	public ArrayList selectByName(String name) {
		ArrayList<Product> prods = new ArrayList<>();
//		for(int i=0;i<datas.size();i++) {
//			Product x = datas.get(i);
//		}
		for (Product x : datas) {
			if (name.equals(x.getName())) {
				prods.add(x);
			}
		}
		return prods;
	}

	public boolean deleteByNum(Product p) {
		return datas.remove(p);
	}

	public ArrayList selectAll() {
		return datas;
	}

	// �����
	public boolean updateAmount(Product p) {// Product ��ȣ�� �԰�(+), ���(-) ������ ��ü�� ��ƿ�
		Product x = selectByNum(p);
		if (p.getAmount() < 0 && x.getAmount() < -p.getAmount()) {// �ٰ����̰� �ܿ����� ����
			return false;
		}
		int amount = x.getAmount() + p.getAmount(); // ����� ó��
		x.setAmount(amount);// ���� ����
		return true;
	}
}
