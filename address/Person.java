package address;
//vo: 객체 한개의 정보를 담을 수 있게 만든다. 
class Person {
	String name;
	String tel;
	String addr;


	// 입력 메서드
	// 입력 메서드
		void inputData(String n, String t, String a) {
			name = n;
			tel = t;
			addr = a;
		}

		// 출력 메서드
		void printData() {
			System.out.println("name:" + name);
			System.out.println("tel:" + tel);
			System.out.println("addr:" + addr);
		}
}


