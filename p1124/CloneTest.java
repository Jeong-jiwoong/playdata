package p1124;

class MyClone implements Cloneable{
	public int x = 10;
	public int y = 20;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	}
	
public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClone m1 = new MyClone();
		m1.x = 150;
		m1.y = 300;
		
		MyClone m2 = null;
		try {
			m2 = (MyClone) m1.clone();
		} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		System.out.println("m1: " + m1);
		System.out.println("m2: " + m2);
		System.out.println("m1.x: " + m1.x + "/ m1.y: " + m1.y);
		System.out.println("m2.x: " + m2.x + "/ m2.y: " + m2.y);
	}

}
