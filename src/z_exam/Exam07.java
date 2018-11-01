package z_exam;

//import java.util.ArrayList;
//import java.util.Arrays;

/*
 * [7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
 * 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
 * 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
 * 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
 * 
 * [7-2] 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고
 * 테스트 하시오. [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
 * 
 */


//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM];
//	SutdaDeck() {
//		int num;
//		boolean isKwang;
//		for(int i = 0; i < CARD_NUM/2; i++){
//			cards[i] = new SutdaCard(i+1, false);
//			if(i+1 == 1 || i+1 == 3 || i+1 == 8){
//				cards[i].isKwang = true;
//			}
//		}
//		for(int i = 10; i < CARD_NUM; i++){
//			cards[i] = new SutdaCard(i-9, false);
//		}
//	}
//	
//	void shuffle(){
//		SutdaCard tmp;
//		for(int i = 0; i < CARD_NUM; i++){
//			int j = (int)(Math.random()*CARD_NUM);
//			tmp = cards[i];
//			cards[i] = cards[j];
//			cards[j] = tmp;
//		}
//	}
//	
//
//	SutdaCard pick(int cardsNum){
//		SutdaCard result = cards[cardsNum];
//		return result;
//	}
//	
//	SutdaCard pick(){
//		int cardsNum = (int)(Math.random()*CARD_NUM);
//		SutdaCard result = cards[cardsNum];
//		return result;
//	}
//	
//}
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//	
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//	
//	SutdaCard() {
//		this(1, true);
//	}
//	
//	// info()대신 Object클래스의 toString()을 오버라이딩했다.
//	public String toString() {
//		return num + ( isKwang ? "K":"");
//	}
//}
//
//public class Exam07{
//	public static void main(String args[]) {
//		
//		SutdaDeck deck = new SutdaDeck();
//		
//		deck.shuffle();
//		for(int i=0; i < deck.cards.length;i++)
//			System.out.print(deck.cards[i]+",");
//	}
//}
/*
[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.

	- 부모클래스로부터 상속받은 메서드를 재정의 하는 것
	- 부모클래스에서 상속받은 메서드가 자식클래스에서 재정의가 이루어져야 할 때


[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)

	a. 조상의 메서드와 이름이 같아야 한다.					(X)
	b. 매개변수의 수와 타입이 모두 같아야 한다.				(X)
	c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.	(X)
	d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.		(O)

*/

//[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고
//에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

//class Product{
//	
//	int price;		// 제품의 가격
//	int bonusPoint;	// 제품구매 시 제공하는 보너스점수
//	
////	Product(){
////		
////	}
//	
//	Product(int price) {
//		this.price = price;
//		bonusPoint =(int)(price/10.0);
//	}
//}
//
//
//class Tv extends Product {
//	
//	Tv(){
//		super(500);
//	}
////	상속받고 있는 Product class에 매개변수 있는 생성자가 있는데
////	호출하는 super가 없어서 에러가 난다. 상속시 부모의 생성자 호출은 꼭 해야한다.
//	public String toString() {
//		return "Tv";
//	}
//}
//class Exam07{
//	public static void main(String[] args) {
//		Tv t = new Tv();
//	}
//}

//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?

//	부모클래스의 생성자를 호출해서 상속받은 멤버들을 초기화하기 위해서.


//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.

//class Parent {
//	
//	int x=100;
//	
//	Parent() {					// ( 3 )
//		this(200);
//	}
//	
//	Parent(int x) {				// ( 4 )
//		this.x = x;
//	}
//	
//	int getX() {
//			return x;
//	}
//}
//
//class Child extends Parent {
//	
//	int x = 3000;
//	
//	Child() {					// ( 1 )
//		this(1000);
//	}
//	
//	Child(int x) {				// ( 2 )
//		this.x = x;
//	}
//}
//
//class Exercise7_7 {
//	public static void main(String[] args) {
//		Child c = new Child();
//		System.out.println("x="+c.getX());
//	}
//}

//[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?

//	a. public-protected-(default)-private	(O)
//	b. public-(default)-protected-private	(X)
//	c. (default)-public-protected-private	(X)
//	d. private-protected-(default)-public	(X)


//[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
//옳지 않은 것은? (모두 고르시오)

//	a. 지역변수 - 값을 변경할 수 없다.			(X)
//	b. 클래스 - 상속을 통해 클래스에
//			    새로운 멤버를 추가할 수 없다.		(O)
//	c. 메서드 - 오버로딩을 할 수 없다.			(X)
//	d. 멤버변수 - 값을 변경할 수 없다.			(X)


//[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을
//클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을
//어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.	

//[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로
//이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.

