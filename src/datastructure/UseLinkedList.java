package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("NY");
		list.add("CA");
		list.add("AZ");
		list.add("NC");
		list.add("SC");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======================");
		System.out.println("This is from peek: " + list.peek());
		System.out.println("This is from peekFirst: " + list.peekFirst());
		System.out.println("This is from peekLast: " + list.peekLast());
		list.removeFirst();
		list.addFirst("VA");
		list.addLast("VT");
		//list.remove(3);
		System.out.println("======================");
		for (String city : list) {
			System.out.println(city);

		}
		System.out.println("The City in position or index 2: "+list.get(2));


	}

}
