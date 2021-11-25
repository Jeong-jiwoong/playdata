package p1124;

class Test{
	int x=1;
	int y=2;
}
public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objs = new Object[5];
		objs[0] = new Test();
		objs[1] = new String("asdf");
//		objs[2] = new Integer(10);//int
//		objs[3] = new Double(3.24);//double
//		objs[4] = new Boolean(true);//boolean
		
		//auto boxing
		objs[2] = 10;//int
		objs[3] = 3.24;//double
		objs[4] = true;//boolean
	}

}
