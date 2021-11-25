package test1;
import p1118.Test10;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p1118.Test2 t = new p1118.Test2();  //default는 다른 패키지에서 안보임
				Test10 t1 = new Test10();
				//t1.a = 1;//default라서 다른 패키지에서 안보임
				//t1.b = 2;//private이라 클래스 안에서만 보임
				t1.c = 3;//public은 모든 패키지에서 보임
	}

}
