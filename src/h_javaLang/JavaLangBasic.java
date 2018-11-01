package h_javaLang;

public class JavaLangBasic {
	public static void main(String[] args) {
		
		/*
		
		1. java.lang패키지
			- 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있다.
			  ex) String, System...
		
		2. Object클래스
			- Object클래스는 멤버변수없이 11개의 메서드로 구성되어 있다.
			
			- equals(Object obj) 
				: 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를
				  boolean형 값으로 알려준다.
				: 참조변수에 저장된 주소값이 같은지를 판단할 수 있다.
				: 주소값이 아닌 멤버변수의 값을 비교하기 위해서는 equals메서드를
				오버라이드 해야 한다.
				: equals메서드라 오버라이드 되어 있는 클래스
				ex) String, Date, File, wrapper클래스
		
			- hashCode() - 10진수로 이루어져 있다.
				: 객체의 주소값을 이용해서 해시코드를 만들어 반환한다.
				: String클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환한다.
				
			- toString()
				: 인스턴스에 대한 정보를 문자열로 제공할 목적으로 작성
				: 기본 toString메서드
				
				return getClass().getName()+"@"+Integer.toHexString(hashCode());
				//Object에 있다, 클래스에 대한, 인스턴스에 대한 정보를 전부 담고 있다.
			
			- getClass()
				: 자신이 속한 클래스의 Class(Calss타입)객체를 반환하는 메서드
				: class의 객체를 얻는 방법
				클래스의 정보가 필요할 때 먼저 class의 객체에 대한 참조를 얻어와야 한다.
				(1) 생성된 객체로부터 얻는 방법(9%)
					Class obj = new Card().getClass();
				
				(2) 클래스의 리터럴로부터 얻는 방법(1%)
					Class obj = Card.class;
					
				(3) 클래스의 이름으로부터 얻는 방법(90%)
					Class obj = Class.forName("Card");
					// class not found exception
				
			- clone()
				: 얕은 복사
				: 자신을 복제하여 *새로운 인스턴스를 생성한다.
				단순히 인스턴스변수의 *값만을 복사한다.
				객체가 참조하고 있는 객체까지 복사하지 않는다.
		
		3. String클래스	// <= StringTest01
			- 다른 언어에서는 문자열을 char형 배열로 다루었으나 자바에서는 문자열을 위한 클래스를 제공한다.
				: 문자열을 합치게 될 때 새로운 문자열을 가진 String인스턴스가 생성된다.
				: 문자열간의 결합작업이 많이 필요한 경우  StringBuffer클래스를 이용한다.
				
			- 문자열의 비교
				: 문자열 리터럴을 지정하는 방법 String클래스의 생성자를 사용해서 만드는 방법이 있다.
				: 문자열 리터럴은 클래스가 메모리에 로드될 때 자동적으로 미리 생성된다.
				
			- String클래스의 생성자와 메서드	// <= StringMethod.java
				: 자주 사용되는 것만 실습해보기
				
			- 문자 인코딩	// <= StringIncode
				: 한글 윈도우의 경우 문자 인코딩으로 CP949
				하지만 UTF-8을 사용한다.
		
			- String.format
				: 기본형 값을 String으로 변환
					1) 빈 문자열을 더하는 방식
					int a = 10;
					String s = a + "";
					
					2) valueOf를 이용하는 방식 // valueOf는 클래스메서드
					int a = 10;
					String s = String.valueOf(a);
					
				: String을 기본형값으로 변경하는 방법
					1)	wrapper클래스를 이용하는 방법
						String s = "100";
						int a = Integer.parseInt(s);
						//Integer에 문자가 입력되면 Exception!
						//정규식 혹은 try-catch로 해결
						int a = Integer.valueOf(s);
						valueOf()
						
					2)	String을 기본형으로 변환시에는 10진수가 기본이다.
					 	int a = Integer.parseInt(s, 16);
					 	// 16진수로 바꿔주는게 아니라 "100"을 16진수라 생각하고 256을 찍어줌
		
		4. StringBuffer와 StringBuilder클래스	// <= StringBufferTest.java
			- String클래스는 인스턴스를 생성할 때 지정된 문장을 변경할 수 없다.
			- 문자열의 변경을 위해서는 StringBuffer클래스를 이용해야 한다.
			
		
		5. Math클래스
			- (MathTest.java)
		
		6. wrapper클래스
			- Java는 모든 것을 객체로 다루어야 한다.
			- 8가지 기본형은 객체로 다루지않는다.
			- 때로는 기본형 변수도 어쩔 수 없이 객체로 다루어야 하는 경우가 있다.
				: 매개변수로 객체를 요구할 때
				: 기본형이 아닌 객체로 저장되어야 할 때([] Arr
				이런 경우 기본형 값들을 객체로 변환하여 작업을 수행해야 한다.
				
				boolean		|	Boolean
				char		|	Character ***
				byte		|	Byte
				short		|	Short
				int			|	Integer ***
				long		|	Long
				float		|	Float
				double		|	Double
		
			- AutoBoxing(오토박싱) : 기본형 값을 wrapper클래스의 객체로 변환해주는 기능
			- UnBoxing(언박싱) : wrapper클래스의 객체를 기본형 값으로 변환해주는 기능
		
		7. StringTokenizer클래스
			 - 긴 문자열을 지정된 구분자를 기준으로 토큰(token)이라는
			 여러개의 문자열로 잘라내는데 사용된다.
			 - 단 한 문자의 구분자만 사용할 수 있다.
		
		*/
	}
}
