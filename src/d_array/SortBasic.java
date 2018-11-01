package d_array;

import java.util.Arrays;

public class SortBasic {

	public static void main(String[] args) {
		
		/*
		1. 정렬
			- 어떤 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터를 가지런히
			나열하는 작업이다.
			- 종류 : 버블정렬, 선택정렬, 삽입정렬
			
			
		2. 버블정렬(bubble sort)
			- 인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
			- (오름차순 기준, 한 회전이 끝나면)가장 큰 값을 뒤로 보낸다.
		 */
		
		
		int[] arr = {4, 5, 3, 2, 1};
		//int[] arr = new int[]{5,2,3,1,4};
		
//		if (arr[1] > arr[2]) {
//			i1 = arr[1];
//			arr[1] = arr[2];
//			arr[2] = i1;
//		}
//		
//		if (arr[2] > arr[3]) {
//			i1 = arr[2];
//			arr[2] = arr[3];
//			arr[3] = i1;
//		}
//		
//		if (arr[3] > arr[4]) {
//			i1 = arr[3];
//			arr[3] = arr[4];
//			arr[4] = i1;
//		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {	// j는 인덱스 값들끼리 비교할 때에 기준이 되는 인덱스
														// length-1-i -> 
														// 인덱스길이와 인덱스갯수는 다르다(인덱스갯수 = 인덱스길이-1)
				if (arr[j] > arr[j+1]) {				// 인덱스끼리 비교하고 조건이 맞을 때 자리를 바꿔주는 if문
					int temp = arr[j];					// temp는 인덱스 값들의 자리를 바꿀 때 임시저장하는 변수
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		
		System.out.println("------------");
		int[] srt = new int[]{5, 4, 3, 2, 1};
		// 5, 4, 3, 2, 1 중에 기준방 0번인덱스

		
		/*
		3. 선택정렬(select sort)
			- 정렬의 대상에서 최소값을 찾아서 맨 앞의 내용과 교체하는 방식
			- 한 회전 후 가장 작은 수가 기준방에 확정
		 */
		
		
		for (int i = 0; i < srt.length-1; i++) { 				// <- 기준 인덱스가 되는 for문
			System.out.println(i+1+"회전");
			for (int j = i+1; j < srt.length; j++) { 	// <- 비교 인덱스가 되는 for문
				int temp1 = 0; 							// <- 비교시 필요한 임시저장 변수
				if (srt[i] > srt[j]) {
					temp1 = srt[i];
					srt[i] = srt[j];
					srt[j] = temp1;
				}
				System.out.println(Arrays.toString(srt));
			}
		}
		
		int[] num = new int[] { 5, 2, 3, 1, 4 };
		// 1회전 => 0번방
		for(int i = 0; i < num.length - 1; i++) {
			// 1. 최소값 찾기
			int min = num[i];
			int minbang = i;
			for(int j = i+1; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
					minbang = j;
				}
			}
			//2. 자리바꾸기
			int temp = num[i];
			num[i] = num[minbang];
			num[minbang] = temp;
			System.out.println(i+1+"회전");
			System.out.println(Arrays.toString(num));
		}
		
		/*
		4. 삽입정렬(insert sort)
			- 정렬의 대상을 하나씩 늘려가면서 정렬이 필요한 요소를 선택해 적절한
			위치에 삽입해 가는 방식이다.
		 */
		
		
		
		
	}
}
