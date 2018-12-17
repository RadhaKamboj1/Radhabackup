package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("BTES");
		h.add("bebo");
		h.add("BTES1");
		h.add("Bebo");
		h.add("BTES");
		h.add("bebo");
		System.out.println("count: " + h.size());
		Iterator<String> it = h.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
