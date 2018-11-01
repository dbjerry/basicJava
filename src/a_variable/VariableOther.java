package a_variable;
/**
 * 변수의 타입에 대해 공부
 * @author jerry
 * @since 2018.05.29
 * 
 */
public class VariableOther {
	public static void main(String[] args) {
		
		/*
		1. 기본형 타입(Primitive type)
		  - boolean, char, byte, short, int, long, float, double
		  - '값'을 저장
		  
		  1) 기본형 타입의 종류
		    - 논리형 : true, false 중 하나의 값만 저장 ex)boolean
		    - 문자형 : 문자 하나를 저장하는데 사용 ex)char
		    - 정수형(양수, 음수, 0) : 정수값을 저장 ex)byte, short, int, long
		    - 실수형 : 실수값을 저장 ex)float, double
		    
		  2) 기본형 변수의 크기(1byte = 8bit)
		    - 1byte : boolean, byte
		    - 2byte : char, short
		    - 4byte : int, float
		    - 8byte : long, double
		    
		  3) 논리형 - boolean(기본값 false)
		    - boolean형 변수에는 true와 false중 하나의 값을 저장할 수 있다.
		    - boolean형 변수는 대답(Yes, No), 스위치(On/Off)
		    - 데이터를 다루는 최소단위가 1byte임으로 1byte형을 가지게 된다.
		    
		  4) 문자형 - char('\u0000')
		    - java는 unicode문자 체계를 이용한다. 2byte형을 취한다.
		    
		  5) 정수형 - byte, short, int, long
		    - 기본자료형은 int이다.
		    - 변수에 값을 저장하려면 정수값의 범위에 따라서 4개의 정수형 중에
		      하나를 선택해야 한다.
		    - byte형이나 short형의 경우 크기가 작사어 범위를 넘는 잘못된 결과를
		      얻을 수 있다. 그래서 int형을 사용하는 것이 좋다.
		    - JVM의 피연산자 스택이 피연산자들을 4byte단위로 저장하기 때문에
		      4byte형보다 작은 자료형의 연산시 4byte형으로 변환하여 연산된다.
		    - overflow(정수형) : 변수가 자신이 저장할 수 있는 범위를 넘었을 때
		      최소값부터 다시 표현하는 현상.
		      변수의 범위를 넘는 값으로 초기화는 허용하지 않는다.
		      
		  6) 실수형 - float, double
		    - 실수형값을 저장하는데 사용된다.
		    - float : 1+8+23(22)
		      double : 1+11+52(64)  
		    - 실수형 중에서 사용할 자료형을 선택할 때는 값의 범위뿐만 아니라
		      정밀도도 중요한 요소가 된다.
		    - 기본자료형은 double이다.
		    
		    
		    */
		    
			// false의 값을 저장할 수 있는 변수 abc를 선언 및 초기화 하세요
		    boolean abc = false;
		   char a = ('\u0041');
		   char b = ('\u0041');
		   char c = 65;
		   //50의 값을 저장할 수 있는 변수를 선언 및 초기화 하세요 변수명 : b
		   int b2 = 50;
		   System.out.println(c);
		   
		   long long2 = 89102014502222L;
		   byte b3 = 126;
		   System.out.println(b3); //126
		   b3++;
		   System.out.println(b3); //127
		   b3++;
		   System.out.println(b3); //-128
		   b3--;
		   System.out.println(b3); // 127
		       
		   double d2 = 1.212312413543534543;
		   float f2 = 1.212312413543534543F;
		   System.out.println(f2);
		   
		   double d3 = 0.1;
		   float f3 = 0.1F;
		   System.out.println(d3 == f3);
		   		   
		   
		/*
		2. 참조형 타입(Reference type)
		  - '주소'를 저장
		  - 기본적으로 4byte
		  
		  1) String
		    - 문자열을 다루는 클래스이다.  
		    
		  2) 형변환(casting)
		    - 변수 또는 리터럴(값)의 타입을 다른 타입으로 변환하는 것이다.
			
		*/ 
		
		String str = null;
	   char cc = '4';
	   str = "dssdf";
	   System.out.println(5+"sdf"); //"5"+"sdf" => 5sdf
	   System.out.println("6"+"7"); //문자열 "67"
	   System.out.println(true + "123");
	   System.out.println("========\n--------");

	   int i3 = 200;
	   byte b4 = (byte)i3;
	   
	   char c3 = (char)i3;
	   System.out.println(c3);

	   float f4 = 3.141592F;
	   int i4 = (int)f4;
	   System.out.println(i4 == 3);
	   System.out.println(i4);
		  
	   
	   int i5 = b4;
		  
	   int xx = 50000;
	   long yy = xx;       //묵시적형변환
	   
	   long xx2 = 5;
	   int yy2 = (int)xx2; //강제형변환
	   
	   
	   
	}
}
