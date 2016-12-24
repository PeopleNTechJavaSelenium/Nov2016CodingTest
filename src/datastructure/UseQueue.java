package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> list = new LinkedList<>();

		/*add elements.*/
		list.add("Paul");
		list.add("Matt");
		list.add("Eve");
		list.add("john");
		list.add("robert");

		System.out.println("items in Queue: "+list);

 		/*peek elements.*/
		System.out.println("look at top Queue without taking it off the stack: "+list.peek());

		/*remove elements.*/
		System.out.println("remove element at top Queue : "+list.remove());

		/*poll elements. */
		System.out.println("get the head from the queue element at top Queue : "+list.poll());


		/*for loop*/
		System.out.println("**For Each loop**");
		for(String s : list) {
			System.out.println(s.toString());
		}

		/* Using While Loop*/
		System.out.println("**While Loop with Iterator**");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(list.element());
			list.remove();
		}
	}

}
