package warehouse2;

public class Product {
	private int num;
	private String name;
	private int price;
	private int amount;
	private static int cnt;

	//검색, 수정... 기능에서 사용
	public Product() {
	}

	//제품 등록 기능에서만 사용
	public Product(String name, int price, int amount) {
		this.num = ++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	//this(현재객체)와 파람 obj를 비교
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (p.num == this.num) {// 제품번호가 같으면 같은 객체
				return true;
			}
		}
		return false;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}

}
