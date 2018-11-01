package f_oop2;

import f_oop2.Outer.Inner;

public class InnerEx02 {
	public static void main(String[] args) {
		
		//Inner class의 method를 호출하세요
		Outer out = new Outer();
		Outer.Inner inn = out.new Inner();
		inn.method();

	}
}

class Outer{
	int value = 20;
	
	class Inner{
		int value = 30;
		
		void method(){
			int value = 40;
			System.out.println(value); //40
			System.out.println(this.value); //30
			System.out.println(Outer.this.value); //20
		}
	}
}







