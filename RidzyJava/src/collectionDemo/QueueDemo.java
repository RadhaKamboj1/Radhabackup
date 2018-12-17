package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("btes");
		q.add("a bebo");
		q.add("abc");
		q.add("abc");
		q.add("btes");
		q.add("btes");
		System.out.println("is the queue empty: " + q.isEmpty());
		System.out.println("count: " + q.size());
		q.offer("abc");

		// q.poll(); //remove head node
		Iterator<String> it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
