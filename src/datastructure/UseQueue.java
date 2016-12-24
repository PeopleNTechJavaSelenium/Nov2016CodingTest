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

		Queue<String> list = new LinkedList<>();
		list.add("Basketball");
		list.add("Football");
		list.add("Baseball");
		System.out.println("Peek Element: " + list.peek());
		list.poll();

		System.out.println("\nUsing for each loop");
		for(String sports:list){
			System.out.println(sports);
		}

		System.out.println("\nUsing while loop with Iterator");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(list.element());
			list.remove();
		}

	}

}
