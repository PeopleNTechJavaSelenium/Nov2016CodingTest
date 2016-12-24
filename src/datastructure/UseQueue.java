package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
	static String newLine = System.getProperty("line.separator");
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();

		//Add elements to queue using add method
		queue.add("Java");
		queue.add("C++");
		queue.add("Matlab");
		queue.add("Pascal");
		queue.add("VBscript");

		System.out.println(newLine + "Items in the queue..." + queue + newLine);

		//Remove element from the queue using .remove method
		System.out.println("Removed element is: " + queue.remove() + newLine);

		//.element() returns the current element in the queue witch is C++
		System.out.println("Retrieve element is: " + queue.element() + newLine);

		//.poll() method retrieves and removes the head of this queue
		//or return null if this queue is empty.
		System.out.println("Removed and Retrieved element, null if empty, is: " + queue.poll() + newLine);

		//.peek() just returns the current element in the queue, null if empty
		//Here it will print Matlab as C++ is removed above
		System.out.println("Retrieved element is : " + queue.peek() + newLine);
	}
}

