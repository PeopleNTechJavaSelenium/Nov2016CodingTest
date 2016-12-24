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

		Stack<String> stack = new Stack<String>();

		/**push element**/
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");

		System.out.println("look at top object (1), without taking it off the stack: "+stack);

		/**peek element**/
		System.out.println("look at top object (3), without taking it off the stack: "+stack.peek());

		/**search element**/
		int index = stack.search("3");
		System.out.println("stack search 3 at index: "+index);

		;
		/**pop element**/
		System.out.println("Removed item is: "+stack.pop());
		System.out.println("Elements after remove: "+stack);

		System.out.println("**For each loop**");
		for(Iterator<String> i = stack.iterator(); i.hasNext(); ) {
			String item = i.next();
			System.out.println(item);
		}

		System.out.println("**While loop**");

		Iterator it = stack.listIterator();
		while(it.hasNext()) {
			System.out.println(stack.pop());
		}
	}

}
