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


		LinkedList<String> linkedList = new LinkedList<String>();

		//add elements.
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		linkedList.add("Fourth");
		linkedList.add("Fifth");
		linkedList.addFirst("New First");
		linkedList.addLast("New Last");

		System.out.println("Items in LinkedList: "+linkedList);

		/*peek elements.*/
		System.out.println("linkedList peek: "+linkedList.peek());
		/**look peekFirst**/
		System.out.println("linkedList peekFirst: "+linkedList.peekFirst());


		/**look at last**/
		System.out.println("linkedList peekLast: "+linkedList.peekLast());


		/*Remove first and last element*/
		System.out.println("linkedList removeFirst: "+linkedList.removeFirst());
		System.out.println("linkedList removeLast: "+linkedList.removeLast());

		/*retrieve elements.*/
		Object firstvar = linkedList.get(0);
		System.out.println("linkedList retrieve elements: " +firstvar);


		/*for loop*/
		System.out.println("\n**For Each loop**\n");

		linkedList.forEach((temp) -> {
			System.out.print(temp + " ");
		});
		System.out.println("\n**For Each loop with Iterator**\n");
		for (Iterator list2 = linkedList.iterator(); list2.hasNext(); ) {
			System.out.print(list2.next() + " ");
		}

		/* Using While Loop*/
		System.out.println("\n\n**While Loop with Iterator**\n");
		Iterator Iterator = linkedList.iterator();
		while (Iterator.hasNext()) {
			System.out.print(Iterator.next()+" ");
		}



	}

}
