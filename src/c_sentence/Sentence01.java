package c_sentence;

public class Sentence01 {

	public static void main(String[] args) {
		/*
		1. 조건문(if, switch)
		  - 조건식과 문장을 포함하는 블럭{}으로 구성되어 있다.
		  - 조건식의 연산결과에 따라서 프로그램의 실행흐름을 변경할 수 있다.
		  
		2. if문
		  - 구조
		    1) 기본
		      if(조건식1){
		      	조건식 1이 true일 때 수행될 문장
		      }
		      	
		    
			2) 1단 변신
			  if(조건식){
			  	조건식 1이 true일 때 수행될 문장
			  } else {
			 	조건식 1이 false일 때 수행될 문장
			  }
			
			 
			3) 2단 변신
			  if(조건식1){
				조건식 1이 true일 때 수행될 문장
			  } else if(조건식2){
			 	조건식 1이 false이고 조건식2가 true일 때 수행될 문장
			  } else {
			  	조건식 1과 조건식2가 false일 때 수행될 문장.
			  }

		
		*/
			int a = 100;
			if (a > 0){
				System.out.println("a는 양수이다.");
			} else if (a < 0){ // a가 양수가 아닐 때
				System.out.println("a는 양수가 아니다.");
			} else {
				System.out.println("a는 0이다");
			} 
			
			// 0 <= Math.random() < 1
			
			// 1~7
			// 0 <= M < 1     1.0000000 -> 6.999999
			// 0 <= M < 1
			// 0*6 <= M*6 < 1*6
			// 0 <= M*6 < 6
			// 0+1 <= M*6+1 < 6+1
			// 1 <= (int)(M*6+1) < 7
			
			int random = (int)(Math.random()*6+1);
			System.out.println(random);
			
			
			// 1. 7(포함) ~ 19(포함)
			//    7  ~  20 => 13
			
			int random2 = (int)(Math.random()*13+7);
			System.out.println(random2);
			
			// 2. 0(포함) ~ 100(포함)
			
			//    0   ~  101 정수의 갯수 : 101개
			// 0 <= M < 100
			//0*100 < = M*100 < 1*100
			// 1 < = (int)(M*100+1) < 101
			
			int random3 = (int)(Math.random()*101+0);
			System.out.println(random3);
			
			// 3. 67(미포함) ~ 113(포함) 사이의 정수값 하나를 뽑아주세요.
			// 68 ~ 114 정수의 갯수 : 46개
			int random4 = (int)(Math.random()*46+68);
			System.out.println(random4);
			
			
			// random3의 값이 90이상이면 "A"를 출력
			// random3의 값이 80이상이면 "B"를 출력
			// random3의 값이 70이상이면 "C"를 출력
			// random3의 값이 60이상이면 "D"를 출력
			// random3의 값이 60미만이면 "나가"를 출력
			
			if (random3 >= 90){
				System.out.print("A");
				
				
			} else if (random3 >= 80) {
				System.out.print("B");
				
				
			} else if (random3 >= 70) {
				System.out.print("C");
				
				
			} else if (random3 >= 60){
				System.out.print("D");
				
			} else {
				System.out.println("나가");
			}
		
		/*
		
		3. switch문
		  - 조건의 경우가 수가 많을 때는 if문보다는 switch문을 사용하는 것이
			더 간결하고 알아보기 쉽다.
		  - 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		  - 범위표현이 불가능하다.
		  - 구조
		    switch (조건식,연산식,변수 중 하나) {
		    case 값1 : 
		    	조건식과 값 1이 같은 경우 수행될 문장
		    	break;
		    case 값2 :
		    	조건식과 값2이 같은 경우 수행될 문장
		    	break;
		    case 값3 : 
		    	조건식과 값3이 같은 경우 수행될 문장
		    	break;
		    defalut :
		    	조건식과 일치하는 값이 없을 때 수행될 문장
		    
		    }
		  
		  - switch문은 조건식을 먼저 계산한 다음 그 결과와 일치하는
		    case문으로 이동한다.
		     이동한 case문 이하에 있는 문장들을 수행하고 break문을
		     만나면 전체 switch문을 나가게 된다. 
		
		*/
		
		
		int a2 = 2;
		switch (a2) {
		case 1:
			System.out.println("a2는 1이다");
			break;
		case 2:
			System.out.println("a2는 2이다");
			break;
		case 3:
			System.out.println("a2는 3이다");
			break;
			
		default:
			System.out.println("a2는 1,2,3이 아니다.");
		}
		// 1. 1~5사이의 랜덤한 정수값을 저장할 수 있는 변수를 선언하고
		//	  1~5사이의 랜덤한 값으로 초기화하세요 result
			  
		int result = (int)(Math.random()*5+1); // 1(포함) ~ 6(미포함)
			  
			
		// 2. result의 값이 5이면 "24평형 자이아파트 당첨"	2억 5천
		//	  result의 값이 4이면 "투룸 오피스텔 당첨" 	8000
		//	  result의 값이 3이면 "아이패드 당첨"			50
		//	  result의 값이 2이면 "스벅 랜덤박스 당첨"		5
		//	  result의 값이 1이면 "30평형 자이아파트 내놔"
		
		switch (result) {
		case 5:
			System.out.println("24평형 자이아파트 당첨 (2억 5천)");
			break;
			
		case 4:
			System.out.println("투룸 오피스텔 당첨 (8천)");
			break;
			
		case 3:
			System.out.println("아이패드 당첨 (50)");
			break;
			
		case 2:
			System.out.println("스벅 랜덤박스 당첨 (5)");
			break;
			
		default:
			result = 1;
			System.out.println("30평형 자이아파트 내놔");
			break;
		}
		
		/*
		if (random3 >= 90){
			System.out.print("A");
			
			
		} else if (random3 >= 80) {
			System.out.print("B");
			
			
		} else if (random3 >= 70) {
			System.out.print("C");
			
			
		} else if (random3 >= 60){
			System.out.print("D");
			
		} else {
			System.out.println("나가");
		}
		*/
		
		int random5 = (int)(Math.random()*101+0);
		
		switch (random5/10) {
		case 10: case 9:
			System.out.println("A");
			break;		
		case 8:
			System.out.println("B");
			break;			
		case 7:
			System.out.println("C");
			break;			
		case 6:
			System.out.println("D");
			break;			
		default:
			System.out.println("나가");
			break;
			}
	
	}

}
