package f_oop2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar2 c = new FireCar2();
		System.out.println(c instanceof FireCar2);
		
		System.out.println(c instanceof Car2);
		Car2 c2 = c;
		
		System.out.println(c instanceof Object);
		Object c3 = c;
		
		Car2 c4 = new Car2();
		System.out.println(c4 instanceof Car2);
		System.out.println(c4 instanceof Object);
		
		System.out.println(c4 instanceof FireCar2);
		FireCar2 fc2 = (FireCar2)c4;
		
		
		Car2 c5 = new FireCar2();
		System.out.println(c5 instanceof FireCar2);
		
		
	}
}

class Car2{
	
}

class FireCar2 extends Car2{
	
}