//class MyTv2 {
//	
//	private boolean isPowerOn;
//	private int channel;
//	private int volume;
//	private int prevChannel;
//	
//	final int MAX_VOLUME = 100;
//	final int MIN_VOLUME = 0;
//	final int MAX_CHANNEL = 100;
//	final int MIN_CHANNEL = 1;
//	
//	void setIsPowerOn(boolean power){
//		isPowerOn = !power;
//	}
//	public boolean getIsPowerOn(){
//		return isPowerOn;
//	}
//	
//	void setChannel(int channel){
//		if(MIN_CHANNEL > channel || channel > MAX_CHANNEL){
//			return;
//		}
//		prevChannel = this.channel;
//		//channel값이 this.channel에 들어오기 전에 기존 this.channel값을 prevChannel에 넣어준다.
//		this.channel = channel;
//	}
//	public int getChannel(){
//		return channel;
//	}
//	
//	void setVolume(int volume){
//		if(MIN_VOLUME > volume || volume > MAX_VOLUME){
//			return;
//		}
//		this.volume = volume;
//	}
//	public int getVolume(){
//		return volume;
//	}
//	
//	void gotoPrevChannel(){
//		setChannel(prevChannel);
//		//이전 채널값이 들어가있는 prevChannel을 호출해서 사용한다.
//	}
//}
//
//class Exam07 {
//	public static void main(String args[]) {
//		MyTv2 t = new MyTv2();
//		
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		
//		t.setChannel(20);
//		System.out.println("CH:"+t.getChannel());
//		
//		t.gotoPrevChannel();
//		System.out.println("CH:"+t.getChannel());
//		
//		t.gotoPrevChannel();
//		System.out.println("CH:"+t.getChannel());
//	}
//}


//[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)

//	a. public은 접근제한이 전혀 없는 접근 제어자이다.					(X)
//	b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.			(X)
//	c. 지역변수에도 접근 제어자를 사용할 수 있다.						(O)
//	d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.			(X)
//	e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.	(X)


//[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?


//[7-14] 문제7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면
//변경되어서는 안 되는 값이다. 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이
//될 수 도 있기 때문이다. 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오.

//class SutdaCard {
//	
//	final int NUM;			//final 제어자를 사용하므로 초기화시 값이 고정
//	final boolean ISKWANG;	//final 제어자를 사용하므로 초기화시 값이 고정
//	
//	SutdaCard() {
//		this(1, true);
//	}
//	
//	SutdaCard(int num, boolean isKwang) {
//		this.NUM = num;
//		this.ISKWANG = isKwang;
//	}
//	
//	public String toString() {
//		return NUM + ( ISKWANG ? "K":"");
//	}
//}
//
//class Exam07 {
//	public static void main(String args[]) {
//		SutdaCard card = new SutdaCard(1, true);
//	}
//}


//[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
//(모두 고르시오.)

//	class AirUnit extends Unit {}
//	class GroundUnit extends Unit {}
//	class Tank extends GroundUnit {}
//	class AirCraft extends AirUnit {}
//	Unit u = new GroundUnit();			업캐스팅
//	Tank t = new Tank();				
//	AirCraft ac = new AirCraft();		

//		a. u = (Unit)ac;					(X) 생략가능
//		b. u = ac;							(X) 생략가능 up-casting
//		c. GroundUnit gu = (GroundUnit)u;	(X) up-casting 
//		d. AirUnit au = ac;					(X) 생략가능 up-casting
//		e. t = (Tank)u;						(O) down-casting부터 할 수 없음 
//		f. GroundUnit gu = t;				(X) 생략가능 up-casting


//[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)

//class FireEngine extends Car implements Movable {
//	
//}
//
//class Ambulance extends Car {
//	
//}
//
//FireEngine fe = new FireEngine();
//
//	a. fe instanceof FireEngine	(X)
//	b. fe instanceof Movable	(X)
//	c. fe instanceof Object		(X)
//	d. fe instanceof Car		(X)
//	e. fe instanceof Ambulance	(O)


//[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고,
//이 클래스를 상속받도록 코드를 변경하시오.

