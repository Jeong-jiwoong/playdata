package picachu;

public class Gobook extends PoketMon {
	public Gobook() {
		name = "���α�";
		hp = 50;
		level = 1;
		System.out.println("���αⰡ �����Ǿ����ϴ�");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + "�����");
		hp += 5;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name + "����");
		hp += 10;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		System.out.println(name + "���");
		hp -= 8;
		if (hp <= 0) {
			System.out.println("ĳ���� ���");
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

	//Ư�� ����
	public void ������() {
		System.out.println("������ ����");
	}
	
	
}
