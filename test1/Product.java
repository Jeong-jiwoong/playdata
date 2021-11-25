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
	
	//printData() 동일.
	//이 객체의 멤버변수 값 확인이 편리
	@Override    //메서드 재정의. 부모 클래스로부터 상속받은 메서드 고쳐스겠음
	public String toString() {  //메서드 프로토타입은 그대로 유지
		return "Product [name=" + name + ", price=" + price + ", amout=" + amout + "]";
	}

	public Product(String name, int price, int amout) {
		super();
		this.name = name;
		this.price = price;
		this.amout = amout;
	}
	
}
