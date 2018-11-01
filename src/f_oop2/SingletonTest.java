package f_oop2;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		
	}
}

class Singleton{
	static Singleton st = null;
	private Singleton(){
		
	}
	
	static Singleton getInstance(){
		if(st == null){
			st = new Singleton();
		}
		return st;
	}
}
