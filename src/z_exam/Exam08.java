package z_exam;

//public class Exam08 {
//	
//}
//	[8-1] 예외처리의 정의와 목적에 대해서 설명하시오.
//	
//	프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
	
	
//	[8-2] 다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다.
//	이에 대한 설명 중 옳지 않은 것은?
	
//	java.lang.ArithmeticException : / by zero
//		at ExceptionEx18.method2(ExceptionEx18.java:12)
//		at ExceptionEx18.method1(ExceptionEx18.java:8)
//		at ExceptionEx18.main(ExceptionEx18.java:4)
//	
//	a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다.				(X)
//	b. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java파일의 12번째 줄이다.	(X)
//	c. 발생한 예외는 ArithmeticException이며, 0으로 나누어서 예외가 발생했다.			(X)
//	d. method2메서드가 method1메서드를 호출하였고 그 위치는 ExceptionEx18.java파일의 8
//	번째 줄이다.	(O)
	
	
//	[8-3] 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
	
//	void add(int a, int b)
//		throws InvalidNumberException, NotANumberException {}
//	
//	class NumberException extends Exception {}
//	class InvalidNumberException extends NumberException {}
//	class NotANumberException extends NumberException {}
	
//	a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}	(X)
//	b. void add(int a, int b) throws InvalidNumberException {}						(X)
//	c. void add(int a, int b) throws NotANumberException {}							(X)
//	d. void add(int a, int b) throws Exception {}									(O)
//	e. void add(int a, int b) throws NumberException {}								(O)
	
	
//	[8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
	
//	void method() throws InvalidNumberException, NotANumberException {}
//	class NumberException extends RuntimeException {}
//	class InvalidNumberException extends NumberException {}
//	class NotANumberException extends NumberException {}
	
	
//	a. try {method();} catch(Exception e) {}								(X)
//	b. try {method();} catch(NumberException e) {} catch(Exception e) {}	(X)
//	c. try {method();} catch(Exception e) {} catch(NumberException e) {}	(O)
//	d. try {method();} catch(InvalidNumberException e) {
//	} catch(NotANumberException e) {}										(X)
//	e. try {method();} catch(NumberException e) {}							(X)
//	f. try {method();} catch(RuntimeException e) {}							(X)
	

//	[8-5] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

//class Exam08 {
//	static void method(boolean b) {
//		try {
//			System.out.println(1);
//			if(b) throw new ArithmeticException();
//			System.out.println(2);
//			
//		} catch(RuntimeException r) {	// RuntimeException
//			System.out.println(3);
//			return;						// 메서드를 빠져나간다. (finally블럭을 수행한 후에)
//		} catch(Exception e) {
//			System.out.println(4);
//			return;
//		} finally {
//			System.out.println(5);
//		}
//		System.out.println(6);
//	}
//	//	예외가 발생하면 1,3,5가 출력되고 에외가 발생하지 않으면, 1,2,5,6이 출력된다.
//	//	ArithmeticException은 RuntimeException의 자손이므로 RuntimeException이
//	//	정의된 catch블럭에서 처리된다. 이 catch블럭에 return문이 있으므로 메서드를
//	//	종료하고 빠져나가게 되는데, 이 때도 finally블럭이 수행된다.
//	public static void main(String[] args) {
//		method(true);
//		method(false);
//	} 
//	
//}
	
	
//	[8-6] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
	
//class Exercise8_6 {
//	public static void main(String[] args) {
//		try {
//			method1();
//		} catch(Exception e) {
//			System.out.println(5);	// <= 출력
//		}
//	}
//	
//	static void method1() {
//		try {
//			method2();
//			System.out.println(1);
//		} catch(ArithmeticException e) {
//			System.out.println(2);
//		} finally {
//			System.out.println(3);	// <= 출력
//		}
//		System.out.println(4);
//	}
//	static void method2() {
//		throw new NullPointerException();
//	}
//}
//main메서드가 method1()을 호출하고, method1()은 method2()를 호출한다.
//method2()에서 NullPointerException이 발생했는데,
//이 예외를 처리해줄 try-catch블럭이 없으므로 method2()는 종료되고,
//이를 호출한 method1()으로 되돌아갔는데 여기에는 try-catch블럭이 있긴 하지만
//NullPointerException을 처리해줄 catch블럭이 없으므로 method1()도 종료되고,
//이를 호출한 main메서드로 돌아간다. 이 때 finally블럭이 수행되어 '3'이 출력된다.
//main메서드에서는 모든 예외를 처리할 수 있는 Exception이 선언된 catch블럭이
//있으므로 예외가 처리되고 '5'가 출력된다.
	
	
//	[8-7] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

