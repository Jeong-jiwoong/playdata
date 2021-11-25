package test1;

import java.util.Calendar;

//싱글톤 : 객체를 하나 생성해서 공용으로 사용
//생성자 : private
//현재 클래스의 객체를 static으로 내부에 생성
//
class SingleTone{
	private String msg;
	private static SingleTone s = new SingleTone();
	
	//클래스 밖에서 객체를 생성할 수 없음
	private SingleTone() {
		System.out.println("SingleTone 생성자");
	}
	public static SingleTone getInstance() {
		return s;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o = new Order();
		SingleTone s = SingleTone.getInstance();
		s.setMsg("Hello");
		System.out.println(s.getMsg());
		
		/*
		Calendar c = Calendar.getInstance();
		Data time = c.getTime();
		System.out.println(time.getYear());
		System.out.println(time.getMonth()+1);
		System.out.println(time.getData());
	*/
	}

}
