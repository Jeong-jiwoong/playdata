package p1124;
class Member {
	private String id;
	private String pwd;
	
	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + "]";
	}
	
}
public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("aaa", "111");
		Member m2 = new Member("aaa", "111");
		System.out.println("m1==m2: " + (m1 == m2));
		System.out.println("m1.equals(m2):" + (m1.equals(m2)));
	}

}
