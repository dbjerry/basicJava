package z_exam;

public class Exam04 {
	public static void main(String[] args) {
		
		
		/*
		[4-1] 다음의 문장들을 조건식으로 표현하라.
		 */
				
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		
//			10 < x && x < 20
//		
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		
//			!(ch == "\t") || (ch == " ")
//			ch != "\t" && ch != " "
//		
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//		
//			ch == 'x' || ch == 'X'
//		
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//		
//			'0' <= ch && ch <= '9'
//		
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		
//			('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') 
//		
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고
//			100으로 나눠떨어지지 않을 때 true인 조건식
//		
//			( year % 400 == 0 || year % 4 == 0 ) && year % 100 != 0
//		
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식 // boolean형의 기본값은 null, 0일 경우 false, 1일 경우 true.
//		
//			!powerOn
//			powerOn==false
//		
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
//			str == "yes" // <- 틀림. str은 주소값을 비교하기 때문에 문자 그대로를 비교하지 않음. 그래서 equals를 사용. str.equals("yes")
						// "yes".equals(str) <- 앞에 null일수도 있는게 오면 안되고 뒤로 들어가야함.
		/*
		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		 */
		
//		int total = 0;
//		for (int i = 1; i <= 20; i++){
//			if (i % 2 == 0 || i % 3 == 0) {
//				continue;
//				}	
//			total += i;
//		}
//		System.out.println(total);
		
		/*
		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		 */
//		int sum = 0;
//		int total = 0;
//		for ( int i = 1; i <=10; i++){
//			sum+=i;
//			total += sum;
//		}
//		System.out.println(total);
		
		
		/*
		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		몇까지 더해야 총합이 100이상이 되는지 구하시오.
		 */
		
		// 1-2+3-4+5-6+7-8+9-10+... = 100
		// 홀수-짝수+홀수-짝수+홀수-짝수+... = 100		
		int i;
		int sum = 0;
		for (i = 1; sum < 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			} else if (i % 2 == 0) {
				sum -= i;
			}	
			if (sum == 100) {
				break;
			}
		}
		System.out.println(i);
		
//		int sum = 0;
//		int i = 0;
//		int buho = 1;
//		while (sum<100) {
//			i++;
//			sum+=buho*i;
//			buho*= -1;
//		}
//		System.out.println("i = " + i);
//		System.out.println("sum = " + sum);
		
		
		/*
		[4-5] 다음의 for문을 while문으로 변경하시오.
		 */
//		for (int i = 0; i <= 10; i++) {		// 초기화a -> 조건식a
//		
//			for (int j = 0; j <= i; j++) {	// 초기화b -> 조건식b
//			
//				System.out.print("*");		// 수행문 -> 증감식b -> 조건식b
//			}
//			System.out.println();			// 수행문 -> 증감식a
//		}
		
		
//		int i = 0; 							// 초기화a
//		while (i <= 10) {					// 조건식a
//			
//			int j = 0;						// 초기화b
//			while(j <= i) {					// 조건식b
//				
//				System.out.print("*");		// 수행문
//				
//				j++;						// 증감식b -> 조건식b
//			}
//			System.out.println();			// 수행문
//			
//			i++;							// 증감식a
//		}
		
		
		/*
		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를
		출력하는 프로그램을 작성하시오.
		 */
		
//		for (int i = 1; i < 6; i++) {
//			//int j;
//			for (int j = 1; j < 6; j++) {
//				
//				if (i + j == 6) {
//					System.out.println(i + " " + j);
//				}
//			}
//			//System.out.println(i+" "+j);
//		}
		
		
		/*
		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를
		변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		 */
		
//			int value = (int)(Math.random()*6+1);
//			System.out.println("value:"+value);
		
		
		/*
		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고
		각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		 */
		
//		for (int x = 0; x < 11; x++) {
////			int y;
//			for (int y = 0; y < 11; y++) {
//				
//				if (2*x + 4*y == 10) {  // if문 없으면 모든 경우의 수가 출력.
//										// 원하는 조건을 넣어서 출력.
//					System.out.println("x=" + x + " " + "y=" + y);
////					break;
//				}
//			}			
////			if (x + y >= 10) {
////				continue;
////			}			
////			System.out.println("x=" + x + " " + "y=" + y);
//		}
		 
		
		
