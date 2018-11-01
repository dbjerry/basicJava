package f_oop2;

import java.util.Vector;
 
public class ProductTest {
	public static void main(String[] args) {
		
		Tv2 t = new Tv2("올레드TV", 1000);
		Dyson d = new Dyson("다이슨V8", 200);
		NoteBook nb = new NoteBook("Gram", 300);
		
//		Customer cs = new Customer(); //부모타입의 참조변수로 자식타입의 객체를 인스턴스한다.
		Buyer buyer = new Buyer("김지태",10000);
		
//		cs.Sign("김지태", 10000);
//		cs.Sign("박   진", 9000);
		
		buyer.buy(t);
		buyer.buy(d);
//		buyer.buy(nb);
		
		System.out.println("\n고객님의 보유액 : " + buyer.money + "만원");
		System.out.println("고객님의 포인트 : " + buyer.bonusPoint + "점");
		System.out.println("고객님의 구매목록 : " + buyer.cart);
		
		buyer.refund(t);
//		buyer.refund(d);
		buyer.refund(nb);
		
		buyer.summary();
		
	}
}
 
class Product {
	String name;	//상품명 변수
	int price;		//상품가격 변수
	int mileage;	//마일리지(10% = 상품가격/10)
	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
		mileage = price/10;
	}
}
 
class Tv2 extends Product{
 
	public Tv2(String name, int price){
		super(name, price);
	}
 
	@Override
	public String toString() {
		return name;
	}
	
}
 
class Dyson extends Product{
 
	public Dyson(String name, int price){
		super(name, price);
	}
 
	@Override
	public String toString() {
		return name;
	}
	
}
 
class NoteBook extends Product{
 
	public NoteBook(String name, int price){
		super(name, price);
	}
 
	@Override
	public String toString() {
		return name;
	}
	
}

/** 
 * @구매행위클래스
 *
 */
class Buyer{ //구매행위를 위한 클래스
	String name;		//고객명
	int money;			//고객보유액
	int bonusPoint;		//고객포인트
	
	Vector<Product> cart = new Vector<Product>(); //구매목록을 위한 Vector
	
	public Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	public Buyer(){
		
	}
	
	/**
	 * @물품구매메서드
	 * p 물품의 상위 클래스
	 */
	void buy(Product p){ //다형성을 이용해서 부모타입으로 통합시킨다. Product로 up-casting
		
		if(money < p.price){
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;			//고객보유액에서 물품가격을 뺀만큼 저장
		bonusPoint += p.mileage;	//고객포인트에 마일리지(물품가격/10)를 저장
		cart.add(p);				//Object로 up-casting
		System.out.println("고객님, " + p + "(" + p.price + "만원)" + "를 구매하셨습니다.");
	}	
		
		
	/**
	 *@반품메서드refund
	 */
	void refund(Product p){
//		if(cart.isEmpty()){
//			System.out.println("구매물품이 존재하지 않습니다.");
//			return;
//		}
//		
//		if(cart.remove(p)){
//			money += p.price;
//			
//		}
		
		for(int i = 0; i < cart.size(); i++){
			
			if(cart.get(i) == p){
				cart.remove(i);
				money += p.price;
				bonusPoint -= p.mileage;
				System.out.println("\n\"고객님, 환불하시게요?\n구매하셨던" + p + "가(이) 구매목록에 있습니다.");
				System.out.println(p + "(" + p.price + "만원)" + "를(을) 환불하였습니다.\"");
				break;
			}else if(cart.size()-1 == i){
				System.out.println("\n\"죄송합니다, " + p + "를(을) 구매하신 적이 없네요.\"\n");
			}
		}
	}
	
	/**
	 *@영수증메서드summary
	 */
	void summary(){
		
		int price = 0;
		System.out.println("\n\n┌────────────┤ 영수증 ├────────────┐");
		System.out.println("│ [내역] \t \t \t │");
		for(int i = 0; i < cart.size(); i++){
			Product p = (Product)cart.get(i);
			System.out.println("│ · " + p.name + "\t\t" + p.price + "만원 \t │");
			price += p.price;
		}
		System.out.println("│ \t \t \t \t │" + "\n│ [합계] \t \t \t │");
		System.out.println("│ · 총 " + cart.size() + "종\t\t" + price + "만원 \t │");
		System.out.println("│ \t \t \t \t │" + "\n│ [잔액 및 잔여포인트] \t \t │");
		System.out.println("│ · 잔액\t\t\t" + money + "만원 \t │");
		System.out.println("│ · 잔여포인트\t \t" + bonusPoint + "점\t │");
		System.out.println("│ \t \t \t \t │" + "\n│ * " + name + " 고객님, 감사합니다!\t │");
		System.out.println("│ \t \t \t \t │");
		System.out.println("└────────────────────────────────┘");
	}
	
}


/**
 * @고객관리클래스
 */
class Customer{
//	String name;		//고객명
//	int money;			//고객보유액
//	int bonusPoint;		//고객포인트
//	Buyer buyer = new Buyer();
	Vector<Buyer> sign = new Vector<Buyer>();
//	void Sign(String name, int money){
//		this.name = name;
//		this.money = money;
//	}
//	void addSign(Buyer b){
//		sign.add(b);
//	}
	
	
	
	
	
	
	
	
}