package z_exam;

public class ArrayOther_exam2 {

	public static void main(String[] args) {
		
		//3. 7명의 이름을 하나의 변수에 저장하세요. name
		String[] name = {"지태","박진","찬배","효민","종훈","규승","정현"};

		//4. 6과목명을 출력하세요. sub
		String[] sub = {"국어","영어","수학","사회","과학","Java"};
		
		//1, 5. 7명의 6과목을 저장할 수 있는 변수를 선언 및 생성해주세요. score
		int[][] score = new int[name.length][sub.length];
		int[] sum = new int[name.length];
		float[] avr = new float[name.length];
		int[] subSum = new int[sub.length];
		float[] subAvr = new float[sub.length];
		int[] rank = new int[name.length];
		
		//2. score변수의 모든 방을 0~100사이의 랜덤한 정수값을 저장해주세요.
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random()*101+0);
			}
		}
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < sub.length; j++) {
				sum[i] += score[i][j];
			}
		}
		for(int i = 0; i < name.length; i++) {
			avr[i] = (int)((float)sum[i]/sub.length*100f+0.5)/100f;
		}
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < sub.length; j++) {
				subSum[j] += score[i][j]; 
			}
		}
		for(int i = 0; i < sub.length; i++) {
			subAvr[i] = (int)((float)subSum[i]/name.length*100f+0.5)/100f;
		}
		for(int i = 0; i < name.length; i++) {
			int stat = 1;
			for(int j = 0; j < name.length; j++) {
				if(sum[i] < sum[j]) {
					stat++;
				}
				rank[i] = stat;
			}
		}
		
		//출력문장
		for(int i = 0; i < sub.length; i++) {
			System.out.print("\t" + sub[i]);
		}
		System.out.print("\t" + "합계" + "\t" + "평균"+ "\t" + "순위");
		System.out.println();
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j <sub.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.print(avr[i]+"\t");
			System.out.print(rank[i]);
			System.out.println();
		}
		System.out.println();
		System.out.print("과목합계"+"\t");
		for(int i = 0; i < sub.length; i++) {
			System.out.print(subSum[i]+"\t");
		}
		System.out.println();
		System.out.print("과목평균" + "\t");
		for(int i = 0; i < sub.length; i++) {
			System.out.print(subAvr[i]+"\t");
		}
		
		
		
		
		
		
	}
}