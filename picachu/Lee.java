package picachu;

public class Lee extends PoketMon {

	public Lee() {
		name = "�̻��ؾ�";
		hp = 40;
		level = 1;
		System.out.println("�̻��ؾ��� �����Ǿ����ϴ�");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + "��Ա�");
		hp += 10;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name + "����");
		hp += 11;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		System.out.println(name + "���");
		hp -= 9;
		if (hp <= 0) {
			System.out.println("ĳ���� ���");
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

	//Ư�� ����
		public void ����ä��() {
			System.out.println("����ä�� ����");
		}
}
