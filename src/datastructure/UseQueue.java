package datastructure;

import java.util.PriorityQueue;
import java.util.Random;

public class UseQueue {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();          // create priority queue
		Random rand = new Random();
		for(int i=1;i<10;i++){                                // insert values in the queue
		priorityQueue.add(rand.nextInt(100));
		}
		System.out.println("Initial priority queue values are: " +priorityQueue);
		Integer head=priorityQueue.peek();                                     // get the head from the queue
		System.out.println("Head of the queue is: " +head);
		boolean isremoved=priorityQueue.remove(priorityQueue.peek());                    // remove 7 from the queue
		System.out.println("Priority queue values after remove head: "+priorityQueue);
	}
}
