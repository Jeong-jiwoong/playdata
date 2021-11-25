package p1115;

class Student2{
	String name;
	int[] score = new int[5];
	float avg;
}

public class ClassTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
		
		
		s1.name = "aaa";
		s1.score = new int[] { 1, 56, 67, 78, 0}; //그냥 { 1, 56, 67, 78, 0}로 생성하면 안됨.
																	  //이표현은 선언문에서만 가능.
		int i;
		for (i=1; i<4; i++) {
			s1.score[4] += s1.score[i];
		}
		s1.avg = (float)s1.score[4]/3;
		
		System.out.println("name: " + s1.name);
		for (i=0; i<s1.score.length; i++) {
			System.out.println("score["+ i + "]: " + s1.score[i]);
		}
		System.out.println("avg: " + s1.avg + "%");
	}

}
