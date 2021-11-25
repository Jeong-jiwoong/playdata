package p1118;

class Product {
	int num;
	String name;
	int price;
	int amout;
	static int cnt; //제품 개수 카운팅. 이 클래스로 만든 모든 객체가 공용으로 사용
	
	Product(){
		cnt++;
		System.out.println(cnt+ "번째 객체가 생성");
	}
	Product(int num, String name, int price, int amout) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.amout = amout;
		cnt++;
		System.out.println(cnt + "번째 객체 생성");
	}
	
	void printData() {
		System.out.println("총 제품 수: "+ cnt );
		System.out.println("num: "+ num );
		System.out.println("name: "+ name );
		System.out.println("price: "+ price );
		System.out.println("amout: "+ amout );
	}
}
public class ExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[]p = {new Product(), new Product(1, "새우깡", 2000, 10), new Product(2, "캐모마일", 3000, 10),
				new Product(3, "감자깡", 4000, 10)};
		Product x = new Product();
		System.out.println("총 제품 수: " + Product.cnt);
		
		for(int i=0; i<p.length; i++) {
			p[i].printData();
		}
	}

}
