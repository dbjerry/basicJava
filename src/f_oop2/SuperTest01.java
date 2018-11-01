package f_oop2;

public class SuperTest01 {
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		int result = c2.getAdd();
		System.out.println(result);
		//조상클래스에서 상속을 받아도 변수명, 메서드명이 같으면 호출할 수 없다.
	}
}

class Parent2 {
	int x = 10;
	int y = 20;
	
	int getAdd() {
		return x + y;
	}
	Parent2() {
		
	}
}

class Child2 extends Parent2 {
	int x = 30;
	int y = 40;
	
	Child2() {
		super();
		//this(); //같이 사용할 수 없음
	}
	
	@Override
	int getAdd() {
		System.out.println(x); //인자값이 출력
		System.out.println(this.x); //30
		System.out.println(super.x); //10
		return super.getAdd();
	}
}