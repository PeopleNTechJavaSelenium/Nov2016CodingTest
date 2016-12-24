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

		Stack<Object> list = new Stack<>();
		list.push("5");
		list.push("9");
		list.push("20");

		System.out.println("Peek Element: " + list.peek());
		Iterator it = list.listIterator();
		while (it.hasNext()){
			System.out.println(list.pop());
		}


	}

}
