package p1116;

class Student{
		String name;
		int num;
		int kor;
		int eng;
		int math;
		int total;
		float avg;
		
		//입력
		void inputData(String n, int nn, int k, int e, int m ) {
			name = n;
			num = nn;
			 kor = k;
			 eng = e;
			 math = m;
			 total = kor + eng + math;
			 avg = (float)total/3;
		}
		
		//출력
		void printData() {
			System.out.println("name:" + name);
			System.out.println("num:" + num);
			System.out.println("kor:" + kor);
			System.out.println("eng:" + eng);
			System.out.println("math:" + math);
			System.out.println("total:" + total);
			System.out.println("avg:" + avg);
		}
}
public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.inputData("aaa", 1, 98, 87, 76);
		s1.printData();
		
		Student s2 = new Student();
		s2.inputData("bbb", 2, 76, 89, 34);
		s2.printData();
		
		Student s3 = new Student();
		s3.inputData("ccc", 3, 89, 67, 45);
		s3.printData();
		
	}

}
