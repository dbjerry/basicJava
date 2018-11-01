package e_oop;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car("blue","Auto",4);
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
//	Car(){  <= 기본생성자
//		
//	}
	
	Car() {
		color = "white";
		gearType = "Stick";
		door = 4;
	}
	
	Car(String color, String gearType, int door) {
		//
		this();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}