//class Exam08 {
//	static void method(boolean b) {
//		try {
//			System.out.println(1);	//
//			if(b) System.exit(0);
//			System.out.println(2);
//		} catch(RuntimeException r) {
//			System.out.println(3);
//			return;
//		} catch(Exception e) {
//			System.out.println(4);
//			return;
//		} finally {					//
//			System.out.println(5);
//		}
//		System.out.println(6);
//	}
//	public static void main(String[] args) {
//		method(true);
//		method(false);
//	}
//}
//변수 b의 값이 true이므로 System.exit(0);이 수행되어 프로그램이 즉시 종료된
//다. 이럴 때는 finally블럭이 수행되지 않는다.


//	[8-8] 다음은 1~100사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를
//	넣어서 발생한 예외이다. 예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을
//	받도록 보완하라.

//		1과 100사이의 값을 입력하세요 :50
//		더 작은 수를 입력하세요.
//		1과 100사이의 값을 입력하세요 :asdf
//		Exception in thread "main" java.util.InputMismatchException
//		at java.util.Scanner.throwFor(Scanner.java:819)
//		at java.util.Scanner.next(Scanner.java:1431)
//		at java.util.Scanner.nextInt(Scanner.java:2040)
//		at java.util.Scanner.nextInt(Scanner.java:2000)
//		at Exercise8_8.main(Exercise8_8.java:16)

//import java.util.*;
//
//class Exam08{
//	public static void main(String[] args){
//	// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기 위한 변수
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 :");
//			try{
//			input = new Scanner(System.in).nextInt();
//			} catch(InputMismatchException e){
//				System.out.println("문자가 입력됐습니다, 숫자만 다시 입력해주세요.");
//				continue;
//			}
//			if(answer > input) {
//				System.out.println("더 큰 수를 입력하세요.");
//			} else if(answer < input) {
//				System.out.println("더 작은 수를 입력하세요.");
//			} else {
//				System.out.println("맞췄습니다.");
//				System.out.println("시도횟수는 "+count+"번입니다.");
//				break; // do-while문을 벗어난다
//			}
//		} while(true); // 무한반복문
//	} // end of main
//} // end of class HighLow


//	[8-9] 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
//	[참고] 생성자는 실행결과를 보고 알맞게 작성해야한다.

//class Exam08{
//	public static void main(String[] args) throws Exception{
//		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
//	}
//}
//
//class UnsupportedFuctionException extends RuntimeException{
//	
//	private final int ERR_CODE;
//	
//	UnsupportedFuctionException(String msg, int errCode){ //생성자
//		super(msg);
//		ERR_CODE = errCode;
//	}
//	
//	public UnsupportedFuctionException(String msg) {	//생성자
//		this(msg, 100);		  //ERR_CODE를 100(기본값)으로 초기화된다.
//	}
//	
//	public int getErrorCode(){	//에러코드를 얻을 수 있는 메서드도 추가
//		return ERR_CODE;		//메서드는 주로 getMessage()와 함께 사용
//	}
//	
//	public String getMessage(){
//		return "[" + getErrorCode() + "]" + super.getMessage();
//	}
//	
//}


//	[8-10] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

//class Exam08{
//	public static void main(String[] args) {
//		try {
//			method1();
//			System.out.println(6);
//		} catch(Exception e) {
//			System.out.println(7);	// <= 출력
//		}
//	}
//	
//	static void method1() throws Exception {
//		try {
//			method2();
//			System.out.println(1);
//		} catch(NullPointerException e) {
//			System.out.println(2);	// <= 출력
//			throw e;	//예외를 다시 발생시킨다. 예외 되던지기(re-throwing)
//		} catch(Exception e) {
//			System.out.println(3);
//		} finally {
//			System.out.println(4);	// <= 출력
//		}
//		System.out.println(5);
//	} // method1()
//	
//	static void method2() {
//		throw new NullPointerException();
//	}
//}
