package e_oop;

public class MemberCall {
	
	int iv = 20;
	static int cv = 30;
	
	int iv2 = cv; //인스턴스화를 해야 사용가능
	
//	static int cv2 = iv; <= 클래스가 먼저 로드되기 때문에 오류
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); 클래스메서드에서 인스턴스변수나 인스턴스메서드를 사용할 수 없다. 
	}
	
	void instanceMethod() {
		System.out.println(cv);
//		System.out.println(iv); 같은 클래스 내에 인스턴스메서드 안에서 변수를 생성하면 인스턴스화를 하지 않고도 사용가능.
	}
	
	
	
	
	
	
}
