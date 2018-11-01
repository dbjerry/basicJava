package h_javaLang;

import static java.lang.Math.*;

public class MathTest {
	public static void main(String[] args) {
		
		//Math클래스의 메서드
		
		double d = 25.743636;
		
		//모든 메서드는 소수점 첫째자리를 기준으로 한다.
		//반올림
		System.out.println(round(d));
		
		//올림
		System.out.println(ceil(d));
		
		//버림
		System.out.println(floor(d));
		
		//제곱
		int a = 2;
		System.out.println(pow(a,3));
		
		//제곱근(루트)
		int b = 3;
		System.out.println(sqrt(b));
		
		Point3 p3 = new Point3(1,7);
		Point3 p4 = new Point3(3,4);
		float dtCall = p3.getDistance(p4);
		System.out.println(dtCall);
		
	}
}

//1. Point클래스를 만드세요
class Point3{
	int x;
	int y;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
//2. Point클래스에 인스턴스 메서드를 만드세요 getDistance
//매개변수로 Point를 하나 받아서 현재 점과 매개변수로 받은 점 사이의
//거리를 반환해주는 메서드입니다.
//소수점 셋째자리에서 반올림하여 둘째자리까지 반환하도록 해주세요
	public float getDistance(Point3 p){
		float distance = (float)sqrt(pow(p.x-x,2) + pow(p.y-y,2));
		float result = round(distance*100)/100F;
		
		return result;
	}
	
//3. getDistance메서드를 호출해주세요
	
}		
	