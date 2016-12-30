package datastructure;

import javafx.scene.control.ContentDisplay;

import java.util.Arrays;

public class UseStack {

	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;

	UseStack(int size) {
		stackSize = size;
		stackArray = new String[size];

		Arrays.fill(stackArray, "-1");

	}

	public void push(String input) {

		if (topOfStack + 1 < stackSize) {
			topOfStack++;

			stackArray[topOfStack] = input;


		} else System.out.println("Sorry but the Stack is full");

		displayUseStack();

		System.out.println("PUSH " + input + " Was Added to the Stack ");

	}

	public String pop() {
		if (topOfStack >= 0) {

			displayUseStack();

			System.out.println("POP " + stackArray[topOfStack] + " Was Removed from the Stack ");

			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		} else {

			System.out.println("Sorry but stack is empty");

			return "-1";

		}


	}

	public String peek() {
		displayUseStack();
		System.out.println("PEEK" + stackArray[topOfStack] + " is at the Top of the Stack");

		return stackArray[topOfStack];


	}

	private void displayUseStack() {
	}






	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		UseStack theStack = new UseStack(10);
		theStack.push("10");
		theStack.push("16");
		theStack.push("20");
		theStack.peek();
		theStack.pop();
		theStack.displayUseStack();



	}

}
