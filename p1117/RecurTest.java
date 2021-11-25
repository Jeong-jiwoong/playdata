package p1117;
//팩토리얼 계산
class Facto {
	// 재귀호출
	int facto(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x * facto(x - 1);
		}
	}

	// 루프 사용
	int facto2(int x) {
		int res = 1;
		for (int i = x; i > 0; i--) {
			res *= i;
		}
		return res;
	}
}

class Fibo {
	long fibo1(long x) {
		if (x < 2) {
			return 1;
		}
		return fibo1(x - 1) + fibo1(x - 2);
	}

	void fibo2(int num) {
		long x = 1, y = 1, z, i;
		for (i = 0; i < num; i++) {
			if (i < 2) {
				System.out.print("1, ");
			} else {
				z = x + y;
				System.out.print(z + ", ");
				if (i != 0 && i % 10 == 0) {
					System.out.println();
				}
				x = y;
				y = z;
			}
		}
	}

	void fibo3(int num) {
		long[] nums = new long[num];
		nums[0] = nums[1] = 1;
		int i;
		for (i = 2; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
		}

		for (long x : nums) {
			System.out.print(x + ", ");
		}
	}
}
public class RecurTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facto f = new Facto();
		System.out.println(f.facto(5));
		System.out.println(f.facto2(5));
		Fibo ff = new Fibo();
//		int i;
//		for (i = 0; i < 100; i++) {
//			System.out.print(ff.fibo1(i) + ", ");
//			if (i != 0 && i % 10 == 0) {
//				System.out.println();
//			}
//		}
		ff.fibo3(50);
	}
	

}
