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
		list.add("Tiger");
		list.add("Lion");
		list.add("Cheetah");


		System.out.println("Using for each loop");
		for(String animals:list){
			System.out.println(animals);
		}
		System.out.println("Using while loop with Iterator");
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());

		}
	}
}