//abstract class Unit{
////추상메서드가 있으므로 이 클래스도 추상클래스(abstract)가 된다.
//	int x, y; // 현재 위치
//	abstract void move(int x, int y);
//	//각 유닛마다 움직이는 방법이 다르므로 추상메서드로 abstract를 사용한다.
//	void stop() {
//		/* 현재 위치에 정지 */ 
//	}
//}
//
//
//class Marine extends Unit{ // 보병
//	void move(int x, int y){
//		
//	}
//	void stimPack() {
//		/* 스팀팩을 사용한다.*/
//	}
//}
//
//
//class Tank extends Unit{ // 탱크
//	void move(int x, int y){
//		
//	}
//	void changeMode() {
//		/* 공격모드를 변환한다. */
//	}
//}
//
//
//class Dropship extends Unit{ // 수송선
//	void move(int x, int y){
//		
//	}
//	void load() {
//		/* 선택된 대상을 태운다.*/ 
//	}
//	void unload() {
//		/* 선택된 대상을 내린다.*/ 
//	}
//}


//[7-18] 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
//[Hint] instanceof연산자를 사용해서 형변환한다.

//class Exam07{
//	static void action(Robot r){
//	//main method가 static이라 action method도 static으로 생성
//		if(r instanceof DanceRobot){
//			DanceRobot dance = (DanceRobot)r;	//down-casting
//			dance.dance();
//		} else if(r instanceof SingRobot){
//			SingRobot sing = (SingRobot)r;		//down-casting
//			sing.sing();
//		} else if(r instanceof DrawRobot){
//			DrawRobot draw = (DrawRobot)r;		//down-casting
//			draw.draw();
//		}
//	}
//	public static void main(String[] args) {
//		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
//		for(int i=0; i< arr.length;i++)
//		action(arr[i]);
//	} // main
//}
//
//class Robot {
//	
//}
//
//class DanceRobot extends Robot {
//	void dance() {
//		System.out.println("춤을 춥니다.");
//	}
//}
//
//class SingRobot extends Robot {
//	void sing() {
//		System.out.println("노래를 합니다.");
//	}
//}
//
//class DrawRobot extends Robot {
//	void draw() {
//		System.out.println("그림을 그립니다.");
//	}
//}


//[7-19] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 이 클래스는 멤버변수로
//돈(money)과 장바구니(cart)를 가지고 있다. 제품을 구입하는 기능의 buy메서드와
//장바구니에 구입한 물건을 추가하는 add메서드, 구입한 물건의 목록과 사용금액,
//그리고 남은 금액을 출력하는 summary메서드를 완성하시오.

//class Exam07 {
//	public static void main(String args[]) {
//		Buyer b = new Buyer();
//		b.buy(new Tv());
//		b.buy(new Computer());
//		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.summary();
//	}
//}
//
//class Buyer {
//	int money = 1000;
//	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
//	int i = 0; // Product배열 cart에 사용될 index
//	int sum = 0; //장바구니에 들어있는 물건의 가격을 합할 때 사용할 멤버변수
//	void buy(Product p) {
//		
////		(1) 아래의 로직에 맞게 코드를 작성하시오.
////		1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
//		if(money < p.price){
//			return;
//		}
////		1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
//		money -= p.price;
////		1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
//		add(p);
//		
//	}
//	void add(Product p) {
//		
////		(2) 아래의 로직에 맞게 코드를 작성하시오.
////		1.1 i의 값이 장바구니의 크기보다 같거나 크면
//		if(i >= cart.length){
////		1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
//			Product[] cart2 = new Product[cart.length * 2];
//		
////		1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
//			for(int i = 0; i < cart.length; i++){
//				cart2[i] = cart[i];
//			}
////		1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
//			cart = cart2;
////		1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
//			cart2[i++] = p;
//		}
//	} // add(Product p)
//	void summary() {	//으아 어렵다;
//		
////		(3) 아래의 로직에 맞게 코드를 작성하시오.
////		1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
//		ArrayList cart2List = new ArrayList(); //으아 어렵다;
////		1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
//		sum += cart[i].price;
//		System.out.println(sum);
////		1.3 물건을 사고 남은 금액(money)를 출력한다.
//		System.out.println(money);
//	} // summary()
//}
//
//class Product {
//	int price; // 제품의 가격
//	Product(int price) {
//		this.price = price;
//	}
//}
//
//class Tv extends Product {
//	Tv() { super(100); }
//	public String toString() { return "Tv"; }
//}
//
//class Computer extends Product {
//	Computer() { super(200); }
//	public String toString() { return "Computer";}
//}
//
//class Audio extends Product {
//	Audio() { super(50); }
//	public String toString() { return "Audio"; }
//}


//[7-20] 다음의 코드를 실행한 결과를 적으시오.

