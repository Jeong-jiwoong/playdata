package p1117;

//메서드 오버로딩
class Test2 {
	int add(int x, int y) {// 2개
		return x + y;
	}

	int add(int x, int y, int z) {// 3개
		return x + y + z;
	}

	String add(String x, String y) {
		return x + y;
	}

	float add(float x, float y) {
		return x + y;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t = new Test2();
		System.out.println(t.add("aaa", "bbb"));
		System.out.println(t.add(1,2,3));
	}

}
