package e_oop;

import java.util.Scanner;

public class MyMathTest {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		/*
		// add1메서드를 호출하세요
		c.add1(); // 메서드 호출할 때 제일 중요한건 매개변수 타입과 갯수!!!!
		
		// add2메서드를 호출하세요
		// 호출결과를 result변수에 저장하고 출력해주세요
		int result = c.add2(4, 6); //인자값
		System.out.println(result);
		
		int result1 = c.substract(3, 2);
		System.out.println(result1);
		
		//3. multiply메서드를 호출하고 그 결과값을 변수에 저장하세요
		// 100,000,000, 5000 => 500,000,000,000
		long cal1 = c.multiply(100000000, 5000);
		System.out.println(cal1);
		
		//4. divide메서드를 호출하고 그 결과값을 변수에 저장해주세요
		//		341, 3 = 113.67
		float cal2 = c.divide(341, 3);
		System.out.println(cal2);
		
		//5. JVM 그려오세요
		
		//6. main메서드 안을 비우세요(Scanner)
		//	 사용자로부터 정수값 1개, 사칙연산 부호 1개, 정수값 1개
		//	 계산기를 완료해주세요
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 사칙연산(+,-,*,/) 계산기 ]" + "\n" + "(종료는 '@' 버튼을 누르소)" + "\n");

		do {
			double total = 0;
			String input;
			System.out.print("1)숫자(정수)를 입력하소 : ");			//첫번째 정수입력 Scanner
			int literal1 = scan.nextInt();
			
			System.out.print("2) 사칙연산자(+,-,*,/)를 입력하소 : ");	//두번째 부호입력 Scanner
			String arithmetic = scan.next();
			if(arithmetic.equals("@")) {							//@부호일 경우 종료 조건(if)문
				System.out.println("종료됐소");
				return;
			}
			System.out.print("3)숫자(정수)를 입력하소 : ");			//세번째 정수입력 Scanner
			int literal2 = scan.nextInt(); 
	
			
			if(arithmetic.equals("+")) {
				int result = c.add2(literal1, literal2);
				total = result;
				System.out.println("\n" + "결과 : "+total);
				
			} else if(arithmetic.equals("-")) {
				int result = c.substract(literal1, literal2);
				total = result;
				System.out.println("\n" + "결과 : "+total);
				
			} else if(arithmetic.equals("*")) {
				long result = c.multiply(literal1, literal2);
				total = result;
				System.out.println("\n" + "결과 : "+total);
				
			} else if(arithmetic.equals("/")) {
				float result = c.divide(literal1,  literal2);
				if(literal2 == 0) {
					result = 0;
					total = result;
				}
				System.out.println("\n" + "결과 : "+total);
			}
//			if(input.equals("c")){
//				total = 0;
//			}
			
			System.out.println("\n"+"또 해보소");
		} while(true);
		/*
		//1번들 추가문제
		// 해당 계산기가 지속적으로 사용할 수 있도록 만드시고
		// 부호 대신 @를 입력하였을 때 종료될 수 있도록 만들어주세요.
		*/
	}
	
}


class Calc {
//	int a = 10; // a의 값은 0이 됐다가 10이 되는게 아니라 10으로 바로 초기화.
//	int b = 20;
	
//	void add1() {
//		int result = a + b;
//		System.out.println(result);
//	}
	
	int add2(int x, int y) { //매개변수
		int result = x + y;
		return result;
	}
	
	// int형 매개변수 두 개를 받아서 먼저 받은 값에서 나중에 받은 값을 뺀
	// 결과값을 반환하는 메서드를 만드세요 substract
	int substract(int x, int y) {
		int result = x - y;
		return result;
	}
	//1. 매개변수 두 개를 받아 두 값의 곱을 반환하는 메서드를 만드세요 multiply
	//	단, 오버플로우를 고려하여 만드세요
	long multiply(int x, int y){
		long result = (long)x * y;
		return result;
	}
	
	//2. 정수값 두 개를 받아 앞의 값을 뒤의 값으로 나눈 값을 반환하는 메서드를 만드세요
	// divide
	// 단, 소수점 셋째자리에서 반올림하여 둘째자리까지 표현하세요
	float divide(int x, int y){
		float result = (int)((float)x/y*100+0.5f)/100f;
		return result;
	}
	
	
}