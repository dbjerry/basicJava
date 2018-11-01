package g_exception;

public class ExceptionBasic {
	public static void main(String[] args) {
		
		/*
		
		1. 프로그램 오류
			- 프로그램이 실행 중 어떤 원인에 의해서 오작동을 하거나
			비정상적으로 종료되는 경우
			- 컴파일 오류 : 컴파일 할 때 발생하는 에러
			- 런타임 오류 : 실행시에 발생하는 에러
			- 에러와 예외로 나뉜다.
				에러 : 프로그램 코드에 의해서 수습할 수 없는 심각한 오류
				예외 : 프로그램 코드에 의해서 수습될 수 있는 경미한 오류
		
		2. RuntimeException클래스와 그외 클래스들
			- 모든 예외의 최고조상은 Exception이다.
			- RuntimeException클래스들은 주로 프로그래머의 실수에 의해
			발생할 수 있는 예외
			ex) IndexOutOfBoundsException(배열에서 없는 방에 진입할 때)
			,	NullPointException(주소값이 없을 때)..
			
			- Exception클래스들은 주로 외부의 영향으로 발생할 수 있는 것들
			ex) FileNotFoundException(파일이 없다)
			,	ClassNotFoundException(클래스가 없다)..
		
					Exception
					/		\
		RuntimeException	그 외 Exception
		
		
		3. 예외처리(try-catch)
			- 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것.
			- 작성방법
			
				try{
				
					예외가 발생할 가능성이 있는 문장
					
				} catch(Exception e) {
				
					예외가 발생하였을 때 처리하기 위한 문장
					
				}
		
		4. 예외 발생시키기
			- 예외를 발생시킬 클래스의 객체를 만든다.
			Exception e = new Exception();
			
			- 키워드 throw를 이용해서 예외를 발생시킨다.
			throw e;
			
			throw new Exception();
		
		
		5. throws Exception
			- 메서드 예외 선언하기
				: 메서드의 선언부에 키워드 'throws'를 사용해서 메서드 내에서
				발생할 수 있는 예외를 적어주기만 하면 된다.
		
		
		6. finally (pdf파일에 많이 쓰인다.)
			- try-catch블럭의 예외발생에 상관없이 실행되어야할 코드를 포함한다.
			
			try{
			
				예외가 발생할 가능성이 있는 문장
				
			}catch(Exception e){
			
				예외처리를 위한 문장
				
			} finally {
			
				예외 발생에 상관없이 수행될 문장
			
			}
		
		try -> finally
		try -> catch -> finally
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
	}
}
