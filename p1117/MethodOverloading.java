package p1117;

//�޼��� �����ε�
class Test2 {
	int add(int x, int y) {// 2��
		return x + y;
	}

	int add(int x, int y, int z) {// 3��
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
