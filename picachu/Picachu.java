package picachu;

public class Picachu extends PoketMon {
	public Picachu() {
		name = "��ī��";
		hp = 30;
		level = 1;
		System.out.println("��ī�߰� �����Ǿ����ϴ�. ");
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
			System.out.println("ĳ���� ���");
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
			System.out.println(name + "�� ������ 1������");
		}
	}
	//Ư�� ����
public void �鸸��Ʈ() {
	System.out.println("�鸸��Ʈ ����");
}

	
}
