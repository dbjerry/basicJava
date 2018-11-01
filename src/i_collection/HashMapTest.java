package i_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//toString이 자동으로 오버라이딩
		map.put("유다영", 100);
		map.put("구인수", 83);
		map.put("나진실", 99);
		map.put("유민지", 98);
		
		
		System.out.println(map);				// Creat
		System.out.println(map.get("구인수"));	// Read
		
		map.remove("나진실");						// Delete
		map.remove("구인수");
		System.out.println(map);
		
		map.put("유민지", 95);					// Update
		
		
		
		
		
		
		
		
		
		
	}
}
