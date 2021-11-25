package warehouse2;

//Order(�ֹ���ȣ(�ڵ��Ҵ�) / �ֹ���ǰ��ü / �ֹ����� / �����ݾ� / �������� / ������� )
public class Order {
	private int num;  		//�ֹ���ȣ
	private Product p;		//�ֹ� ��ǰ
	private int amount;		//�ֹ�����
	private int total_pay;	//�����ݾ�
	private boolean pay;	//��������
	private boolean out;	//�������
	private static int cnt;

	public Order() {
	}

	public Order(Product p, int amount) {
		this.num = ++cnt;		//�ֹ���ȣ �ڵ� ������
		this.p = p;				//�ֹ���ǰ
		this.amount = amount;	//�ֹ�����
		this.total_pay = amount * p.getPrice();	//�����ݾ�=�ֹ�����*��ǰ�ܰ�
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal_pay() {
		return total_pay;
	}

	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public boolean isOut() {
		return out;
	}

	public void setOut(boolean out) {
		this.out = out;
	}

	@Override
	public String toString() {
		return "Order [num=" + num + ", p=" + p + ", amount=" + amount + ", total_pay=" + total_pay + ", pay=" + pay
				+ ", out=" + out + "]";
	}
}
