package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


		LinkedList<Integer> lList=new LinkedList<>();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		lList.remove(3);// Removing integer at 3rd index -- which is 4.
		System.out.println("This peek element is: "+lList.peek());
		System.out.println("This is the output using for each loop:");
		for(Integer int1:lList){
			System.out.print(int1+" ");
		}
		Iterator it=lList.iterator();
		System.out.println("\nThis is the output using Iterator:");
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}
