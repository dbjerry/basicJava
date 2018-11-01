package f_oop2;

public class InterfaceTest01 {
	public static void main(String[] args) {
		Fight f = new Fight(); //interface는 객체를 만들 수 없다.
		
		System.out.println(f instanceof Unit2);
		Unit2 u2 = f;
		
		System.out.println(f instanceof Object);
		Object o2 = f;
		
		System.out.println(f instanceof Movable);
		Movable mv = f; //인터페이스타입의 참조변수로 그를 구현한 구현체의 인스턴스를 참조할 수 있다.
		
		System.out.println(f instanceof Attackable);
		System.out.println(f instanceof Fightable);
	}
}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}	
}

class Unit2{
	int x;
	int y;
	
	int currentHp;
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable{
	
}