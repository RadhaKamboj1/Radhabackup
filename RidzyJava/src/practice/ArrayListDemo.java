package practice;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo {

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
		System.out.println("size of array list: " + al.size());
		// al.clear;
		System.out.println("size of array list: " + al.size());
		Iterator it = al.iterator();
		while (it.hasNext()) // returns true and false
		{
			System.out.println("Element: " + it.next());
			System.out.println("size: " + al.size());
			it.remove(); // to element from array list
		}
	}
}