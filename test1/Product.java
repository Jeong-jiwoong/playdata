package test1;

public class Product {
	private String name;
	private int price;
	private int amout;
	
	public Product() {
		
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

	public int getAmout() {
		return amout;
	}

	public void setAmout(int amout) {
		this.amout = amout;
	}
	
	//printData() ����.
	//�� ��ü�� ������� �� Ȯ���� ��
	@Override    //�޼��� ������. �θ� Ŭ�����κ��� ��ӹ��� �޼��� ���Ľ�����
	public String toString() {  //�޼��� ������Ÿ���� �״�� ����
		return "Product [name=" + name + ", price=" + price + ", amout=" + amout + "]";
	}

	public Product(String name, int price, int amout) {
		super();
		this.name = name;
		this.price = price;
		this.amout = amout;
	}
	
}
