package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> stack = new Stack<String>();
		stack.push("Soccer");
		stack.push("Golf");
		stack.push("Tennis");
		stack.push("Bascketball");

		// Peek at the top of the stack.
		String peekResult = stack.peek();
		System.out.println(peekResult);

		// Pop the stack and display the result.
		String popResult = stack.pop();
		System.out.println(popResult);

		// Pop again.
		popResult = stack.pop();
		System.out.println(popResult);

		stack.add("Football");
		for (String str : stack) {
			System.out.println(str);
		}
		System.out.println(stack.search("BaseBall"));
	}
}
