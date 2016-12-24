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

		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");
		list.add("Element 4");
		list.add("Element 5");

		System.out.println("Elements in Queue: "+list);

		System.out.println("Peek returns first element in Queue: "+ list.peek());

		//Remove first element
		System.out.println("Removing First Element using Poll: "+list.poll()+ " removed");

		//Print List Again
		System.out.println("Elements in Queue after Poll: "+list);

		//Printing using For Each Loop
		System.out.println("\nUsing For Each Loop");
		for (String s: list){
			System.out.println(s.toString());
		}

		//WhileLoop/Iterator Usage
		System.out.println("\nUsing While Loop to print and remove elements");
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(list.element());
			list.remove();
		}

		System.out.println("\nQueue after removal: "+list);

	}

}
