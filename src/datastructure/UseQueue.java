package datastructure;

import java.util.Arrays;

public class UseQueue {

	private String[] queueArray;

	private int queueSize;

	private int front, rear, numberOfItems = 0;

	UseQueue(int size){

		queueSize = size;

		queueArray = new String[size];

		Arrays.fill(queueArray, "-1");


	}

		public void insert(String input){

			if(numberOfItems + 1 <= queueSize) {

				queueArray[rear] = input;

				rear++;

				numberOfItems++;

			} else {

				System.out.println("Queue is full");



			}
		}

			public void remove(){

				if(numberOfItems >0){

					System.out.println("Remove");


				}
			}

			public void peek(){
				System.out.println("first element is "  + queueArray[front]);



			}

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		UseQueue useQueue = new UseQueue(10);
		useQueue.insert("10");
		useQueue.insert("20");
		useQueue.insert("22");

		useQueue.peek();

		useQueue.remove();

	}

}
