package test1;

import java.util.Calendar;

//�̱��� : ��ü�� �ϳ� �����ؼ� �������� ���
//������ : private
//���� Ŭ������ ��ü�� static���� ���ο� ����
//
class SingleTone{
	private String msg;
	private static SingleTone s = new SingleTone();
	
	//Ŭ���� �ۿ��� ��ü�� ������ �� ����
	private SingleTone() {
		System.out.println("SingleTone ������");
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