//class Exam07 {
//	public static void main(String[] args) {
//		Parent p = new Child();
//		//다형성 up-casting, 부모타입의 참조변수로 자식타입의 인스턴스를 참조할 수 있다.
//		Child c = new Child();
//		
//		System.out.println("p.x = " + p.x);
//		p.method();
//		
//		System.out.println("c.x = " + c.x);
//		c.method();
//	}
//}
//
//class Parent {
//	int x = 100;
//	void method() {
//		System.out.println("Parent Method");
//	}
//}
//
//class Child extends Parent {
//	int x = 200;
//	void method() {
//	//up-casting 후 오버라이딩된 메서드를 호출하면 부모클래스의 메서드가 호출되는게 아니라 자식클래스의 오버라이드된 메서드가 호출된다.
//		System.out.println("Child Method");
//	}
//}


//[7-21] 다음과 같이 attack메서드가 정의되어 있을 때,
//이 메서드의 매개변수로 가능한 것 두 가지를 적으시오.

//interface Movable {
//	void move(int x, int y);
//}
//
//void attack(Movable f) {
//	/* 내용 생략 */
//}
// 1.	, 2.


//[7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스와
//Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다.

//[7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시오.

//abstract class Shape {
//	Point p;
//	Shape() {
//		this(new Point(0,0));
//	}
//	Shape(Point p) {
//		this.p = p;
//	}
//	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
//	
//	Point getPosition() {
//		return p;
//	}
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//class Point {
//	int x;
//	int y;
//	Point() {
//		this(0,0);
//	}
//	Point(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
//	public String toString() {
//		return "["+x+","+y+"]";
//	}
//}
//
//class Circle extends Shape{
//	
//	double r;
//	Circle(Point p, double r){
//		super(p);
//		this.r = r;
//	}
//	Circle(double r){
//		this(new Point(0,0),r);
//	}
//	@Override
//	double calcArea() {
//		return 0;
//		//원의 넓이 공식 : 파이 x 반지름 제곱 (출처:구글)
//		//파이 * (r * r)
//	}
//}
//
//
//class Rectangle extends Shape{
//	
//	double width;
//	double height;
//	
//	Rectangle(double width, double height){
////		this.width = width;
////		this.height = height;
//		this(new Point(0,0), width, height);
//	}
//	public Rectangle(Point p, double width, double height){
//		super(p);
//		this.width = width;
//		this.height = height;
//	}
//	boolean square;
//	boolean isSquare(){
//		if(width == height){
//			square = width == height;
//		}
//		return square;
//	}
//	@Override
//	double calcArea() {
//		return width * height;
//	}
//}
//
//class Exercise7_23{
//	static double sumArea(Shape[] arr){
//		double sum = 0;
//		for(int i = 0; i < arr.length; i++){
//			sum += arr[i].calcArea();
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args){
//		Shape[] arr = {
//				new Circle(5.0),
//				new Rectangle(3,4),
//				new Circle(1)
//				};
//		System.out.println("면적의 합:"+sumArea(arr));
//	}
//}


//[7-24] 다음 중 인터페이스의 장점이 아닌 것은?

//	a. 표준화를 가능하게 해준다.					(X)
//	b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.	(X)
//	c. 독립적인 프로그래밍이 가능하다.				(X)
//	d. 다중상속을 가능하게 해준다.					(X)
//	e. 패키지간의 연결을 도와준다.					(O)


//[7-25] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

//class Outer {
//	class Inner {
//		int iv=100;
//	}
//}
//
//class Exam07 {
//	public static void main(String[] args){
//		Outer out = new Outer();
//		Outer.Inner inn = out.new Inner();
//		System.out.println(inn.iv);
//	}
//}


//[7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

//class Outer {
//	static class Inner {
//		int iv=200;
//	}
//}
//
//class Exam07 {
//	public static void main(String[] args) {
//		Outer out = new Outer();
//		Outer.Inner inn = new Outer.Inner();
//		System.out.println(inn.iv);
//	}
//}


//[7-27] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.

//class Outer {
//	int value=10;
//	
//	class Inner {
//		int value=20;
//		void method1() {
//			int value=30;
//			System.out.println(value); //30
//			System.out.println(this.value); //20
//			System.out.println(Outer.this.value); //10
//		}
//	} // Inner클래스의 끝
//} // Outer클래스의 끝
//
//class Exam07 {
//	public static void main(String args[]) {
//		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner();
//		inner.method1();
//	}
//}


//[7-28] 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.

//import java.awt.*;
//import java.awt.event.*;
//class Exam07{
//	public static void main(String[] args){
//		Frame f = new Frame();
//		f.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e){
//				e.getWindow().setVisible(false);
//				e.getWindow().dispose();
//				System.exit(0);
//			}
//		});
//	}
//}
//
//class EventHandler extends WindowAdapter{
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}
//}


//[7-29] 지역 클래스에서 외부 클래스의 인스턴스멤버와 static멤버에 모두 접근할 수 있지만,
//지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?






