package p1125;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//맵 생성
		HashMap<String, String> map1 = new HashMap<>();

		//키와 값 추가
		map1.put("name", "aaa");// 새 항목 추가
		map1.put("tel", "111");
		map1.put("addr", "대한민국");
		
		//수정: 이미 있는 키에 새 값을 저장
		map1.put("name", "bbb");// bbb로 수정

		//get(키). 키로 검색
		System.out.println("<키로 검색>");
		System.out.println(map1.get("name"));
		System.out.println(map1.get("tel"));
		System.out.println(map1.get("addr"));

		System.out.println("<키의 내부 이터레이터 사용>");
		for (String key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}

		System.out.println("<values의 내부 이터레이터 사용>");
		for (String val : map1.values()) {
			System.out.println(val);
		}
		
		map1.remove("name");
		System.out.println("<키의 내부 이터레이터 사용>");
		for (String key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
		
		//전체 항목 삭제
		map1.clear();

	}
}
