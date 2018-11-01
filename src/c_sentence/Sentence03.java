package c_sentence;

import java.util.Scanner;

public class Sentence03 {
	
	public static void main(String[] args) {
		
		
//		int total = 0;
//		for (int dan = 2; dan < 10; dan++) {
//			
//			for (int gob = 1; gob < 10; gob++) {
//				
//				total = dan * gob;
////				if (dan % 2 == 0 && gob % 2 != 0)
//				System.out.println(dan + " * " + gob + " = " + total + "\t");
//			}
//		}
		
		int total = 0;
		int dan = 2;					// 초기화a
		while (dan < 10) {				// 조건식a
			int gob = 1;				// 초기화b
			while (gob < 10) {			// 조건식b
				
				total = dan * gob;		// 수행문
				
				System.out.println(dan + " * " + gob + " = " + total);
				gob++;					// 증감식b
			}
			dan++;						// 증감식a
		}
		
		System.out.println("-----------------");
		
		int dann = 2;
		int gobb = 1;
		while (gobb < 10) {
			System.out.println(dann + " * " + gobb + " = " + dann * gobb);
			gobb++;
		}
		
		/*
		4. do - while문
			- while문의 변형으로 기본구조는 while문과 같으나 블럭{}을 먼저 수행하고
			  그 다음 조건식을 판단한다.
			
			- 기본구조
			  do {
			  
			  } while (조건식);
		 */
		
//		Scanner sc = new Scanner(System.in);
//		String str = null;
//		do {
//			System.out.println("문자열을 입력받으세요"+ '\n' +"그만하려면 x를 입력해주세요");
//			str = sc.next();
//			System.out.println(str);
//		} while(!str.equals("x"));
		
		
		/*
		5. break문
			- 현재 위치에서 가장 가까운 switch문 또는 반복문을 나갈 때 사용한다.
		
		6. continue문
			- 반복문 내에서만 사용할 수 있다.
			- 반복문 끝으로 이동하여 다음 반복문(증감식)으로 넘어간다.
		 */
		
		
		for (int j = 0; j < 20; j++) {
			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		
		
		
		
		
	}

}
