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

		Stack<Object> sList = new Stack<Object>();
		sList.push("John");// push
		sList.push("Nick");
		sList.push("James");
		System.out.println("Peek: " + sList.peek() );// Peek
		System.out.println("Searching 'John' in stack: "+ sList.search("John"));// Search

		Iterator it = sList.listIterator();
		while(it.hasNext()) {
			System.out.println(sList.pop());// Pop
		}
	}

}