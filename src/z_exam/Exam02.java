package z_exam;

public class Exam02 {

	public static void main(String[] args) {

		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		
				크기		1byte		2byte		4byte		8byte
		   종류	
		  논리형		   boolean
		  문자형						 char
		  정수형			byte		shrot		int			long
		  실수형									float		double		
		
		 */
		
		/*
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는
		어떤 자료형(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고
		자신의 주민등록번호로 초기화하는 한 줄의 코드를 적으시오.
		
		
		long regNo = 9108141410000L; // int의 범위(-2³¹~2³¹-1)를 넘으므로.
		*/
		/*
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		
		
		int i = 100;	long l = 100L;	final float PI = 3.14f;
		*/		
		/*
		리터럴 : 100, 100L, 3.14f(리터럴은 '최종값'이라는 의미이다.)
		변수 : i, l(변수타입 뒤에 오는 변수다)
		상수 : PI(상수의 변수명 모두 대문자이다)
		키워드(=reserved word, 예약어) : int, long, final, float 
		 */
		
		/*
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은? //변수타입 중 기본형 타입에 관한 질문
		a.int
		b.Byte	//byte와 Byte는 다르다. 첫 글자 대문자는 클래스명에 해당된다.
		c.double
		d.boolean
		 */
		
		/*
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 '오류'라고 적으시오.
		
		System.out.println("1"+"2") → (12) 큰 따옴표의 경우 문자열로 인식
		System.out.println(true+"") → (true) 큰 따옴표의 경우 문자열로 인식, boolean이 string보다 작아서 ""(string)을 따라감.
		System.out.println('A'+'B'); → (131) char + char = int
											 (아스키코드표에 의해 A=65, B=66)
		System.out.println('1'+2) → (51) 작은 따옴표의 경우 문자지만 int형으로 인식
										 (아스키코드표에 의해 1=49)
		System.out.println('1'+'2') → (99) 작은 따옴표의 경우 문자로 인식
										   (아스키코드표에 의해 1=49, 2=50) 
		System.out.println('J'+"ava") → (Java) 작은 따옴표는 문자, 큰 따옴표는 문자열로 인식
		System.out.println(true+null) → (Error)
		추측1)true는 참과 거짓(0,1)으로 연산 하지만 null은 논리적 데이터가 아님.
		추측2)true는 참과 거짓(0,1)으로만 연산되므로 boolean형에 속하는데 null은 아니므로 Error.
		정답)기본형 + 참조형 = Error
		
		*/

		/*
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오.)
		
		a. if 예약어(key word, reserved word)
		b. True 클래스명
		c. NULL 상수
		d. Class 클래스명
		e. System 클래스명
		
		*/
		
		/*
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은?(모두 고르시오.)
		
		a. $ystem (O)  '_',"$"만 사용할 수 있다
		b. channel#5(X)  '#'은 사용할 수 없다
		c. 7eleven(X)  숫자는 시작할 수 없다
		d. If (O)  대소문자 구분하고, 길이에 제한이 없다.
		e. 자바 (O)  사용할 순 있지만, 안 쓰기로한 개발자간의 약속
		f. new (X)  'new'는 예약어이다.
		g. $MAX_NUM (O) 
		h. hello@com (X)  '@'는 사용할 수 없다.
		
		*/
		
		/*
		[2-8] 참조형 변수타입(reference type)과 같은 크기의 기본형(pirimitive type)은?
			  (모두 고르시오.) 참조형타입(reference type)은 4byte이다.
		
		a. int (O) 4byte
		b. long (X) 8byte
		c. short (X) 2byte
		d. float (O) 4byte
		e. double (X) 8byte
		
		*/
		
		/*
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오.)
		
		byte b =10;		char ch = 'A';		int i = 100;		long l = 1000L;
		
		a. b = (byte)i; byte가 int를 품을 수 없으므로 형변환 필요
		b. ch = (char)b; char가 byte를 품을 수 없으므로 형변환 필요
		c. short s = (short)ch; short가 char를 품을 수 없으므로 형변환 필요
		d. float f = (float)l; float이 int를 품을 수 있으므로 형변환 생략가능
		e. i = (int)ch; int가 char를 품을 수 있으므로 형변환 생략가능
		
		*/
		
		/*
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는?(10진수로 적으시오)
		
		char = 2byte = 16bit = 0~2의 16제곱-1 = 0~65535
		
		*/
		
		/*
		[2-11] 다음 중 변수를 잘못 초기화한 것은?(모두 고르시오)
		
		a. byte b = 256; byte = 1byte = 8bit = -2의 7제곱~2의 7제곱-1 = -128~127
		b. char c = ''; char는 문자형이므로 한 개의 문자를 포함해야함
		c. char answer = 'no'; char는 문자형(한 자), String은 문자열 
		d. float f = 3.14
		e. double d = 1.4e3f;
		
		*/
		
		/*
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은?(모두 고르시오)
		
		a. boolean - false boolean은 논리형(true, false)
		b. char - '\u0000' char는 문자형, \u0000은 유니코드
		c. float - 0.0 
		d. int - 0 int의 범위안에 '0' 포함
		e. long - 0 long은 0L로 표기
		f. String - "" 궁금) (프린트는 맞음, 설명:String은 참조형타입, 참조형타입의 기본값은 null)
		
		*/
		
		String s = "";
		System.out.println(s);
		
		
	}

}
