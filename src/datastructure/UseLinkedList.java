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
		LinkedList<String> list = new LinkedList<>();
		list.add("DE");
		list.add("MA");
		list.add("VA");

		System.out.println("Using for each loop: ");
		for(String State:list){
			System.out.println(State);
		}

		System.out.println("Using Iterator: ");
		Iterator it = list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
