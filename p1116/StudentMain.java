package p1116;

	class Student1{// �л� 1��. ��ü �ϳ��� ������ ���� �� �ְ� �������ؾ���.
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	float avg;

	// �Է�
	void inputData(String n, int nn, int k, int e, int m) {
		name = n;
		num = nn;
		kor = k;
		eng = e;
		math = m;
		total = kor + eng + math;
		avg = (float) total / 3;
	}

	// ���
	void printData() {
		System.out.println("name: " + name);
		System.out.println("num: " + num);
		System.out.println("kor:" + kor + "��");
		System.out.println("eng:" + eng + "��");
		System.out.println("math:" + math + "��");
		System.out.println("total:" + total + "��");
		System.out.println("avg:" + avg + "%");
	}

}

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		s1.inputData("aaa", 1, 98, 87, 76);
		s1.printData();

		Student1 s2 = new Student1();
		s2.inputData("bbb", 2, 76, 89, 34);
		s2.printData();

		Student1 s3 = new Student1();
		s3.inputData("ccc", 3, 89, 67, 45);
		s3.printData();
	
	}
}
