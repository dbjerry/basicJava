package d_array;

public class ArrayOther_exam {

public static void main(String[] args) {
		
		//3. 7명의 이름을 하나의 변수에 저장하세요. name
		String[] name = {"김지태", "박  진", "박찬배", "김효민", "김종훈", "임규승", "김정현"}; // 이름 배열 선언 및 초기화

		//4. 6과목명을 출력하세요. sub
		String[] sub = {"국어", "영어", "수학", "사회", "과학", "Java"}; // 과목명 배열 선언 및 초기화
		
		//1, 5. 7명의 6과목을 저장할 수 있는 변수를 선언 및 생성해주세요. score
		int[][] score = new int [name.length][sub.length];	// 개인점수 배열 선언
		int[] sum = new int [name.length];					// 개인합계 배열 선언
		float[] avr = new float [name.length];				// 개인평균 배열 선언
		int[] total = new int [name.length];				// 과목합계 배열 선언
		float[] subAvr = new float [sub.length];			// 과목평균 배열 선언
		int[] rank = new int [name.length];
//		int[] srt = new int [name.length];					// 개인합계 정렬 배열 선언
		//2. score변수의 모든 방을 0~100사이의 랜덤한 정수값을 저장해주세요.
		for(int i = 0; i < score.length; i++) {				// 개인 랜덤점수 for문
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = (int)(Math.random()*101+0);
			}
		}
		for(int i = 0; i < name.length; i++) {				// 개인 합계점수 for문
			for(int j = 0; j < sub.length; j++) {
				sum[i] += score[i][j];
			}
		}
		for(int i = 0; i < name.length; i++) {				// 개인 평균점수 for문
			avr[i] = (int)((float)sum[i]/sub.length*100f+0.5)/100f;
		}
		for(int j = 0; j < name.length; j++) {				// 과목 합계점수 for문 
			for(int i = 0; i < sub.length; i++) {
				total[i] += score[j][i];
				subAvr[i] = (int)((float)total[i]/name.length*100f+0.5)/100f; // 과목 평균점수
			}
		}
		for(int i = 0; i < name.length; i ++) {			//개인 순위 for문
			int stat = 1;
			for(int j = 0; j < name.length; j++) {
				if(sum[i] < sum[j]) {
					stat++;
				}
			}
			rank[i] = stat;
		}
//		for(int i = 0; i < name.length-1; i++) { 				// <- 기준 인덱스가 되는 for문
//			for(int j = i+1; j < name.length; j++) { 	// <- 비교 인덱스가 되는 for문
//				int temp = 0; 							// <- 비교시 필요한 임시저장 변수
//				if (rank[i] < rank[j]) {
//					temp = name[0];
//					srt[i] = srt[j];
//					srt[j] = temp;
//				}
//			}
//			System.out.println(srt[i]);
//		}
//		System.out.println();
		//출력문장
		for(int i = 0; i < sub.length; i++) {				// 과목명 출력 for문
			System.out.print("\t");
			System.out.print(sub[i]);
		}
		System.out.print("\t"+"합계"+"\t"+"평균"+"\t"+"순위");	// 합계, 평균명 출력
		System.out.println();
		for(int i = 0; i < score.length; i++) {				// 학생이름 출력 for문
			System.out.print(name[i]+"\t");
			for(int j = 0; j < score[i].length; j++) {		// 랜덤점수 출력 for문
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");					// 개인 합계점수 출력
			System.out.print(avr[i]+"\t");					// 개인 평균점수 출력
			System.out.print(rank[i]);						// 개인 순위 출력
			System.out.println();
		}
		System.out.println();
		System.out.print("과목합계"+"\t");					// 과목합계명 출력
		for(int j = 0; j < sub.length; j++) {				// 과목 합계점수 출력
			System.out.print(total[j]+"\t");
		}
		System.out.println();
		System.out.print("과목평균"+"\t");					// 과목평균명 출력
		for(int j = 0; j < sub.length; j++){				// 과목 평균점수 출력
		System.out.print(subAvr[j]+"\t");
		}
		
		
	}
}
