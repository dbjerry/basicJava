package f_oop2;

public class InnerEx01 {
	
	static class StaticInner{
		int iv = 20;
		static int cv = 50;
		static final int CONST = 200;
	}
	
	class InstanceInner{
		int iv = 50;
//		static int cv = 60; //
		static final int CONST = 200; //클래스변수임에도 불구하고 상수는 가능하다.
	}
	
	void method(){
		class LocalClass{ // 스태틱클래스로 생성할 수 없다.
			int iv = 50;
//			static int cv = 60; //수행기준이 아닌 로드기준이기 때문에 스태틱이 올 수 없다.
		}
	}
}
