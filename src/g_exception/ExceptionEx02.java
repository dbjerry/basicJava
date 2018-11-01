package g_exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 0;
		try{
			//1. 수행될 문장을 작성한다.
			System.out.println(a);
			
			//2. 예외가 발생한다.
			System.out.println(a/b);
			
			//3. 수행될 문장을 적는다.
			System.out.println(b);
			//4. 일치하는 예외를 찾는다.
		}catch(ArithmeticException e){
			System.out.println("0으로 나누지마시오");
		}catch(Exception e){
			
			System.out.println("Exception대장");
		}
		
		//수행될 문장을 적는다.
		System.out.println("시스템종료");
		
		
		
		
		
		
	}
}
