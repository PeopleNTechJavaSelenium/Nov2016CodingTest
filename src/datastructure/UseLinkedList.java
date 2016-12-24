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
		list.add("Hamburger");
		list.add("Pizza");
		list.add("Steak");
		System.out.println("Peek Element: " + list.peek());

		System.out.println("\nUsing for each loop");
		for(String food:list){
			System.out.println(food);
		}

		list.remove(2);

		System.out.println("\nUsing while loop with Iterator");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(list.element());
			list.remove();
		}

	}

}
