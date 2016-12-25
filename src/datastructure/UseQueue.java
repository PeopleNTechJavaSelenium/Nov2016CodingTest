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
		Queue<String> qList = new LinkedList<String>();
		qList.add("Naruto"); // Add
		qList.add("Sasuke");
		qList.add("Natsu");

		System.out.println("This is the peek: " + qList.peek()); // Peek
		qList.remove(1); // Remove





		 for (String anime: qList){ // For each Loop
		System.out.println(anime);
		 }

        // Iterator

        Iterator it = qList.iterator();
        while (it.hasNext()) System.out.println(it.next());
	}


}
