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
		list.push("1");
		list.push("2");
		list.push("3");
		System.out.println("Peek Element: " + list.peek());
		System.out.println("The list.search method shows the current position of the object in the stack since 3 is at the peek the position will be one"+ list.search("3"));
		System.out.println("Using for each loop: ");
		for (Object o:list){
			System.out.println(o);

		}
		Iterator it = list.listIterator();

		System.out.println("Using Iterator:");
		while(it.hasNext()) {
			System.out.println(list.pop());
		}
	}
	}


