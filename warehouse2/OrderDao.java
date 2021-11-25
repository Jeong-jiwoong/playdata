package warehouse2;

import java.util.ArrayList;

//주문, 주문목록, 주문취소, 출고대상목록, 결제 
public class OrderDao {
	private ArrayList<Order> orders;

	public OrderDao() {
		orders = new ArrayList<>();
	}

	// 주문추가
	public void insert(Order o) {
		orders.add(o);
	}

	// 전체검색
	public ArrayList selectAll() {
		return orders;
	}

	// 주문번호로 검색하여 객체를 반환
	public Order selectByNum(int num) {
		for (Order o : orders) {
			if (o.getNum() == num) {
				return o;
			}
		}
		return null;
	}

	// 주문번호로 검색하여 위치 반환
	public int selectByNumIdx(int num) {
		for (int i = 0; i < orders.size(); i++) {
			Order o = orders.get(i);
			if (num == o.getNum()) {
				return i;
			}
		}
		return -1;
	}

	// 주문삭제
	public boolean deleteByNum(int num) {
		Order o = selectByNum(num);
		if (o != null) {
			if (!o.isPay()) {// 결제안했을때만 취소
				int idx = selectByNumIdx(num);// 번호로 주문의 위치를 찾음
				orders.remove(idx);// idx 위치의 객체 삭제
				return true;// 정상처리
			}
		}
		return false;
	}

	// 결제할 주문 번호 파람으로 받음
	public boolean updatePay(int num) {
		Order o = selectByNum(num);
		if (o != null) {
			if (!o.isPay()) {// 결제를 안했으면 결제 처리함
				o.setPay(true);
				return true;
			}
		}
		return false;
	}

	// 결제 대상 목록 반환
	public ArrayList<Order> payList() {
		ArrayList<Order> or = new ArrayList<>();
		for (Order o : orders) {
			if (!o.isPay()) { //결제가 되지 않음
				or.add(o);
			}
		}
		return or;
	}

	// 출고 대상 목록 반환
	public ArrayList<Order> outList() {
		ArrayList<Order> or = new ArrayList<>();
		for (Order o : orders) {
			if (o.isPay() && !o.isOut()) {  //결제가 됬으나 출고 되지 않았음
				or.add(o);
			}
		}
		return or;
	}
}
