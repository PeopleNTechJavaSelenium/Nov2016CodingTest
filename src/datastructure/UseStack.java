package datastructure;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.Stack;

public class UseStack {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack stack = new Stack();
		System.out.println("stack: " +stack);
		int i=0;
		Random rand = new Random();
		while(i<10 ){
			showpush(stack, rand.nextInt(100));
			i++;
		}
		System.out.println("Height object is: "+stack.peek());
		showpop(stack);
		showpop(stack);
		showpop(stack);
		try {
			showpop(stack);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("stack: " + st);
	}
	static void showpop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println("stack: " + st);
	}
}
