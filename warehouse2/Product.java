package warehouse2;

public class Product {
	private int num;
	private String name;
	private int price;
	private int amount;
	private static int cnt;

	//�˻�, ����... ��ɿ��� ���
	public Product() {
	}

	//��ǰ ��� ��ɿ����� ���
	public Product(String name, int price, int amount) {
		this.num = ++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	//this(���簴ü)�� �Ķ� obj�� ��
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (p.num == this.num) {// ��ǰ��ȣ�� ������ ���� ��ü
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
