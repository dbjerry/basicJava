package h_javaLang;

import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		
		//char chatAt(int index) : 지정된 index번째 문자를 리턴한다.
		String s = "Hello";
		char c = s.charAt(1);
		System.out.println(c);
		
		//Oracle에서도 사용하는 것
		// 1. String concat(String str) : 문자열을 뒤에 덧붙인다.
		String s2 = s.concat(" Oracle");
		System.out.println(s2);
		
		// 2. boolean cotains() : 지정된 문자열이 포함되어 있는지 확인한다.
		System.out.println(s2.contains("Or"));
		// Vector로 쓰이는 경우엔  Object타입이다.
		
		//확장자 처리에 유용한 것
		// 1. boolean endsWith() : 지정된 문자열로 끝나는지 확인
		String s3 = "구인수잘생겼다.txt";
		System.out.println(s3.endsWith(".txt"));
		
		//그 외 중요한 메서드들
		// 1. int lastIndexOf()
		//	: 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서
		//	해당 index반환해준다. 찾는 문자가 없으면 -1을 반환한다.
		System.out.println(s3.lastIndexOf("다"));
		
		// 2. String replace() : 문자열 중의 문자를 새로운 문자열로 변환
		String s4 = s2.replace("Oracle", "Java");
		System.out.println(s4);
		
		// 3. String[] split() : 문자열을 지정된 분리자로 나누어 문자열 배열에 담는다.
		String s5 = "100,200,300,400";
		String[] s6 = s5.split(",");
		//String[] s6 = s5.split("0,"); //10 , 20 , 30 , 400
		System.out.println(Arrays.toString(s6));
		
		// 4. String subString()
		// : 주어진 문자열을 시작부터 끝 범위에 포함된 문자열을 얻는다.
		String s7 = s3.substring(3, 5);
		System.out.println(s7);
		
		String s8 = s3.substring(0, s3.lastIndexOf("."));// 파일명만 가져오고 싶을 때
		System.out.println(s8);// 0부터 확장자 . 전까지
		
		// 5. String trim() : 문자열 양 끝의 공백을 제거한다.
		String s9 = "     My      Trim      ";
		String s10 = s9.trim();
		System.out.println(s10);
		
		// 6. String(char[] value) : 주어진 문자열(value)을 갖는 String인스턴스를 생성
		char[] ch = {'H','e','l','l','o'};
		String st = new String(ch);
		System.out.println(ch);
		
		// 7. String(StringBuffer buf) : StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성
		StringBuffer sb = new StringBuffer("Hello");
		String str = new String(sb);
		System.out.println(str);
		
		// 8. char charAt(int index) : 지정된 위치(index)에 있는 문자를 알려준다.(index는 0부터 시작)
		String s1 = "Hello";
		String n = "0123456";
		char c1 = s.charAt(1);
		char c2 = n.charAt(1);
		System.out.println(c1 + ", " + c2);
		
		// 9. String concat(String str) : 문자열(str)을 뒤에 덧붙인다.
		String str1 = "Hello";
		String str2 = s.concat(" World");
		System.out.println(str2);
		
		// 10. boolean contains(CharSequence s) : 지정된 문자열(s)이 포함되었는지 검사한다.
		String str3 = "Hello";
		boolean b = s.contains("bc");
		System.out.println(b);
		
		// 11. boolean startWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사한다.
		String str4 = "java.lang.Object";
		boolean b1 = str4.startsWith("java");
		boolean b2 = str4.startsWith("lang");
		System.out.println(b1 + ", " + b2);
		
		// 12. boolean endsWith(String suffix) : 지정된 문자열(suffix)로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean b3 = file.endsWith("txt");
		System.out.println(b3);
		
		// 13. boolean equals(Object obj)
		//	: 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
		//	  obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		
		
		
		
		
	}
}
