package e_oop;

public class ProductTest {
	public static void main(String[] args) {
		System.out.println(Init.action);
		Init in = new Init(200);
		System.out.println(in.action2);
		
//	순서 : 명시적초기화 -> 초기화블럭 -> 생성자
		
		
	}
}

class Init { // Init 시작할 때
	
	static int action = 10; // 명시적초기화
	int action2;
	
	Init() {	//기본적 생성자
		action2 = 50;
	}
	
	Init(int action2) {
		this.action2 = action2;
	}
	
	
	{	// 인스턴스 초기화블럭
		action2 = 100;
	}
	
	
	static { // 클래스 초기화블럭
		action = 60;
	}
	
	
}