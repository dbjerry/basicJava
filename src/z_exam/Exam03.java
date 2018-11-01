package z_exam;

public class Exam03 {

	public static void main(String[] args) {
		
		
		//[3-1] 다음 연산의 결과를 적으시오.
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33); // 6
		// x << n --> x * 2^n
		System.out.println(y >= 5 || x < 0 && x > 2); //true
		// ||(OR결합)은 둘 중 하나라도 맞으면 true
		System.out.println(y += 10 - x++); // y=13, x=3
		// 10-x++ = 8 --> 5+8 = 13
		System.out.println(x+=2); // 4 or 5
		// x = x + 2 ,  3번째 sysout 때문에 답이 5가 될수도!
		System.out.println( !('A' <= c && c <='Z') ); //false
		// 'A' <= c && c <= 'Z'는 맞지만 !가 논리부정 연산자
		System.out.println('C'-c); // 2
		// char c = 'A', A는 아스키코드 65, 67-65=2
		System.out.println('5'-'0'); // 5
		// 아스키코드표 '5'=53, '0'=48, 53-48
		System.out.println(c+1); // 66
		// char c = 'A', A는 아스키코드 65, 65+1
		System.out.println(++c); // B or 66
		// 전위연산자, char -> char.
		System.out.println(c++); // A or B or 65 or 66
		// 후위연산자여서. or 위에 sysout 때문에
		System.out.println(c); // A or 65 or C or 67
		// A or 위 sysout에서 걸린 후위연산자 때문에 C or 67
		
		
		
		/*
		[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
		만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
		13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		*/
		
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (int)(numOfApples/(float)sizeOfBucket+0.9f); // 모든 사과를 담는데 필요한 바구니의 수 // 내 식은 정확하지 않음.(조건부여가 안되서)
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		System.out.println(numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket>0? 1 : 0)); // 이 식으로 변수 값이 바뀔 때도 사용.
		
		
		
		
		/*
		[3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다.
		삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		[Hint] 삼항 연산자를 두 번 사용하라.
		*/
		
		int num = 10;
		System.out.println(0 < num ? "양수": (num < 0 ? "음수" : "0"));	
		// 0보다 크면 양수(true), 아닐시 false(0보다 작으면 음수(true)
		

		
		
		/*
		[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		만일 변수 num의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다.
		(1)에 알맞은 코드를 넣으시오.
		*/
		
		int num1 = 456;
		System.out.println( ((int)(num1/=100F))*100 );
		// 456을 4.56으로 만들고 인트화 한 뒤 다시 100을 곱하여 100의 자리수로 만들기 
		
				
		/*
		[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다.
		만일 변수 num의값이 333이라면 331이 되고, 777이라면 771이 된다.
		(1)에 알맞은 코드를 넣으시오.
		*/
		
		int num2 = 333;
		System.out.println((num2/10)*10+1);
		// 333에서 33.3으로 만들고 int화 시키고 다시 330을 만든 후 +1
		
		
		
		/*
		[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서
		변수 num의 값을 뺀 나머지를 구하는 코드이다. 예를 들어,
		24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고,
		81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에
		변수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		[hint] 나머지 연산자를 사용하라.
		*/
		
		int num3 = 24;
		System.out.println( 10 - num3 % 10);
		System.out.println((num3/10+1)*10 - num);
		/*int num = (int)(Math.random()*101+0);
		System.out.println(num3);
		System.out.println(num3 % 10);
		System.out.println(10 - num3 % 10);*/
		
		
		
		/*
		[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
		변환공식이 'C = 5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오.
		단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.
		(Math.round()를 사용하지 않고 처리할 것)
		*/
		
		int fahrenheit = 100;
		float celcius = ( ((int)((5/9F*(fahrenheit-32))*100+0.5f))/100f );
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		//공식에서 5/9에 F 붙혀서  소수점자리 표현해주고 소수점 둘째자리까지
		//정수로 올리고 +0.5f로 반올림 한 후 int화로 소수점이하 버리고
		//다시 100을 곱하여 소수점 둘째자리 만들어 준 후 f붙혀서 소수점 표현
				
		
		
		//[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		
		
		byte a = 10;
		byte b = 20;
		byte c1 = (byte)(a + b); //형변환
		
		char ch = 'A';
		ch = (++ch) ; // char는 단독연산이면 문자코드 한 칸 위로
		
		float f = 3 / 2f; // f를 씀으로 소수점표현
		long l = 3000L * 3000 * 3000; // L이 빠져서 인트범위 내에서 overflow됨.
		
		float f2 = 0.1f; 
		double d = 0.1f; // 0.1f 와 0.1(d)는 다른 숫자를 표현함으로 false. 
		
		boolean result = d==f2; 
		
		System.out.println("c="+c1);
		System.out.println("ch="+ ++ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		
		
		/*
		[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나
		숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.
		(1)에 알맞은 코드를 넣으시오.
		*/
		
		char ch1 = 'z';
		boolean b1 = ( 'A' <= ch1 && ch1 <= 'Z' || 'a' <= ch1 && ch1 <= 'z' 
				|| '0' <= ch1 && ch1 <= '9');
		System.out.println(b1);
		// 'A'보다 크거나 같고 'Z'보다 작거나 같고,
		// 'a' 보다 크거나 같고 'z'보다 작거나 같고,
		// '0'보다 크거나 같고 '9'보다 작거나 같으면 boolean형에 의해
		// true 혹은 false 값으로 표현
		
		
		
		/*
		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데,
		문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
		문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를들어
		'A'의 코드는 65이고 'a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
		*/
		
		char ch2 = 'A';
		char lowerCase = ('A' <= ch2 || ch2 >= 'Z') ? ((char)(ch2+32)) : ch2;
		System.out.println("ch:"+ch2);
		System.out.println("ch to lowerCase:"+lowerCase);
		// ch가 char로 'A'보다 크거나 같고, 'Z'보다 작거나 같으면
		// ch+32(+32는 소문자로 가는 길) 그리고 false면 입력한 값 ch가 그대로 나옴.  
		
		
		
		}

}
