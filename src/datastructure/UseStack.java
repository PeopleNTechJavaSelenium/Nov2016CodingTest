package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<Object> list = new Stack<Object>();
		list.push("10");
		list.push("20");
		list.push("30");
		System.out.println("Peek Element: " + list.peek());
		Iterator it = list.listIterator();
		System.out.println("Printing elements using while loop with iterator and using pop()");
		while(it.hasNext()) {
			System.out.println(list.pop());
		}
		System.out.println();
		list.push("40");
		list.push("50");
		list.push("60");
		System.out.println("Printing using for each loop");

		for(Object state:list){
			System.out.println(state);
		}
	}

}
