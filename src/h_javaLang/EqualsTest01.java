package h_javaLang;

public class EqualsTest01 {
	public static void main(String[] args) {
		
		Value v1 = new Value(3); //기본생성자없음
		Value v2 = new Value(3);
		
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
		
	}
	
}

class Value{
	int value;
	
	public Value(int value){
		this.value = value;
	}
	
	
	
}