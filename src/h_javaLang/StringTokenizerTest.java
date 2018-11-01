package h_javaLang;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String text = "100,200,300,400";
		
		StringTokenizer st = new StringTokenizer(text, ",");
		//100,200,300,400
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		System.out.println("\n==========split==========");
		String data = "100,,,200,,300,400";
		String[] dataArr = data.split(",");
		for(int i = 0; i < dataArr.length; i++){
			System.out.println(dataArr[i]);
		}
		
		System.out.println("\n=====StringTokenizer=====");
		StringTokenizer st2 = new StringTokenizer(data,",");
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
		
	}
}
