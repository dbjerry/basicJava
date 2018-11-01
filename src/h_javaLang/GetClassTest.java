package h_javaLang;

import java.util.Arrays;

public class GetClassTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//1. 객체를 통해서 얻어오는 방법
		Class obj = new Person(456489446L).getClass();
		System.out.println(obj.getName());
		System.out.println(Arrays.toString(obj.getInterfaces()));
		
		
		//2. 리터럴로부터 얻는 방법
		Class obj2 = Person.class.newInstance().getClass();
		//newInstance(). <- 기본생성자가 있어야함
		System.out.println(obj2.getName());
		System.out.println(Arrays.toString(obj2.getInterfaces()));
		
		
		//3. 클래스의 이름으로부터 얻는 방법
		Class obj3 = Class.forName("h_javaLang.Person");
		System.out.println(obj3.getName());
		System.out.println(Arrays.toString(obj3.getInterfaces()));
		
	}
}