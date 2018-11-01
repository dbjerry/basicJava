package h_javaLang;

public class WrapperTest {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		//String클래스는  오버라이딩이 되어있다.
		//주소값으르 찾으므로 false여야 하는데 String클래스는
		//equals가 오버라이드가 되어있어서 값을 비교하게 함
		
		System.out.println(i1);
		//wrapper클래스는 toString이 오버라이딩이 되어있어서
		//주소가 출력이 아니고 값이 출력된다.
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		//비트수 찾는 것
		System.out.println(Integer.BYTES);
		//바이트수 찾는 것
		
		Integer bb = 70; //AutoBoxing(오토박싱) : 자동으로 인스턴스화를 해준다.
		System.out.println(bb);
		int a = new Integer(45); //UnBoxing(언박싱) : 자동으로 인스턴스화를 풀어준다.
		System.out.println(a);
		
		
		Integer[] aaArr = {new Integer(10), new Integer(20)};
		Integer[] aaArr2 = {100,200};
		
		int b = aaArr2[1];
		System.out.println(b);
		
		
		method(500); // 자동형변환
		
		
		
	}
	static void method(Object obj){
		System.out.println(obj);
	}
	
	
}
