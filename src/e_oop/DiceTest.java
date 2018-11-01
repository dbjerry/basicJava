package e_oop;

import java.util.Scanner;

public class DiceTest {
	public static void main(String[] args) {
		do {
			System.out.println("==== D i c e  Test ===="+"\n");
			DoubleDice test = new DoubleDice();
			// result = throwDice호출
			System.out.println("Press 'any key' and press 'Enter' to proceed" + "\n" + "To exit, press 'c' key");
			Scanner scan = new Scanner(System.in);
			if(scan.next().equals("c")){
				System.out.println("\n" + "=== F i n i s h e d ===");
				return;
			}
			int result = test.throwDice((int)(Math.random()*6+1), (int)(Math.random()*6+1));
			System.out.println("Dice Total : "+result+"\n");
		} while(true);
	}

}

class DoubleDice {
	// 메서드명 : throwDice
	int throwDice(int dice1, int dice2) { // 매개변수 필요없음, 이 메서드 안에서 랜덤값 만들면 됨
	//리턴타입_메서드명(매개변수1, 매개변수2) {
		System.out.println("Dice 1) "+dice1+"\n"+"Dice 2) "+dice2);
		int result = 0;
		// 주사위 두개 던지고 나온 수의 합만큼 리턴합니다.
		// 단, 던진 주사위의 값이 같으면(더블) 한 번 더 던질 수 있다. 재귀호출을 이용하세요.
		result = dice1 + dice2;
		if(dice1 == dice2) {
			System.out.println("Double, Congraturation!" + "\n");
			result += throwDice((int)(Math.random()*6+1), (int)(Math.random()*6+1)); // <= 재귀호출 부분
		}
		return result;
	}
	
}