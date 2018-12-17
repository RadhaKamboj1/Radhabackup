package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkListDemo {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add("Radha");
		al.add(123);
		al.add("abc");
		al.add(3.25);
		al.add('c');
		al.add('c');
		al.add('c');
		al.add(2, "elements");
		// System.out.println("size of array list: " + al.size());
		ListIterator<Object> li = al.listIterator();
		while (li.hasNext()) {
			System.out.println("list element at : " + li.nextIndex() + " is " + li.next());
			System.out.println();
		}
		System.out.println("moving back");
		while (li.hasPrevious()) {
			System.out.println("list element at : " + li.previousIndex() + " is " + li.previous());
		}
	}

}
