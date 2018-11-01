package e_oop;

import java.util.Scanner;

public class PrintCall {
	public static void main(String[] args) {
		
		Calc2 call = new Calc2();
		int result = call.add();
		System.out.println(call.add());						// a1 + a2
		
		int result2 = call.add(5, 6);
		System.out.println(call.add(5, 6));					// int x + int y
		
		int result3 = call.add(5);
		System.out.println(call.add(5));					// int x + a1 + a2
		
		long result4 = call.add(5000, 10000000000000000L);
		System.out.println(call.add(5000, 10000000000000000L));		// int x + long y
		
		long result5 = call.add(90000000000000L, 9999999999999L);
		System.out.println(call.add(90000000000000L, 9999999999999L));	// long x + long y
		
	}

}

class Calc2 {
	
	int a1 = 3;
	int a2 = 4;
	
	//1. 인스턴스변수 'a1과 a2의 합'을 반환하는 메서드를 만드세요 add
	int add() {
		int sum = a1 + a2;
		return sum;
	}
	//2. 매개변수 int형 두개를 받아서 '두 값의 합'을 반환하는 메서드를 만드세요. add
	int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
	//3. 매개변수 int형 하나를 받아서 '매개변수와 a1과 a2의 합'을 반환하는 메서드를
	//만드세요. add
	int add(int x) {
		int sum = x + a1 + a2;
		return sum;
	}
	//4. 매개변수 int형 하나와 long형 하나를 받아서 두개의 합을 반환하는 메서드를
	//만드세요. add
	long add(int x, long y) {
		long sum = x + y;
		return sum;
	}
	//5. 매개변수 long형 두개를 받아서 두 값의 합을 반환하는 메서드를 만드세요. add
	long add(long x, long y) {
		long sum = x + y;
		return sum;
	}
	
	

	
	
	
	
}