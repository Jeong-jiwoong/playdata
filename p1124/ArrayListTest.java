package p1124;

import java.util.ArrayList;
class Test2{
	int x;
	int y;
}
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 생성
		ArrayList al = new ArrayList();
		
		//add(): 끝에 데이터 추가
		al.add("aaa");
		al.add(2.345);
		al.add(new Test2());
		
		//get(인덱스): 인덱스 위치의 값 하나 추출
		String a = (String) al.get(0);
		double b = (double) al.get(1);
		Test2 c = (Test2) al.get(2);
	}

}
