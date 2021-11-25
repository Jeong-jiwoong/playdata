package warehouse2;

import java.util.ArrayList;

public class MyDao {
	private ArrayList<Product> datas;

	public MyDao() {
		datas = new ArrayList<>();
	}

	// 추가
	public void insert(Product p) {
		datas.add(p);// 파라메터로 받은 product 객체를 arraylist에 추가
	}

	// 파라메터로 받은 num과 동일한 객체를 찾아서 반환
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

	// 검색할 제품명을 파람으로 받아서 검색한 결과 반환.
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
				datas.remove(i);//i번째 방에 있는 객체를 삭제
				return true;
			}
		}
		return false;
	}

	public ArrayList selectAll() {
		return datas;
	}

	// 입출고. 파람 amount가 양수면 입고, 음수면 출고
	public boolean updateAmount(int num, int amount) {// Product 번호와 입고(+), 출고(-) 수량을 객체에 담아옴
		Product x = selectByNum(num);
		if (amount < 0 && (x.getAmount() + amount < 0)) {// 줄고기능이고 잔여수량 부족
			return false;
		}
		int qq = x.getAmount() + amount; // 입출고 처리
		x.setAmount(qq);// 수량 변경
		return true;
	}
}
