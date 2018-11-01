package f_oop2;

import java.util.Arrays;

import com.sun.java_cup.internal.runtime.Scanner;

public class DeckTest {
	public static void main(String[] args) {

		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		Card a = d.pick();
		System.out.println(a/*.toString*/);
		
		d.shuffle(100);
		Card b = d.pick(7);
		System.out.println(b);
		
		d.shuffle();
		b = d.pick(7);
		System.out.println(b);
		
		d.kimProject();
		System.out.print("proj : "+d.c2[0]+"    ");
		System.out.println("proj : "+d.c2[1]);
	}
}

class Deck {
//  크기 2짜리 배열에 선언 및 초기화
//  랜덤한 카드 두 장을 뽑아 크기 비교 후 큰값을 방금만든 배열은 왼쪽에,
//	작은값을 오른쪽에 저장하는 메서드를 만드시오
//  숫자가 같을 시 하트>다이아>클로버>스페이드
//  메서드명 kimProject, 매개변수 리턴값 없음
	Card[] c2 = new Card[2];
	void kimProject(){
		c2[0] = pick();
		c2[1] = pick();
		if(c2[0].number < c2[1].number){
			int tmp = c2[0].number;
			c2[0].number = c2[1].number;
			c2[1].number = tmp;
		} else if(c2[0].number == c2[1].number){
			if(c2[0].kind < c2[1].kind){
				int tmp = c2[0].kind;
				c2[0].kind = c2[1].kind;
				c2[1].kind = tmp;
			}
		}
		
	}
	
	
	
	//1. 카드의 수량을 저장할 수 있는 변수를 선언 및 초기화하세요 CARD_NUM
	//단, Card클래스의 상수를 이용하세요
	final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX;
	
	//2. 카드 52장을 담을 변수를 선언 및 생성해주세요 c
	Card[] c = new Card[CARD_NUM];
	
	//3. 기본생성자를 만드세요
	//1,1 , 1,2 , 1,3 , ... , 4,11 , 4,12 , 4,13
	//c에 52장의 카드를 채워주세요
	Deck() {
		int arr = 0;
		for(int j = 1; j < Card.KIND_MAX+1; j++) {
			for(int k = 1; k < Card.NUM_MAX+1; k++) {
				c[arr++] = new Card(j, k);
			}
		}
	}
	
	//4. c의 방번호를 입력받아 해당 방번호의 카드를 반환하는 메서드를 만드세요 pick
	/**
	 * 방번호를 입력받아 카드 한 장을 반환하는 메서드
	 * @param a 입력받는 방번호
	 * @return 해당
	 */
	Card pick(int roomnum) {
		Card result = c[roomnum];
		return result;
	}
	//5. 랜덤번째 방의 카드를 한 장 반환하는 메서드를 만드세요 pick
	Card pick() { //Overloading
		int roomnum = (int)(Math.random()*CARD_NUM);
		Card result = c[roomnum];
		return result;
	}
	
	//6. 카드를 섞어주세요 shuffle
	//hint, 연습문제 5-5번을 응용하세요
	void shuffle() {
		for(int i = 0; i < CARD_NUM; i++) {
			int j = (int)(Math.random()*CARD_NUM);
			Card tmp = c[i];
			c[i] = c[j];
			c[j] = tmp;
		}
	}
	//7. 카드를 섞어주세요 shuffle
	//반복횟수를 입력받아서 해당 횟수만큼 랜덤한 방을 두 개 뽑아 
	//위치를 변경해주세요
	void shuffle(int repeat) { //Overloading
		for(int i = 0; i < repeat; i++) {
			int random1 = (int)(Math.random()*CARD_NUM);
			int random2 = (int)(Math.random()*CARD_NUM);
			
			Card temp = c[random1];
			c[random1] = c[random2];
			c[random2] = temp;
		}
//		for(int i = 0; i < repeat; i++) {
//			int j = (int)(Math.random()*CARD_NUM);
//			Card tmp = c[i];
//			c[i] = c[j];
//			c[j] = tmp;
//		}
	}

}
class Card {
	static final int KIND_MAX = 4; 
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1;
	static final int CLOVER = 2; 
	static final int DIAMOND = 3; 
	static final int HEART = 4;
	
	int kind;
	int number;
	
	//1.매개변수가 두 개인 생성자를 만드세요
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	//2.기본생성자를 만드세요
	//단, 매개변수가 두 개인 생성자를 이용하여 1,1의 값으로 초기화하세요
	Card() {
		this(SPADE,1);
	}
	@Override
	public String toString() {
		String kind = "";
		String number = "";
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
			
		case 2:
			kind = "CLOVER";
			break;
			
		case 3:
			kind = "DIAMOND";
			break;
			
		case 4:
			kind = "HEART";
			break;
		}
		
		switch (this.number) {
		case 1:
			number = "ACE";
			break;
			
		case 11:
			number = "J";
			break;
			
		case 12:
			number = "Q";
			break;
			
		case 13:
			number = "K";
			break;
			
		default :
			number = ""+this.number; //빈 큰따옴표
			break;
		}
		return kind + ":" + number;
	}
		
}
