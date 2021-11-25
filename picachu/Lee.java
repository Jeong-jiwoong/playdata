package picachu;

public class Lee extends PoketMon {

	public Lee() {
		name = "ÀÌ»óÇØ¾¾";
		hp = 40;
		level = 1;
		System.out.println("ÀÌ»óÇØ¾¾°¡ »ı¼ºµÇ¾ú½À´Ï´Ù");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + "¹ä¸Ô±â");
		hp += 10;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name + "ÀáÀá");
		hp += 11;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		System.out.println(name + "³î±â");
		hp -= 9;
		if (hp <= 0) {
			System.out.println("Ä³¸¯ÅÍ »ç¸Á");
			return false;
		}
		exp +=10;
		levelUpCheck();
		return true;
	}

	@Override
	public void levelUpCheck() {
		// TODO Auto-generated method stub
		super.levelUpCheck();
	}

	//Æ¯±â °ø°İ
		public void ³ÕÄğÃ¤Âï() {
			System.out.println("³ÕÄğÃ¤Âï °ø°İ");
		}
}
