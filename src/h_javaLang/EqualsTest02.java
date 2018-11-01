package h_javaLang;

import java.io.Serializable;

public class EqualsTest02 {
	public static void main(String[] args) {
		Person p1 = new Person(9108141111111L);
		Person p2 = new Person(9108141111111L);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
	}
}

class Person implements Serializable{
	long id;
	
	public Person(){
		
	}
	
	public Person(long id){
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Person && obj != null){
			result = id == ((Person)obj).id;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}
	
	
	
}