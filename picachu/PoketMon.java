package picachu;

//������
public abstract class PoketMon { //��ü�� ����� ����
	protected int hp;
	protected int exp;
	protected int level;
	protected String name;

	//����, eat(), sleep() ...  => ����Ŭ������ ��� ���� -> ���� Ŭ���������� ��ӹ��� �޼��带 �ڱ� Ŭ������ �°� �پ��ϰ� ����
	public abstract void eat();

	public void sleep() {
		System.out.println(name + " ����");
	}

	public boolean play() {// hp ����. 0�� �Ǹ� ���. boolean:������
		System.out.println(name + " ���");
		return true;
	}

	public boolean exc() {
		System.out.println(name + " ���");
		return true;
	}

	public void levelUpCheck() {
		System.out.println("������ üũ");
	}

	public void printState() {
		System.out.println(name + "�� ����");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}

	
}
