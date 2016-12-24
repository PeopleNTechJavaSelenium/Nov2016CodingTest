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
		list.push("5");
		list.push("10");
		list.push("15");
		System.out.println("Highest Number is..: " + list.peek());
		Iterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(list.pop());
		}
	}

}