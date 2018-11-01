package g_exception;

public class ExceptionEx03 {
	public static void main(String[] args) {
		
		Exception e = new Exception("배우는 중");
		
		try {
			throw e; // surround with try/catch
		} catch (Exception e1) {
			//System.out.println("예외 발생됨");
			//e1.printStackTrace(); <= 잊지말자
			System.out.println(e1.getMessage());
		} 
		
		try{
			throw new RuntimeException();
		}catch(RuntimeException e1){
			e1.printStackTrace();
		}
		
		System.out.println("배우는 중2");
		
		//컴파일러가 예외처리를 강제하지 않는 경우
		//1. RuntimeException클래스들
		//2. Error와 그 자손
		//이런 것들을 'unChecked예외'라고 부른다.
		
		
	}
}
