package p1124;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcba";
		String str2 = new String("defg");
		
		System.out.println("str1.charAt(1):" + str1.charAt(1));
		System.out.println("str1.indexOf('c'):" + str1.indexOf('c'));
		System.out.println("str1.indexOf('bc'):" + str1.indexOf("bc"));
		System.out.println("str1.concat(\"hello\"):" + str1.concat("hello"));
		System.out.println("str2.contains(\"eg\"):" + str2.contains("eg"));
		System.out.println("str2.contains(\"ef\"):" + str2.contains("ef"));
		System.out.println("str1.lastIndexOf('b'):" + str1.lastIndexOf('b'));
		System.out.println("str1.startsWith(\"ab\"):" + str1.startsWith("ab"));
		System.out.println("str1.endsWith(\"ba\"):" + str1.endsWith("ba"));
	}

}
