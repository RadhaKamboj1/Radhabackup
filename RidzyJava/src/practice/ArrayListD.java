package practice;

import java.util.ArrayList;

public class ArrayListD {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add(123);
		al.add("abc");
		al.add(2.3f);
		al.add('c');
		al.add(true);
		System.out.println("number of elements in a array list: " + al.size());

		for (int i = 0; i < al.size(); i++) {
			System.out.println("element at index " + i + "is: " + al.get(i));
		}
		al.add(1, "element");
		System.out.println("      new list");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("element at index " + 1 + "is: " + al.get(1));
		}

	}

}
