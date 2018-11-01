package h_javaLang;

public class StringBufferTest01 {
	public static void main(String[] args) {
		
		/*
		String 문자열에 "a"를 3만번 더하는 과정
		String str = "a";
		str += "a";
		str += "a";
		str += "a";
		str += "a";
		str += "a";
		
		String str = "a";
		str = new StringBuffer(str).append("a").toString();
		str = new StringBuffer(str).append("a").toString();
		str = new StringBuffer(str).append("a").toString();
		
		*/
		
//		StringBuffer sb = new StringBuffer("a");
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 100000000; i++){
//			sb.append("a");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
		StringBuilder sb = new StringBuilder("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		//Buffer와 Builder의 차이는 동기화차이
		
		
	}
}
