package p1122;
//super : ��Ӱ��迡�� �θ� ��ü�� ��Ÿ���� ��������    this�� �����
class Father{
	public int num=1;
	public String name="aaa";
	
	public void test1() {
		System.out.println("Father Ŭ���� �޼���");
		System.out.println("num: " + num);
		System.out.println("name: " + name);
	}
}
class Son extends Father{
	public String hobby;
	
	public Son(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		//super.test1();
		System.out.println("Son Ŭ���� �޼���");
	}
	
}
public class SuperTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son("����");
		s.test1(); //�������� : �����ǵ� �޼��� ȣ��� ������ Ÿ���� ���� ������
		
		Father f = new Father();
		f.test1();  //�������� : �����ǵ� �޼��� ȣ��� ������ Ÿ���� ���� ������
		
		Father fs = new Son("�ǾƳ�");
		fs.test1();  //�������� : Ÿ���� �θ������� �����ǵ� �޼��带 ȣ��
	}

}
