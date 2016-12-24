package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Venus");
		list.add("Mars");
		list.add("Earth");

		list.set(0, "Saturn");
		Iterator it = list.listIterator();
		for (String state : list) {
			System.out.println(state);
		}
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add(3, "Sun");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(2);

		for ( int j=0; j < list.size(); j++ ) {
			System.out.println(j + ": " + list.get(j));
		}
		System.out.println( "First Search: " + list.indexOf("Mars") );
		System.out.println( "Second Search: " + list.indexOf("Earth"));
	}
}
