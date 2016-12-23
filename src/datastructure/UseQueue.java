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
		list.add("Lohan");
		list.add("Michael");
		list.add("Elezabeth");

		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(list.element());
			list.remove();
		}
		list.add("Sam");
		list.add("Angelo");
		list.add("Alex");
		System.out.println("Peeking through the queue");
		System.out.println(list.peek());
		list.remove();
		list.add("Jon");
		list.add("Mike");
		System.out.println("After removing the first element and adding few more and using for each loop");
		for(String state:list){
			System.out.println(state);
			//list.remove();
		}

	}

}
