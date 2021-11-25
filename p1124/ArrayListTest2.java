package p1124;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String 만 담는 ArrayList 생성
		ArrayList<String> al = new ArrayList<>();

		al.add("aaa");// 맨 끝에 추가
		al.add("bbb");
		al.add(1, "ccc");// 지정한 인덱스에 끼워넣음
		al.set(0, "abc");// 수정

		System.out.println("전체 요소");
		for (String s : al) {
			System.out.println(s);
		}
		
		int idx = 0;

		System.out.println("bbb 검색");
		if (al.contains("bbb")) {//ArrayList에 값이 있나 확인. true/false로 반환
			idx = al.indexOf("bbb");//bbb의 위치 반환
			System.out.println("검색 위치:" + idx);
			System.out.println("값:" + al.get(idx));//idx 위치에 있는 값 추출
		} else {
			System.out.println("없다");
		}
		
		al.remove(0); //0번방에 있는 값 삭제
		System.out.println("전체 요소");
		for (String s : al) {
			System.out.println(s);
		}
		
		al.remove("bbb"); //같은 객체를 찾아서 삭제. equals() 재정의 되어 있어야 함
		System.out.println("전체 요소");
		for (String s : al) {
			System.out.println(s);
		}
		
		al.clear();//전체 요소 삭제
		
		if(al.isEmpty()) {
			System.out.println("리스트가 비었다");
		}
	}

}
