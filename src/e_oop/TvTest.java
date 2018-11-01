package e_oop;

public class TvTest {
	
	public static void main(String[] args) {
		System.out.println(Tv.color);
		Tv.color = "red";
		System.out.println(Tv.color);
		Tv.changeColor();
		System.out.println(Tv.color);
		
		Tv t = new Tv();//main메서드의 지역변수(변수의 선언)
		t.channel = 100;
		t.channelUp();
		System.out.println(t.channel);
		System.out.println(t.power);
		
	}
}

class Tv {
	//전역변수
	//클래스변수
	static String color;	// Tv의 색깔을 저장
	//인스턴스변수
	boolean power;	// Tv의 전원상태를 저장
	int channel;	// Tv의 채널을 저장
	
	//클래스메서드
	/**
	 메서드설명은 doc주석으로
	 */
	static void changeColor() {
		color = "yellow";
		//지역변수
		int a = 10;
	}
	
	//인스턴스메서드
	void channelUp() {
		channel++;
	}
	
}
