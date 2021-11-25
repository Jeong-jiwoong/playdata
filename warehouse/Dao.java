package warehouse;

import java.util.ArrayList;

//1.제품등록 2.검색(이름) 3.검색(번호로) 4.수정(번호로 찾아서 가격수정) 5.삭제(번호로 찾아서 삭제. 출고대기인 상품은 삭제안됨) 6.전체출력 7.입고

public class Dao {
	private ArrayList<Product> datas;

	public Dao() {
		datas = new ArrayList<>();
	}

	public void insert(Product p) {
		datas.add(p);// 파라메터로 받은 product 객체를 arraylist에 추가
	}

	// 검색할 제품 번호를 파람으로 받아 검색된 객체를 반환
	public Product selectByNum(Product p) {
		int idx = datas.indexOf(p);// p는 제품 번호만 갖는 빈 깡통
		if (idx < 0) {
			return null;
		} else {
			return datas.get(idx);
		}
	}

	// 검색할 제품명을 파람으로 받아서 검색한 결과 반환.
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

	// 입출고
	public boolean updateAmount(Product p) {// Product 번호와 입고(+), 출고(-) 수량을 객체에 담아옴
		Product x = selectByNum(p);
		if (p.getAmount() < 0 && x.getAmount() < -p.getAmount()) {// 줄고기능이고 잔여수량 부족
			return false;
		}
		int amount = x.getAmount() + p.getAmount(); // 입출고 처리
		x.setAmount(amount);// 수량 변경
		return true;
	}
}
