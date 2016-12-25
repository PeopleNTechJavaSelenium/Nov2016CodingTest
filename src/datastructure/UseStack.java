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
		sList.push("Jon Snow");// push
		sList.push("Daenerys Targaryen");
		sList.push("Tyrion Lannister");
		System.out.println("Peek: " + sList.peek() );// Peek
        System.out.println("Searching 'Jon Snow' in stack: "+ sList.search("Jon Snow"));// Search

		Iterator it = sList.listIterator();
		while(it.hasNext()) {
            System.out.println(sList.pop());// Pop
        }
	}

}
