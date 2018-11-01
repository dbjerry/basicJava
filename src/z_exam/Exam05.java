package z_exam;

public class Exam05 {
	
	public static void main(String[] args) {
		
		/*
		[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
		하시오.
		
		a. int[] arr[];							[O]
		b. int[] arr = {1,2,3,};				[O]
		c. int[] arr = new int[5];				[O]
		d. int[] arr = new int[5]{1,2,3,4,5};	[X] : Index 갯수 설정과 Index값 설정을 같이 하면 안됨
		e. int arr[5];							[X]	: 배열 선언과 동시에 Index 갯수를 설정할 수 없음
		f. int[] arr[] = new int[3][];			[O]
		*/
		
		
		/*
		[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
		*/
		
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{ 10, 10, 10},
				{ 20, 20, 20, 20},
				{ 30, 30}
				};
		// 답은 2
		System.out.println(arr[3].length);
		
		
		/*
		[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		*/
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println("sum="+sum);
		
		
		/*
		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		*/
		
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int total = 0;
		float average = 0;
		int count = 0;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
				count++;
			}
		}
		average = (float)total/count;
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		
		/*
		[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
		(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
		*/
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
				tmp = ballArr[i];
				ballArr[i] = ballArr[j];
				ballArr[j] = tmp;
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i];
			System.out.print(ball3[i]);
		}
		System.out.println();
		
		/*
		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		*/
		
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = money;
			money &= coinUnit[i];
			coinNum /= coinUnit[i];
			System.out.println(coinUnit[i]+"원짜리 "+coinNum+"개");
		}
		
		
		/*
		[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터
		거슬러 줄금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면,
		‘거스름 돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면,
		거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		*/
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money1 = Integer.parseInt(args[0]);
		System.out.println("money="+money1);
		System.out.println("=사용한 동전의 개수=");
		int[] coinUnit1 = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin1 = {5, 5, 5, 5}; // 단위별 동전의 개수
		for(int i=0;i<coinUnit1.length;i++) {
		/* (1) 아래의 로직에 맞게 코드를 작성하시오.
		1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
		2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
		(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
		3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
		*/
			int coinNum1 = money1/coinUnit1[i];
			if(coin1[i] < coinNum1){
				coinNum1 = coin1[i];
			}
			money1 -= coinNum1*coinUnit1[i];
			coin1[i] -= coinNum1;
			System.out.println(coinUnit1[i]+"원: "+coinNum1);
		}
		if(money1 > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("=남은 동전의 개수 =");
		for(int i=0;i<coinUnit1.length;i++) {
			System.out.println(coinUnit1[i]+"원:"+coin1[i]);
		}
		
		
		/*
		[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼
		‘*’을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
		*/
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
			switch(answer[i]) {
			case 1:
				counter[0]++;
				break;
			case 2:
				counter[1]++;
				break;
			case 3:
				counter[2]++;
				break;
			case 4:
				counter[3]++;
				break;
			}
			//counter[answer[i]-1]++;
		}
		for(int i = 0; i < counter.length;i++) {
			System.out.println();
			System.out.print(counter[i]);
			for(int j = 0; j < counter[i]; j++)
			System.out.print("*");
		}
		System.out.println("\n");
		
		/*
		[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
		*/
		
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
				};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				 result[j][i] = star[3-i][j];
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
		/*
		[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
		배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
		(1)에 알맞은 코드를 넣어서 완성하시오.
		*/
		
		int[][] score1 = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
				};
		int[][] result1 = new int[score1.length+1][score1[0].length+1];
		for(int i = 0; i < score1.length; i++) {
			for(int j = 0; j < score1[i].length; j++) {
				result1[i][j] = score1[i][j];
			}
		}
		for(int i = 0; i < score1.length; i++) {
			for(int j = 0; j < score1[i].length; j++) {
				result1[i][score1[i].length] += result1[i][j];
			}
		}
		for(int i = 0; i < result[i].length; i++) {
			for(int j = 0; j < score1.length; j++) {
				result1[score1.length][i] += result1[j][i];
			}
		}
		for(int i = 0; i < result1.length; i++) {
			for(int j = 0; j < result1[i].length; j++) {
				System.out.printf("%4d",result1[i][j]);
			}
			System.out.println();
		}

		
		
		
	}

}
