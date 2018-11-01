package i_collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExBasic {
	public static void main(String[] args) {
		/*
		1. 정규식
			- 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을
			찾아내기 위해 사용되는 것
			- 정규식의 구성
				: Pattern클래스를 이용하여 정규식을 정의한다.
				: Matcher클래스를 이용해서 Pattern과 데이터를 비교한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		//패턴등록
		Pattern p = Pattern.compile("[a-z]*");
		
		//대상비교
		Matcher m = p.matcher("asdfasd1f");
		
		System.out.println(m.matches());
		/*

		^	: 문자열의 시작
		$	: 문자열의 종료
		.	: 임의의 한 문자(모든 문자) 단, \역슬러쉬는 안됨
		*	: 문자가 없을수도, 무한정 많을 수도 있음
		+	: 앞 문자가 하나이상
		?	: 앞 문자가 없거나 하나있음
		[]	: 문자의 집합이나 범위를 나타내며 두 문자 사이는 (-)기호로 범위를 나타낸다
			[]내에서 ^ 선행하여 존재하면 not의 의미를 가진다
		{}	: 반복의 횟수 또는 범위를 나타낸다
		()	: 소괄호 안의 문자를 하나의 문자로 인식
		|	: 패턴 안에서 or연산을 수행한다
		\s	: 공백문자
		\S	: 공백을 제외한 모든 문자
		\w	: 알파벳이나 숫자 [A-Za-z0-9]
		\W	: 알파벳이나 숫자를 제외한 모든 문자
		\d	: 숫자 [0-9]
		\D	: 숫자를 제외한 모든 문자

		
		
		영어소문자로 시작	: ^[a-z]
		영어대문자로 시작	: [A-Z]
		반복				: [a-z]{2} 2회 반복
						  [a-z]{2,4} 2회이상 4이하 반복
		
		*/
		
		//1. 영어소문자를 2회내지 3회반복
		String regEx01 = "[a-z]{2,3}";
		System.out.println(Pattern.matches(regEx01, "sss"));
		
		//2. 영문자가 3회 반복후 숫자가 한 번 이상 반복
		String regEx02 = "[a-zA-Z]{3}[0-9]{1,}";
		//String regEx02 = "[a-zA-Z]{3}[0-9]+";
		//String regEx02 = "[a-zA-Z]{3}\\d+";
		
		System.out.println(Pattern.matches(regEx02, "Kim910814"));
		
		//3. 핸드폰번호
		// 숫자 3개-숫자4개-숫자4개
		String regEx03 = "\\d{3}-\\d{4}-\\d{4}";
		System.out.println(Pattern.matches(regEx03, "010-7714-1507"));
		
		//4. 핸드폰번호 업그레이드
		//	 01 016789 - 1-9숫자 3개 - 숫자 4개
		String regEx04 = "01[016789]-[1-9][0-9]{2,3}-\\d{4}";
		System.out.println(Pattern.matches(regEx04, "010-7714-1507"));
		
		//5. 주민등록번호
		/*
		숫자 2자리 0 1-9 0	1-9 - 1-4 숫자 6자리
				1 0-2 1	0-9
					  2 0-9
					  3 0-1
		*/
		String regEx05= "\\d{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])-[1-4][0-9]{6}";
		System.out.println(Pattern.matches(regEx05, "910814-1410824"));
		
		//6. 이메일정규식
		/*
		1. 시작은 영문자이어야한다.
		특수기호는 -_\. 있을수도 있고 없을수도 있다.
		2. @ 이후에 영대소문자가 1~7개가 있고
		3. . 이후에 영문자 2~3
		4. .kr이 하나 있을수도 또는 존재하지 않을수도 있다.
		*/
		System.out.println("=============email=============");
		String regEx06= "[a-zA-Z0-9-?_?\\?.?]+[@][a-zA-z]{1,7}\\.[a-z]{2,3}(.kr)?";
		System.out.println("\t" + Pattern.matches(regEx06, "d--_---b@ekdud.net") + "ueueueeeee !");
		System.out.println("===============================");
		
		//7. 욕설방지
		String text = "지랄염병땐스하고있다";
		String changeTest = filterText(text);
		System.out.println(changeTest);
	}
	
	private static String filterText(String text){
		Pattern p = Pattern.compile("지랄|염병",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, maskWord(m.group()));
		}
		m.appendTail(sb);
		return sb.toString();
	}
	
	private static String maskWord(String group){
		StringBuffer sb = new StringBuffer();
		char[] ch = group.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
			if(i == 0){
				sb.append(ch[i]);
			} else {
				sb.append("*");
			}
		}
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
