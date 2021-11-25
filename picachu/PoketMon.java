package picachu;

//다형성
public abstract class PoketMon { //객체를 만들수 없음
	protected int hp;
	protected int exp;
	protected int level;
	protected String name;

	//설계, eat(), sleep() ...  => 하위클래스에 상속 목적 -> 하위 클래스에서는 상속받은 메서드를 자기 클래스에 맞게 다양하게 구현
	public abstract void eat();

	public void sleep() {
		System.out.println(name + " 잠잠");
	}

	public boolean play() {// hp 감소. 0이 되면 사망. boolean:생명여부
		System.out.println(name + " 논다");
		return true;
	}

	public boolean exc() {
		System.out.println(name + " 운동함");
		return true;
	}

	public void levelUpCheck() {
		System.out.println("레벨업 체크");
	}

	public void printState() {
		System.out.println(name + "의 상태");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}

	
}
