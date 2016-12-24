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
		list.push("18");
		list.push("21");
		list.push("35");
		System.out.println("Peek Element: " + list.peek());


		System.out.println(list.pop());

		System.out.println("\nUsing for each loop");
		for(Object age:list){
			System.out.println(age);
		}

		System.out.println("\nUsing while loop with Iterator");
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
