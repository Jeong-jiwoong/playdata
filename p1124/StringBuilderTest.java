package p1124;

import java.util.Scanner;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");
		sb.append("bbb");
		sb.append("ccc");
		System.out.println(sb.toString());
		sb.insert(1, "fff");
		System.out.println(sb.toString());
		sb.delete(2, 5);
		System.out.println(sb.toString());
		
		Scanner sc = new Scanner(System.in);
		sb.delete(0, sb.length());
		String str = "";
		while(true) {
			System.out.println("���ڿ��� �Է��Ͻÿ�. ���߷��� /stop�� �Է��Ͻÿ�");
			str = sc.next();
			if(str.startsWith("/stop")) {
				break;
			}
			sb.append(str);
		}
		System.out.println(sb.toString());
	}

}