		/*
		[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를
		출력하는 코드를 완성하라. 만일 문자열이 "12345"라면,
		‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
		[Hint] String클래스의 charAt(int i)을 사용
		 */
		
		
//		String str = "12345";
//			int sum = 0;
//			for(int i=0; i < str.length(); i++) {
//					
//				sum += str.charAt(i); // charAt(0) = "12345"중 1에 해당. charAt은 0부터.
//				
//				sum -= '0';	// '1' = 49 아스키코드이고 char와 int를 상호교환 할 수 없으므로 49를 1로 표현하기 위해선 -48('0')을 해야한다.
//			}
//			System.out.println("sum="+sum);
		 
		
		/*
		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
		(1)에 알맞은 코드를 넣으시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		 */
		
//			int num = 12345;						//		int sum1 = num/10000%10;
//			int sum = 0;							//		int sum2 = num/1000%10;
//			for (int i = 1; i > 0; i*=10) {			//		int sum3 = num/100%10;
//				
//													//		int sum4 = num/10%10;
//				sum += num / i % 10; 				//		int sum5 = num/1%10;
//				
//													//		int sum = sum1 + sum2 + sum3 + sum4 + sum5;
//			}
//			System.out.println("'" + num + "'" + "의 각 자리 합은 : " + sum + " 이다.");
		
		
		/*
		[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를
		만들어 나가는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는
		2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과
		같은 식으로 진행된다. 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지
		계산하는 프로그램을 완성하시오.
		 */
		
//		int a = 1;
//		int b = 1;
//		int c = 0;
//		for (int i = 0; i < 8; i++) {
//			
//			c = a + b;
////			System.out.println(i + "바퀴째 " + " a=" + a + " b=" + b + " c=" + c);
//			a = b;
//			b = c;
//			
//		}
//		System.out.println(c);
		
		
		/*
		[4-12] 구구단의 일부분을 다음과 같이 출력하시오.
		 */
				
//		int sum = 0;
//		for (int j = 1; j < 4; j++) {
//			for (int i = 2; i < 5; i++) {
//				sum = i * j;
//				System.out.print(i + "*" + j + "=" + sum + "\t");
//				if (i == 4) {
//					System.out.println();
//				}
//			}
//		}
//		System.out.println();
//		
//		for (int j = 1; j < 4; j++) {
//			for (int i = 5; i < 8; i++) {
//				sum = i * j;
//				System.out.print(i + "*" + j + "=" + sum + "\t");
//				if (i == 7) {
//					System.out.println();
//				}
//			}
//		}
//		System.out.println();
//		
//		for (int j = 1; j < 4; j++) {
//			for (int i = 8; i < 10; i++) {
//				sum = i * j;
//				System.out.print(i + "*" + j + "=" + sum + "\t");
//				if (i == 9) {
//					System.out.println();
//				}
//			}
//		}
		
		
		
		/*
		[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.
		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		 */
		
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		int j = 0;
//		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
//		// 하나씩 읽어서 검사한다.
//		for(int i=0; i < value.length() ;i++) {
//			
//			ch = value.charAt(i);
//			
//			if	(!('0' <= ch && ch <= '9')) {
//				
//				isNumber = false;
//				
////				 j += 1+i;
//				
//				break;
//				
//			}
//			
//		}
//		if (isNumber) {
//			System.out.println(value+"는 숫자입니다.");
//		} else {
//			System.out.println(value + "의 " + j + "번째는 숫자가 아닙니다.");
//		}
		
		
		/*
		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로
		입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면,
		컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
		사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
		(1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
		 */
		
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int)(Math.random()*100+1);
//		int input = 0; 		// 사용자입력을 저장할 공간
//		int count = 0; 		// 시도횟수를 세기위한 변수
//		
//		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//		java.util.Scanner s = new java.util.Scanner(System.in);
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 :");
//			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//			
//			if (answer > input) { 
//			System.out.println("더 큰 수를 입력하세요.");
//			
//			
//			} else if (answer < input) {
//			System.out.println("더 작은 수를 입력하세요.");
//			} else {
//			System.out.println("맞췄습니다.");
//			System.out.println("시도 횟수는 " + count +"입니다.");
//			break;		
//		
//			}
//			
//		} while(true); // 무한반복문
		
		
		/*
		[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란,
		숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
		예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다.
		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[Hint] 나머지 연산자를 이용하시오.
		 */
		
//		int number = 12321;
//		int tmp = number;
//		
//		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
//		
//		while(tmp !=0) {
//			result += (tmp%10);
//			tmp /= 10;
//			if(tmp==0){
//				break;
//			}
//			result *= 10;
//		}
//		System.out.println(result);
//		if(number == result)
//			System.out.println( number + "는 회문수 입니다.");
//		else
//			System.out.println( number + "는 회문수가 아닙니다.");
//		
//		
//	}
	}
}
