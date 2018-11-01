package b_operation;

public class OperationEx01 {
	public static void main(String[] args) {
		/*
		1. 증감연산자(++, --)
		  - 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
		  - 감소연산자(--) : 피연산자의 값을 1 감소시킨다.
		*/  
		int i = 3;
		i++; // i = 4
		++i; // i = 5
		
		System.out.println(i);
	
		int i2 = 7;
		int i3 = 5;
		
		int i4 = ++i2 + i3; // i2 = 8, i3 = 3, i4 = 13;
		System.out.println(i4);
		
		int i5 = i2++ + i3; // 8 => i2=9, 8+5=13
		System.out.println(i5);
		
		int i9 = 21;
		int i10 = 5;
		int i11 = ++i9 + ++i10 + i9++ + ++i10; // 57
		
		System.out.println(i11);
		
		/*
		2. 부호연산자(+,-)
		  - 기본형 중에 boolean형과 char형에는 사용할 수 없다.
		  
		3. 비트전환 연산자(~)
		  - 정수형과 char형에만 사용 가능하다.
		  - 피연산자를 2진수로 표현했을 때 0은 1로, 1은 0으로 변환한다.
		*/		
		byte b = -28;
		int c = ~b;
		System.out.println(c);
		
		/*
		4. 논리부정 연산자(!)
		  - boolean형에만 사용 가능
		  - true -> flase, flase -> true
		  - tv전원버튼과 같은 토글버튼을 논리적으로 구현할 수 있다.
		*/
		
		//false의 값을 저장하는 power변수를 선언 및 초기화하세요.
		
		boolean power = false;
		System.out.println(!power);
		
		power = !power;
		System.out.println(power);
		
		/*
		5. 산술연산자
		  - 사칙연산자(+. -, *, /), 나머지연산자(%), 쉬프트연산자(<<,>>,>>>)
		    두 개의 피연산자를 취하는 이항연산자이다.
		  - 이항연산자의 경우 피연산자의 크기가 4byte형보다 작으면 4byte(int)로
		    변환 후 연산을 수행한다.
		  
		6. 사칙연산자(+,-,*,/)
		  - int형(4byte)보다 작은 자료형 간의 연산은 int형으로 변환 후 연산한다.
		    : byte + short => int + int
		    
		  - 두 개의 피연산자 중 자료형의 크기가 큰 쪽에 맞춰서 형변환 후 연산한다.
		    : byte + long => long + long
		    : char + float => float + float
		    
		  - 정수형 간의 나눗셈에는 0으로 나누는 것은 금지되어 있다.
		  
		*/
		
		byte aa = 1;
		short bb = 29;
		//aa와 bb의 합을 저장할 수 있는 변수를 만들어 aa와 bb의 합의 결과를 저장해주시오.
		   
		int dd = aa+bb;
		System.out.println(dd);
		  
		  		  
		char cc = 'F'; // 'F' = 70
		byte ff = 120;
		 
		// cc와 ff의 곱을 저장할 수 있는 변수 gg를 선언 및 초기화하세요.
		  
		int gg = cc*ff;
		System.out.println(gg);  // 8400
		  
		int hh = 10;
		int ii = 2147483647;
		 
		// hh와 ii의 합을 jj라는 변수에 저장해주세요
		// 단, 정상적인 값이 출력되도록
		 
		long jj = (long)hh+ii;		 
		System.out.println(jj);
		 
		/*
		7. 나머지 연산자(%)
		  - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난
		    나머지 값을 돌려주는 연산자이다.
		  - boolean형을 제외한 모든 기본형에 사용 가능하다.
		*/
		 
		int ba = 10;
		int ca = 3;
		 
		// ba를 ca나눈 몫을 share라는 변수에 저장하시오.
		 
		int share = ba/ca; //3
		int remain = ba%ca;//1
		// 10을 3으로 나눈 몫은 3이고, 나머지는 1이다.
		// ba   c          share        remain
		 
		String first = ba+"을 "+ca+"으로 나눈 몫은 ";
		String second = +share+"이고 나머지는 "+remain+"이다.";
		 
		System.out.println(first+second);
		
		
		/*
		8. 쉬프트 연산자(<<,>>,>>>)
		  - 정수형 변수에만 사용 가능하다.
		  - 피연산자의 각 자리(2진수) 오른쪽으로 이동한다.
		  - 곱셈과 나눗셈을 할 때 연산속도가 좋음으로 사용한다.
		  - << : x<<n은 x*2^n
		  - >> : x>>n은 x/2^n
		  - 양수이면 빈 곳을 0으로 채우고 음수이면 빈 곳을 1로 채운다.
		  
		*/
		
		System.out.println(10 << 18);
		
		
		/*
		9. 비교연산자
		  - 두 개의 변수 또는 리터럴(값)을 비교하는데 사용되는 연산자
		  - 주로 조건문과 반복문의 조건식(true, false)에 사용되며 연산결과는
		    true 또는 false이다. 
		  - 이항연산자
		
		10. 대소비교연산자( < , > , <= , >= )
		  - 기본형 중에 boolean형을 제외한 자료형에 사용할 수 있다.
		    (char + char = int라 가능)
		
		11. 등가비교연산자( == , != )
		  - 모든 자료형에 사용할 수 있다.
		  - 기본형의 경우에는 저장된 값을 비교,
		    참조형의 경우에는 저장된 주소를 비교 
		  
		   
		  수식      |       연산결과
		 x < y      |  x가 y보다 작을 때 true, 그 외에는 false
		 x > y      |  x가 y보다 클 때 true, 그 외에는 false
		x <= y      |  x가 y보다 크거나 같을 때 true, 그 외에는 false
		x >= y      |  x가 y보다 작거나 같을 때 true, 그 외에는 false
		x == y      |  x와 y가 같을 때 true, 그 외에는 false
		x != y      |  x와 y가 다를 때 true, 그 외에는 false
		
		*/
		
		
		// 15를 저장할 수 있는 변수를 선언 및 초기화하세요. da
		int da = 15;
		
		
		// 15.000001을 저장할 수 있는 변수를 선언 및 초기화하세요. db
		float db = 15.000001F;
		
		
		// da와 db가 같은지 그 결과를 출력해주세요.
		System.out.println(da == db); // false
		
		System.out.println(0.1 == 0.1f);
		
		System.out.println('A' == 65);
		
		
		/*
		12. 비트연산자( &, |, ^)
		  - 이진비트 연산을 수행한다.
		  - 실수형인 float, double을 제외한 모든 기본형에 사용 가능하다.
		  
		  &(AND연산) : 피연산자 양쪽 모두 1일 때 1이다.
		  | (OR연산) : 피연산자 중 최소한 한 쪽의 값이 1이면 1이다.(둘 다 같아도 1)
		  ^(XOR연산) : 피연산자의 값이 서로 다르면 1이다. 
		
		  3 00000011
		  5 00000101
		  
		  & 00000001 => 1
		  | 00000111 => 7
		  ^ 00000110 => 6
		
		
		13. 논리연산자(&&, ||)
		  - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는
		    조건식만을 허용한다.
		  - 조건문과 반복문에서 조건식 간의 결합에 이용한다.
		  
		  &&(AND결합) - 피연산자 양쪽 모두 true일 때만 true
		  || (OR결합) - 피연산자 중 어느 한쪽이라도 true이면 true의 결과  
		  
		*/
		//1. 문자 하나를 저장할 수 있는 변수 dc 선언하세요
		char dc;
		
		//2. dc의 초기값으로 K를 저장해주세요
		dc = 'K';
			
		//3. dc가 영어 대문자일 때 true가 출력되도록 만들어주세요.
		System.out.println('A' <= dc && dc <= 'Z');
		
		//4. dc가 영어 소문자일 때 true가 출력되도록 만들어 주세요.
		System.out.println('a' <= dc || dc <= 'z');
		
		//5. dc가 영문자인지 판단하는 조건식을 만드세요.
		System.out.println('A' <= dc && dc <= 'Z' || 'a' <= dc || dc <= 'z');
		
		//6. dc가 숫자형인지 판단하는 조건식을 만드세요.
		System.out.println('0' <= dc && dc <= '9');
		
		/*
		14. 삼항연산자
		  - 세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름 지어졌다.
		  - 삼항연산자의 조건식에는 연산결과가 true 또는 false인 식이 사용된다.
		  - 기본구조
		  	조건식 ? 식1 : 식2;
		*/
		
		int x = 10;
		int absX = x > 0 ? x : -x;
		System.out.println(absX);
		
		/*
		15. 대입연산자(=, op=)
		  - 변수의 값 또는 수식의 연산결과를 저장하는데 사용한다.
		  - 연산우선순위가 가장 낮다.
		
		*/
		// 1. 10의 값을 저장할 수 있는 변수 ea를 선언 및 초기화해주세요.
		int ea = 10;
						
		// 2. ea의 값에 20을 더한 값을 ea에 저장해주세요.
		ea = ea + 20; // ea = 30;
		ea += 20; // ea = 50, op= 연산자
		ea *= 2; // ea = 100
		ea /= 10; // ea = 10
		ea <<= 3; // ea = 80
		
		System.out.println(ea);
		
		float fff = 3.141592f;
		
		// 소수점 넷째자리에서 반올림하여 소수점 셋째자리까지 표현해주세요.
		/*
		fff*1000 3141.592
		+0.5     3142.092
		(int)    3142
		/1000F   0.142
		*/
		fff = (int)(fff*1000+0.5)/1000f;
		System.out.println(fff);
		
		//1. 523.845636를 변수 dddd에 저장해주세요.
		double dddd = 523.845636f;
		//2. dddd를 소수점 5번째 자리에서 반올림하여 4번째 자리까지 표현해주세요.
		/*
		523.845636 * 10000
		+0.5
		(int)
		/100000
		*/
		
		float dddd1 = (int)(dddd*10000+0.5)/10000.0f;
		System.out.println(dddd1); //여러 방법 중 이 방법이 제일 정확한 값에 가까움
		
		
		
		
		/*
		총집합 연산자의 우선순위
		
		1. (), []
		2. ++, --, ~, (+), (-)
		3. *, /, %
		4. +, -
		5. <<, >>, >>>
		6. <, <=, >, >=
		7. ==, !=
		8. &
		9. ^
		10. |
		11. &&
		12. ||
		13. op=
		14. =, +=, -=, *=, /=, %=
		*/
		
		
		
		
	}
}