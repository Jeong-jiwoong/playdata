package address;
//vo: ��ü �Ѱ��� ������ ���� �� �ְ� �����. 
class Person {
	String name;
	String tel;
	String addr;


	// �Է� �޼���
	// �Է� �޼���
		void inputData(String n, String t, String a) {
			name = n;
			tel = t;
			addr = a;
		}

		// ��� �޼���
		void printData() {
			System.out.println("name:" + name);
			System.out.println("tel:" + tel);
			System.out.println("addr:" + addr);
		}
}


