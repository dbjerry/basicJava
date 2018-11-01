package z_exam;

public class TotalTest {
//	TotalTest 클래스가 Method Area에 로드되고 TotalTest클래스의 멤버들이 같이 로드된다.
//	같이 로드 될 멤버는 main()만 있다.
// 0
	
	public static void main(String[] args) {
//	main()가 Call Stack에 쌓임
// 0
		
		TvMaker.color = "Blue";
//		TvMaker클래스가 Method Area에 로드되고
//		같이 로드 될 클래스멤버를 확인하기 위해 TvMaker field로 내려감
// 0
		
//		TvMaker클래스에 있는 클래스변수 String color를 호출하고
//		값을 초기화한다. 그 값은 "Blue"이다.
// 0
		
		TvMaker tm = new TvMaker();
//		TvMaker를 로드하러 Method Area를 방문, 이미 로드 되어있음.
		
//		tm이라는 참조변수를 선언하여 main method(=main())의 지역변수로써
//		Call Stack에 쌓여있는 main()내에 작성된다.
		
//		new를 만나서 방금 선언된 참조변수 tm의 주소가 저장될 공간이 heap에 마련된다.
//		TvMaker 클래스가 로드되러 Method Area가 방문, 이미 로드 되어있음.
		
//		heap에 로드시킬 TvMaker의 인스턴스멤버들을 확인하러 TvMaker클래스로 내려감
		
//		heap에서 인스턴스멤버들이 모두 로드되었으면 tm의 주소값은
//		main()에 선언된 tm으로 이동된다.

// -1
		
		tm.age = 30;
//		main()에 선언되어있는 tm의 값은 tm의 주소값이다.
//		그 주소값을 따라 가서 TvMaker에 선언 되어있는 age의 값을
//		30으로 초기화해준다.

// 0
		
		System.out.println(TvControll.channel);
//		println()가 Call Stack에 쌓임
//		TvControll클래스 내에 channel이라는 변수가 호출됨.
//		TvControll클래스를 로드하기 위해 Method Area에 방문,
//		로드되어 있지 않아 로드를 해준다.
//		같이 로드될 클래스멤버들을 확인하러 내려감

// -1
		
//		TvControll.channel을 호출하고 그 값은 15이다.
//		15가 console에 출력되고 println()는 퇴근.
		
		TvControll.volumeDown();
//		TvControll클래스의 volumeDown()를 호출
//		메서드의 행위를 확인하러 내려감
		
		System.out.println(TvControll.channel);
//		println()가 Call Stack에 쌓임
//		TvControll클래스를 로드하러 Method Area에 방문, 이미 로드 되어있음
//		클래스변수 channel의 값 16을 출력.
//		println()는 종료, Call Stack에서 퇴근.
		
		
		TvControll tc;
//		TvControll 클래스를 참조할 참조변수 tc 선언
//		위치는 main()

// -1
		
		tc = new TvControll();
//		new를 만나 참조변수 tc의 주소를 heap에 로드
//		TvControll 클래스로 이동하여 같이 로드될 인스턴스 멤버를 확인
//		heap에 인스턴스멤버를 로드하고 main에 선언된 tc에다가
//		인스턴스멤버가 로드된 tc의 주소값을 저장
		

		
		System.out.println(tc.volume);
//		Call Stack에  println()가 쌓이고 참조변수 tc를 통하여
//		heap에 로드되어 있는 volume을 출력, 그 값은 99
//		println은 Call Stack에서 퇴근
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
// -1
// 0
		
		//
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));
// -1
// -1
// -1
// -1

		
	}
}
	class TvMaker{
//	TvMaker 클래스가 로드됨.
//-1
//-1

		static String color; 
		static int inch; 
//		같이 로드 될 클래스멤버는 color, inch가 있다.
// 0
		
		String name = "";
		int age;
// 		heap에 로드될 인스턴스 변수 name, age와
//		생성자 TvMaker(), TvMaker(String, int)가 있다.
// 0
// -1
		TvMaker(){ 
			this("man",25);  //0
		}
// -1
// 0

		
		TvMaker(String name, int age){
			this.name = name;
			this.age = age;
		}
	}

	
	
	class TvControll{
//	TvControll클래스가 로드됨.
// -1
		
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
//		참조변수 tc가 heap에 로드될 때에 같이 로드 될 인스턴스멤버
//		: MAX_VOLUME = 100, MIN_VOLUME = 0, volume = 99, volumeUp()
// 0
		
		static final int MAX_CHANNEL= 50;
		static final int MIN_CHANNEL= 1;
		
		static int channel = 15;
//		같이 로드될 클래스멤버에는
//		클래스변수 MAX_VOLUME=50, MIN_VOLUME=1
//		, channel=15, volumeDown()가 있다.
		
		
		int volume = 99;

		//4. return문
		int volumeUp(){
			if(volume == MAX_VOLUME){
				volume = MIN_VOLUME;
			}else{
				volume++;
			}
			
			return volume;
		}
// -1
		
		static int volumeDown(){
//		클래스메서드 volumeDown이 선언되었다.
//		Call Stack에 volumeDown()가 쌓였다.
			
			if(channel == MAX_CHANNEL){
//			if의 조건 채널의 값 15와 MAX_CHANNEL의 값이 동일하면 if문에 접속가능
				
				channel = MIN_CHANNEL;
//				클래스변수 channel에 MIN_CHANNEL값을 저장
				
			}else{
//			if문의 조건에 만족하지 못하면 else로 온다.
				channel++;
//				클래스변수 channel의 값에 1씩 증가한다.
			}
//			if문이 종료
			return channel;
//			변경된 channel의 값을 volumeDown()를 호출한 곳에 반환한다.
//			변경된 channel의 값은 현재 16이다. 반환하러 위로 감
		}
//		volumeDown()가 종료, Call Stack에서 퇴근.
	}
// 0
	
	class Calc{
		//5.
		int add(int a, int b){
			return a+b;
		}
		long add(long a, int b){
			return a+b;
		}

// -1
// -1
// 0
		
		
		int minus(int a, int b){
			return a+b;
		}
	}