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

		Stack<String> stack = new Stack<>();

		stack.add("Element 1");
		stack.add("Element 2");
		stack.add("Element 3");
		stack.add("Element 4");

		System.out.println("Current Elements in Stack"+stack);

		System.out.println("Using Peek would return last entered value: "+stack.peek());
		int index = stack.search("Element 3");
		System.out.println("Element 3 is at index: "+index);


		System.out.println("Removing last entered Element using Pop: "+ stack.pop());

		System.out.println("Stack After Pop: "+stack);

		System.out.println("\nPrint Stack using For Each");
		for (Iterator<String> itr = stack.iterator(); itr.hasNext();){
			String item = itr.next();
			System.out.print(item+" ");
		}

		System.out.println("\n\nPop Using While");
		Iterator it = stack.listIterator();
		while(it.hasNext()){
			System.out.println(stack.pop());
		}

		System.out.println("\nStack after Pop: "+stack);
	}

}
