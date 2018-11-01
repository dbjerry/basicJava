package e_oop;

public class RecursiveCall {
	public static void main(String[] args) {
		
		RecursiveCall rc = new RecursiveCall();
		int result = rc.factorial(4);
		System.out.println(result);
	}
	
	int factorial(int number) {
		int result = 0;	
		
		if(number == 1) {
			result = 1;
		} else {
			result = number * factorial(number-1); // 재귀호출 부분
		}
		return result;
		
	}
	
	
	// JVM 만들어오기
	
}
