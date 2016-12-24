package datastructure;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> fruit = new LinkedList<String>();
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Grape");
		fruit.add("Banana");
		System.out.println(fruit);
		System.out.println("Size of the linked list: "+fruit.size());
		System.out.println("Is LinkedList empty? "+fruit.isEmpty());
		System.out.println("Does LinkedList contains 'Grape'? "+ fruit.contains("Grape"));
		Iterator<String> itr = fruit.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.swap(fruit, 0, 3);
		System.out.println("Results after swap operation:");
		for(String str: fruit){
			System.out.println(str);
		}
		fruit.addFirst("Strawberry");
		System.out.println(fruit);

		System.out.println("remove(index) method:"+fruit.remove(2));
		System.out.println("After remove(index) method call:");
		System.out.println(fruit);

		System.out.println(fruit.peekFirst());
		System.out.println(fruit.peekLast());
	}

}
