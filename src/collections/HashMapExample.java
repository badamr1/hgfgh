package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println("Initial list of elements: " + hm);
		
		hm.put(1, "Ram");
		hm.put(2, "Anji");
		hm.put(3, "King");

		System.out.println("After invoking put() method ");
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(3, "Giri");
		
		System.out.println("After invoking putIfAbsent() method ");
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(4, "Ravi");
		map.putAll(hm);
		
		System.out.println("After invoking putAll() method ");
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
