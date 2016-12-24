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
		list.add("Chewie");
		list.add("Happy");
		list.add("Samsung");
	Iterator it = list.iterator();
	while(it.hasNext())
	{

		System.out.println(list.element());
		list.remove();
		}

	}
}
