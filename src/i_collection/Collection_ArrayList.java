package i_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_ArrayList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		//toString이 자동으로 오버라이딩
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		//1번방부터 4번방까지 나와야하지만 끝은 미포함이므로 4,3,2가 출력
		System.out.println(list2);
		
		
		//그동안 정렬하느라 고생했다
		Collections.sort(list1);
		System.out.println(list1);
		
		list2.add(1, 100);
		//1번방에 100을 추가, 다른 방들이 밀렸다.
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
