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
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0,5);
		list.add(6);

		System.out.println("retriveing data using for each loop");
		for (Integer state : list) {
			System.out.println(state);
		}
		System.out.println();
		System.out.println("Peeking to the first element of the list");
		System.out.println(list.peek());
		System.out.println();
		list.removeFirst();
		list.removeLast();
		list.remove(1);
		System.out.println("retrieving data after deleting and using while loop with iterator");
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}
