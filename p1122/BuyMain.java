package p1122;

class Product{
	public int price;
	public int point;
}

class Tv extends Product{
	public Tv() {
		price = 100;
		point = 10;
	}
}

class Audio extends Product{
	public	 Audio() {
		price = 200;
		point = 20;
	}
}

class computer extends Product{
	public computer() {
		price = 300;
		point = 30;
	}
}

class Buyer{
	public int money = 1000;
	public int points = 0;
	
	public void buy(Tv tv) {
		if (money >= tv.price) {
			money -= tv.price;
			points += tv.point;
		} else {
			System.out.println("ภÜพืบฮมท");
		}
		System.out.println("ภÜพื: " + money + " / " + points);
	}
	
}
public class BuyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
