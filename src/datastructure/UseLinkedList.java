package datastructure;

import databases.ConnectDB;

import java.util.*;
import java.util.Iterator;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("13");
		ll.add("20");
		ll.add("18");
		ll.add(2,"22");
		ll.addFirst("11");
		ll.remove("3");
		ll.add("6");
		ll.add("19");
		ll.add("32");
		ll.add("4");
		ll.add(7,"7");

		System.out.println("linkelist elements	:" + ll +"  And the top item is  ; "+ll.peek());

		System.out.println("*******Now using iterator and while loop to print out*******");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("******* Using forEach loop to print out*******");

		for (String j: ll)
		{
			System.out.println("After manipulation "+ j);

		}



		}

	}












