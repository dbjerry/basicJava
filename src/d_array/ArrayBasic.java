package d_array;

public class ArrayBasic {
	public static void main(String[] args) {
		
		/*
		1. 배열(array)란?
			- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
			ex) int mathScore = 40;
				int engScore = 90;
				int sciScore = 60;
				int korScore = 100;
				int freScore = 20;
		
		2. 배열의 선언
			- 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 알리는 대괄호 []
			를 붙이면 된다.
			
			int[] score;
			int score[];
	 	
		3. 배열의 생성
			- 배열의 생성을 위해서는 연산자 'new'와 함께 배열의 타입과 크기를
			지정해 주어야 한다. 
			int[] score = new int[5];
		 */
		
		//int[] score = new int[4];
		  int[] score = new int[] {0,1,2,3,4};
		//int[] score = {0,1,2,3,4}; 선언 및 초기화를 동시에 할 때만
		  
		for (int sco = 0; sco < score.length; sco++) {
		
			System.out.println(score[sco]);	
		}
		// 0 => 0
		// 1 => 10
		// 2 => 20
		// 3 => 30
		
//		score[0] = 0; 
//		score[1] = 10;
//		score[2] = 20;
//		score[3] = 30;
//		
//		for (int i = 0; i < 4; i++) {
//			score[i] = i*=10;
//			System.out.println(score[i]);
//		}
		
		// 1. 6과목의 점수를 저장할 수 있는 변수 score2를 선언 및 생성하세요
		
		int[] score2 = {0,1,2,3,4,5}; //int[] score2 = new int[]{0,1,2,3,4,5};
										//
		// 2. score2의 각 방의 점수를 0~100점 사이의 랜덤한 값으로 초기화하세요
		
//		score2[0] = (int)(Math.random()*101+0);
//		score2[1] = (int)(Math.random()*101+0);
//		score2[2] = (int)(Math.random()*101+0);
//		score2[3] = (int)(Math.random()*101+0);
//		score2[4] = (int)(Math.random()*101+0);
//		score2[5] = (int)(Math.random()*101+0);
		
		int sum = 0;
		for (int i = 0; i < score2.length; i++) {
			score2[i] = (int)(Math.random()*101+0);
			
		// 3. 모든 과목의 점수를 출력하세요
			
			System.out.println("score[" + i + "]" + " = " + score2[i]);
			
		// 4. 과목의 합계를 구하세요 sum
		// 합계를 출력하세요
			
			sum += score2[i];
		}
		System.out.println("전과목 합계 : " + sum);
		
		// 5. 과목의 평균을 소수점 셋째자리에서 반올림하여 둘째자리까지 표현해주세요 avg
		// 평균을 출력하세요
		
		float avg = (float)(sum)/score2.length;
		
		System.out.println("전과목 평균(1) : " + avg);
		
		avg = (float)((int)(avg*100+0.5))/100f;
		
		System.out.println("전과목 평균(2) : " + avg);
		// 6. 모든 과목 중 최대값을 구하세요 max
		// max 값을 출력하세요
		
		int max = score2[0];
		int i1 = 0;
		for (int i = 1; i < score2.length; i++) {
			
			if (max < score2[i]) {
				max = score2[i];
				i1 = i;
			}				
		}
		System.out.println("전과목 중 최대값 : " + "score[" + i1 + "] " + max);			
			
		// 7. 모든 과목 중 최소값을 구하세요
		// min 값을 출력하세요
		
		int min = score2[0];
		for (int i = 1; i < score2.length; i++) {
			
			if (min > score2[i]) {
				min = score2[i];
				
				i1 = i;
			}
		}
		System.out.println("전과목 중 최소값 : " + "score[" + i1 + "] " + min);
		
		
		
		
	}
}
