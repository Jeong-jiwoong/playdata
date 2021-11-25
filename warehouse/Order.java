package warehouse;

//Order(주문번호(자동할당) / 주문제품객체 / 주문수량 / 결제금액 / 결제유무 / 출고유무 )
public class Order {
	private int num;
	private Product p;
	private int amount;//주문수량
	private int total_pay;
	private boolean pay;
	private boolean out;
	private static int cnt;

	public Order() {
	}

	public Order(Product p, int amount, int total_pay) {
		this.num = ++cnt;
		this.p = p;
		this.amount = amount;
		this.total_pay = amount * p.getPrice();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal_pay() {
		return total_pay;
	}

	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public boolean isOut() {
		return out;
	}

	public void setOut(boolean out) {
		this.out = out;
	}

	@Override
	public String toString() {
		return "Order [num=" + num + ", p=" + p + ", amount=" + amount + ", total_pay=" + total_pay + ", pay=" + pay
				+ ", out=" + out + "]";
	}
}
