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
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("Honda");
		lList.add("Toyota");
		lList.add("Infiniti");

		Iterator it = lList.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

		lList.addFirst("Tesla");
		lList.addLast("Hyundai");
		lList.removeLast();
		lList.removeFirst();
		lList.remove(2);
		System.out.println("Peek" + lList.peek());


	}

}