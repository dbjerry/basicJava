package h_javaLang;

public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//클래스가 MA에 로드될 때 문자열 리터럴이 heap메모리에 로드되고
		//str1, str2가 콜스택에 올라가면 그 때 참조한다.
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		//String클래스는  오버라이딩이 되어있다.
		//주소값으르 찾으므로 false여야 하는데 String클래스는
		//equals가 오버라이드가 되어있어서 값을 비교하게 함
		
		
//		Date d1 = new Date(20180704L);
//		Date d2 = new Date(20180704L);
//		System.out.println(d1 == d2);
//		System.out.println();
		
	}
}
