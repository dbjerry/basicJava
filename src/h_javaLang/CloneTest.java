package h_javaLang;

import java.util.Arrays;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneEx c1 = new CloneEx(5, 5);
		CloneEx c1Copy = (CloneEx)c1.clone();
		//c1의 clone이 Object라 다운캐스팅
		
		c1.x = 100;
		System.out.println(c1);
		System.out.println(c1Copy);
		
		
		CloneEx[] cArr = new CloneEx[]{new CloneEx(5, 5), new CloneEx(10, 10)};
		
		CloneEx[] cArrCopy = cArr.clone();
		
		cArr[0].x = 1000;
		System.out.println(Arrays.toString(cArr));
		System.out.println(Arrays.toString(cArrCopy));
		
		
		
		
		
		
		
	}
}

class CloneEx implements Cloneable{
	
	int x;
	int y;
	
	public CloneEx(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	//Clone을 쓰려면 이걸 오버라이드를 해야한다.

	@Override
	public String toString() {
		return "CloneEx [x=" + x + ", y=" + y + "]";
	}
	//clone의 주소값이 아닌 진짜 값을 출력하고 싶어서 toString메서드를 오버라이드함.
	
	
	
}




