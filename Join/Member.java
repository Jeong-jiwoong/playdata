package Join;

//private 이유 : 데이터 보호, 외부에서 다이렉트로 접근하는 것을 막음
public class Member {
	//멤버변수, 저장하고 싶은 객체의 값을 담을 수 있는 변수를 클래스
	private String id;
	private String pwd;
	private String name;
	private String email;
	
	//생성자: 객체 초기화, 멤버변수 초기화. 객체 생성시에만 호출
	//public 뒤에 클래스 이름과 동일하며 여러개의 생성자를 만들수 있다
	public Member() {}
	public Member(String id, String pwd, String name, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
		//setter : 클래스 밖에서 값을 받아서 멤버변수에 할당. private 멤버변수 값 설정
		//getter : 클래스 밖에 멤버변수를 던져줌. private 멤버변수 값 읽기
		//단어단어 연결시 연결되는 단어 첫글자 -> 대문자
	
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
	
	//this는 클래스 정의 시 현재 객체를 의미하는 참조변수
	//파라메터와 멤버변수가 이름이 같을때 멤버변수라는 표시로 this 사용
	public void setData(String i, String n, String e) {
		
		//현재 객체 = this
		this.name = n;
		this.id = i;
		this.email = e;
*/
	
	
	}
