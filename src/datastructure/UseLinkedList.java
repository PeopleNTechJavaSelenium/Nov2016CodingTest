package datastructure;


import java.util.Collections;
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
		 /*This is how elements should be added to the array list*/
		lList.add("Kamran");
		lList.add("Salman");
		lList.add("Farhan");
		lList.add("Kenan");
		lList.add("Adnan");

		System.out.println("For Content: " + lList);

	  /*Remove elements from array list like this*/
		lList.remove(1);
		lList.remove("Kenan");


		// forEach loop as of Java 1.8
		System.out.println("Display using for each loop");
		for (String content:lList) {
			System.out.println( content);
		}

		// while loop with iterator
		System.out.println("Display using While loop with iterator");
		Iterator<String> iterator = lList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sorting
		Collections.sort(lList);
		System.out.println("Sorted linkedList" + lList);
				

		// Peeking
		System.out.println ("Peeking:" + lList.peek());
	}
}
