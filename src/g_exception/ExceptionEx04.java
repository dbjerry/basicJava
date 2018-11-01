package g_exception;

public class ExceptionEx04 {
	public static void main(String[] args) {
		
		method1();
		
	}
	
	static void method1(){
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void method2() throws Exception{//,,,
		throw new Exception("메서드 2번에서 발생");
	}
	
}
