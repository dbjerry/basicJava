package f_oop2;

public class PolyTest {
	public static void main(String[] args) {
//		Tv t = new Tv();
//		SmartTv st = new SmartTv();
		
		//1. SmartTv 4대를 저장 할 수 있는 변수를 만들고 SmartTv 4대를 저장해주세요.
		SmartTv[] stArr = {
							new SmartTv(),
							new SmartTv(),
							new SmartTv(),
							new SmartTv()
						  };
		
		//2. AfreecaTv 3대를 저장할 수 있는 변수를 만들고 AfreecaTv 3대를 저장해주세요.
		AfreecaTv[] afArr = {
							new AfreecaTv(),
							new AfreecaTv(),
							new AfreecaTv()
							};
		
		//3. VRTv 2대를 저장할 수 있는 변수를 만들고 VRTv 2대를 저장해주세요.
		VRTv[] vtArr = {
						new VRTv(),
						new VRTv()
					   };
		
		//4. Tv 9대를 저장할 수 있는 변수를 선언하세요 tvArr
		Tv[] tvArr;
		
		//5. tvArr에 SmartTv 3대 AfreecaTv 3대, VRTv 3대를 저장하세요
		tvArr = new Tv[9];
		Tv t = (Tv)new SmartTv(); // *up-casting
		tvArr = new Tv[]{ // 따로 초기화 할 때는 이렇게 사용
						new SmartTv(), new SmartTv(), new SmartTv(),
						new AfreecaTv(), new AfreecaTv(), new AfreecaTv(),
						new VRTv(), new VRTv(), new VRTv()  
						};
		
		AfreecaTv a = (AfreecaTv)tvArr[4]; // *down-casting
		
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class VRTv extends Tv{
	void headTracking(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}



