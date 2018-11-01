package f_oop2;

public class ChildTest {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.volume = 15;
		c.volumeUp();
		System.out.println(c.volume);
		
		c.channel = 20; //자식에게 초기화가 됨, 지역변수 우선
		c.channelUp();
		System.out.println(c.channel);
		
	}
}

class Parent {
	int channel;
	
	void channelUp() {
		channel++;
	}
}

class Child extends Parent {
	int volume;
	int channel; //부모와 자식에게 똑같은 이름의 멤버가 있으면 자식멤버를 수행
	void volumeUp() {
		volume++;
	}
}
