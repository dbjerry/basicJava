package a_variable;
/**
 * 변수기본
 * @jerry
 * @since2018.05.29
 * doc주석
 */
public class VariableBasic {
	public static void main(String[] args) {
//
		/*
		1. 변수란?
		  - 단 하나의 값을 저장할 수 있는 공간이다.
		  
		2. 변수의 선언
		[변수타입] [변수명];
		   int        x    ;
		   
		*/
		   
		int x; //변수의 선언
		x = 10; //변수의 초기화
		   
		int y = 10; //변수의 선언 및 초기화
		
		x = 60;
		
		System.out.println(x);
		System.out.println(y);
		
		/*
		명명규칙
		  변수의명, 메서드명, 클래스명의 이름을 짓는데는
		  반드시 지켜야할 공통적인 규칙이 있다.
		  
		1. 대소문자를 구분하며 길이의 제한이 없다. 
		2. 예약어(key word, reserved word)는 사용할 수 없다.
		3. 숫자로 시작할 수 없다.
		4. 특수문자는 '_', "$" 두 개만 사용할 수 있다.
		
		
		규칙은 아니지만 JavaProgrammer들의 암묵적인 약속(가독성 상향)
		1. 클래스명은 첫글자를 대문자로 한다.
		  - 메서드나 변수명은 첫글자를 소문자로 한다.
		2. 여러 단어로 이루어진 경우 두번째 단어부터 첫 글자는 대문자로 쓴다.
		  - lastIndexOf
		3. 상수는 모두 대문자로 쓴다.
		  - maxValue -> MAXVALUE -> MAX_VALUE 
		4. 한글은 사용하면 안된다. (개발자간 약속) 
		
		*/
		
		
		
	}
}