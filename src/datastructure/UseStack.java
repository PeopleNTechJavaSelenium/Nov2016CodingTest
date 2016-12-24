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

		Stack<Object> window = new Stack<Object>();
		window.push("1st window");
		window.push("2nd window");
		window.push("3rd window");

		window.forEach(System.out::println);

		System.out.println();
		System.out.println("Printer with Iterator");

		Iterator it = window.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Peek Element: " + window.peek());

			System.out.println();
			System.out.println(window.pop());
			System.out.println(window.remove( 0));
			System.out.println(window.peek());
		}

	}
