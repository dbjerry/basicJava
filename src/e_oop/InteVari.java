package e_oop;

class Data {
	int x;
}

public class InteVari {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x = 10;
		System.out.println("main기본형 : " + d1.x);
		
		InteVari.change(d1.x); //클래스명.메서드명()
		//같은 class 내의 클래스명은 생략가능
		// change(d1.x);
		System.out.println("after main기본형 : " + d1.x);
		
		Data d2 = new Data();
		d2.x = 10;
		System.out.println("main 참조형 : " + d2.x);
		
		InteVari.change(d2); //d2=주소저장, Data타입
		// change(d2);
		System.out.println("after main참조형 : " + d2.x);
		
		
		
	}
	
	static void change(int x) { //기본형 매개변수
		x = 1000;
		System.out.println("change기본형 : " + x);
	}
	
	static void change(Data a) { //참조형 매개변수
		a.x = 1000;
		System.out.println("change참조형 : " + a.x);
	}

}
