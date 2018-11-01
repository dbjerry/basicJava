package c_sentence;

import java.util.Scanner; // java.util.*;

public class Sentence02 {
	
	public static void main(String[] args) {
		
		/*
		1. 반복문(Loop)
			- for, while, do-while
			- 어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
			- 반복문은 주어진 조건이 만족하는 동안 주어진 문장을 반복적으로 수행한다.
			- for문은 주로 반복횟수를 알고 있을 때, while문은 반복횟수를 모를 때 사용한다.
		
		2. for문
			- 기본구조
				for( 초기화 ; 조건식 ; 증감식 ) {
					조건식이 true일 때 수행될 문장
				}
		
		
		
		*/
		for (int i = 0; i < 11; i++) {
			
			System.out.println(i);
			
		}

		// ctrl + shift + B => breakpoint
		// f6: 디버그모드 다음 줄로 넘어갈 때
		// f8: 다음 breakpoint

		// 5~15까지의 합계를 구하세요.
		
		int sum = 0; // 합계를 저장할 수 있는 변수		
		
		for ( int i = 5 ; i < 16 ; i++ ) {
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		/*
		3. while문
			- 반복횟수를 모를 때 많이 사용한다.(알 때도 사용가능)
			- 조건식과 수행해야할 블럭{}만으로 구성되어 있다.
			- 기본구조
				while(조건식){
					수행될 문장
				}				
		 */
		
		int i = 0;
		while( i < 10 ) {
			System.out.println(i);
			i++;
		}
		System.out.println("------");
		// 23~1092까지의 합계를 구하세요.
		int i1 = 23;
		int sum1 = 0; // 23~1092까지의 합계를 저장
		while( i1 < 1093 ) {
			if(i1 % 3 == 0) {
			sum1 += i1;
			}
			i1++;
		}
		System.out.println(sum1);
		
		int i2 = 23;
		int sum3 = 0;
		while( i2 < 1093 ) {
			sum3 += i2;
			i2++;
		}
		System.out.println(sum3);
		
		int sum2 = 0; // 저장해야될 변수
		for ( i = 23; i < 1093; i++ ) { // for ( 초기화; 조건식; 증감식)
			sum2 += i;
		}
		System.out.println(sum2);
		
		// 1~? 합이 100이상이 될까요?
		
		int i3 = 0;
		int sum4 = 0;
		while (sum4 < 100) {
			i3++;
			sum4 += i3;
		}
		System.out.println(i3);
		
		
		
		Scanner sc = new Scanner(System.in);// 콘솔창으로 입력받기 위해
		System.out.println("합계가 몇 이상일지 숫자를 입력해주세요");
		int endSum = sc.nextInt();			// 숫자를 입력받아서 저장
		String str = sc.next();				// 문자열을 받을 때 이용
		
		int i31 = 1;
		int sum41 = 0;
		while (true) {
			sum41 += i31;
			if(sum41 >= endSum) {
				break;
			}
			i31++;
		}
		System.out.println(i31);
		
		
		
		
	}

}
