package Join;

//private ���� : ������ ��ȣ, �ܺο��� ���̷�Ʈ�� �����ϴ� ���� ����
public class Member {
	//�������, �����ϰ� ���� ��ü�� ���� ���� �� �ִ� ������ Ŭ����
	private String id;
	private String pwd;
	private String name;
	private String email;
	
	//������: ��ü �ʱ�ȭ, ������� �ʱ�ȭ. ��ü �����ÿ��� ȣ��
	//public �ڿ� Ŭ���� �̸��� �����ϸ� �������� �����ڸ� ����� �ִ�
	public Member() {}
	public Member(String id, String pwd, String name, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
		//setter : Ŭ���� �ۿ��� ���� �޾Ƽ� ��������� �Ҵ�. private ������� �� ����
		//getter : Ŭ���� �ۿ� ��������� ������. private ������� �� �б�
		//�ܾ�ܾ� ����� ����Ǵ� �ܾ� ù���� -> �빮��
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printInfo() {
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(email);
	}
	
	
	
	/*
	public String getData() {
		return id + "/" + name + "/" + email;
	}
	
	//this�� Ŭ���� ���� �� ���� ��ü�� �ǹ��ϴ� ��������
	//�Ķ���Ϳ� ��������� �̸��� ������ ���������� ǥ�÷� this ���
	public void setData(String i, String n, String e) {
		
		//���� ��ü = this
		this.name = n;
		this.id = i;
		this.email = e;
*/
	
	
	}
