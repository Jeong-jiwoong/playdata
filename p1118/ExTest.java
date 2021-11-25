package p1118;

class Product {
	int num;
	String name;
	int price;
	int amout;
	static int cnt; //��ǰ ���� ī����. �� Ŭ������ ���� ��� ��ü�� �������� ���
	
	Product(){
		cnt++;
		System.out.println(cnt+ "��° ��ü�� ����");
	}
	Product(int num, String name, int price, int amout) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.amout = amout;
		cnt++;
		System.out.println(cnt + "��° ��ü ����");
	}
	
	void printData() {
		System.out.println("�� ��ǰ ��: "+ cnt );
		System.out.println("num: "+ num );
		System.out.println("name: "+ name );
		System.out.println("price: "+ price );
		System.out.println("amout: "+ amout );
	}
}
public class ExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[]p = {new Product(), new Product(1, "�����", 2000, 10), new Product(2, "ĳ����", 3000, 10),
				new Product(3, "���ڱ�", 4000, 10)};
		Product x = new Product();
		System.out.println("�� ��ǰ ��: " + Product.cnt);
		
		for(int i=0; i<p.length; i++) {
			p[i].printData();
		}
	}

}
