package collectionDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, Object> hm = new HashMap<>();
		hm.put(10, "radha");
		hm.put(52, 'a');
		hm.put(68, 'a');

		for (Entry<Integer, Object> h : hm.entrySet()) {
			// System.out.println(h);
			System.out.println(hm.get(h.getKey()));
		}

	}

}
