package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<>();
		queue.add("Grade A");
		queue.add("Grade B");
		queue.add("Grade C");
		queue.add("Grade D");

		queue.forEach(System.out::println);
		System.out.println();
		System.out.println("Printer with Iterator");


		Iterator it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(queue.element());

			queue.remove();
			System.out.println();
			System.out.println(queue.remove());
			System.out.println(queue.element());
			System.out.println(queue.peek());

		}

	}
}