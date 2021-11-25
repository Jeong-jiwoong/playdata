package picachu;

public class Gobook extends PoketMon {
	public Gobook() {
		name = "꼬부기";
		hp = 50;
		level = 1;
		System.out.println("꼬부기가 생성되었습니다");
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
		exp +=15;
		levelUpCheck();
		return true;
	}

	@Override
	public void levelUpCheck() {
		// TODO Auto-generated method stub
		super.levelUpCheck();
	}

	//특기 공격
	public void 물대포() {
		System.out.println("물대포 공격");
	}
	
	
}
