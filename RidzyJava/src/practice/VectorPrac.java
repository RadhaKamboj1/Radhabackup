package practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorPrac {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<>();
		v.add(123);
		v.add(2.3);
		v.add('y');
		v.add(2, "elements");

		Enumeration<Object> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

			// Iteration<Object> it= v.iterator();
			// while(it.hasNext()) {

		}

	}
}
