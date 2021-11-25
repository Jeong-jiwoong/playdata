package picachu;

public class Picachu extends PoketMon {
	public Picachu() {
		name = "피카추";
		hp = 30;
		level = 1;
		System.out.println("피카추가 생성되었습니다. ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + "밥먹음");
		hp += 5;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name + "잠잠");
		hp += 10;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		System.out.println(name + "놀기");
		hp -= 8;
		if (hp <= 0) {
			System.out.println("캐릭터 사망");
			return false;
		}
		exp += 5;
		levelUpCheck();
		return true;
	}

	@Override
	public boolean exc() {
		// TODO Auto-generated method stub
		super.exc();
		hp -= 15;
		if (hp <= 0) {
			System.out.println("캐릭터 사망");
			return false;
		}
		exp += 10;
		levelUpCheck();
		return true;
	}

	@Override
	public void levelUpCheck() {
		// TODO Auto-generated method stub
		super.levelUpCheck();
		if (exp >= 20) {
			level++;
			exp -= 20;
			System.out.println(name + "의 레벨이 1증가함");
		}
	}
	//특기 공격
public void 백만볼트() {
	System.out.println("백만볼트 공격");
}

	
}
