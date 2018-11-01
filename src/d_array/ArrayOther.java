package d_array;

import java.util.Arrays;

public class ArrayOther {

	public static void main(String[] args) {
		
		/*
		1. 다차원 배열
			- Java에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
			- 2차원 배열의 선언
				선언방법					선언예
			  타입[][] 변수명;			int[][] score; (가독성 좋음)
			  타입 변수명[][];			int score[][];
			  타입[] 변수명[];			int[] score[];
		 */
		
		int[][] score3 = new int[3][]; // 배열 3개를 감싸는 작은 배열 위에 큰 배열
		score3[0] = new int[3]; //{0,0,0}
		score3[1] = new int[4]; //{0,0,0,0}
		score3[2] = new int[5]; //{0,0,0,0,0}
		//작은 배열의 갯수가 같을 때엔 작은 배열[]에 입력해도 된다. ex) score3 = new int[3][3];
		System.out.println(score3.length); // 큰 배열 안에 작은 배열의 길이(인덱스 갯수)
		System.out.println(score3[2].length); // 작은 배열을 지정. 작은 배열의 길이(인덱스 갯수)
		
//		score3[0][0] = 10;
//		score3[0][1] = 10;
//		score3[0][2] = 10;
//		
//		score3[1][0] = 20;
//		score3[1][1] = 20;
//		score3[1][2] = 20;
//		score3[1][3] = 20;
//		
//		score3[2][0] = 30;
//		score3[2][1] = 30;
//		score3[2][2] = 30;
//		score3[2][3] = 30;
//		score3[2][4] = 30;
		
		for (int i = 0; i < score3.length; i++) {			// 큰 배열
			for (int j = 0; j < score3[i].length; j++) {	// 작은 배열
				score3[i][j] = (i+1)*10;
			}
//			for (int j = 0; j < score3[1].length; j++) {
//				score3[1][j] = 20;
//			}
//			for (int j = 0; j < score3[2].length; j++) {
//				score3[2][j] = 30;
//			}
			System.out.println(Arrays.toString(score3[i]));
		}
		

		
	}
	
}
