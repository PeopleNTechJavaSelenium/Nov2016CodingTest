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
		list.add("Hi this is the head and it will be removed after i use poll");
		list.add("How are you");
		list.add("Good day");
		System.out.println("Peek element: " + list.peek());
		System.out.println("poll usage it will retrieve and remove the head: "+list.poll());
		System.out.println("\nFor each loop usage:");
		for(String st:list){
			System.out.println(st);
		}
		System.out.println("\nUsing Iterator to iterate through each element which also removes the elements:");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(list.element());
			list.remove();
		}


	}

}
