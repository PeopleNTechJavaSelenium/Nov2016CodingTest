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

		List<String> list = new LinkedList<String>();
		list.add("Rajshahi");
		list.add("Texas");
		list.add("Barisal");
		list.add("Dhaka");
		list.add("Chittagong");
		list.add("California");


		System.out.println(list.get(2)); //Option 1 - to print out one specific state
		System.out.println("--------------------------------------");


		for (int i = 0; i < list.size(); i++) { //Option 2 - using for loops to print out all three states
			//System.out.println(list.get(i));

			System.out.println("----------------------------");


			for (String state : list) {   //Option 3 - using foreach loops to print out all the states. A lot is happening in the background. Iterator and stuff
				System.out.println(state);

				System.out.println("-----------------------");
			}

			Iterator it = list.listIterator();  // Option 4 - retrieving with iterator
			while (it.hasNext()) {
				System.out.println(it.next());
			}

			System.out.println("-----------------------");

			System.out.println("Modified List without Dhaka ");

			list.remove("Dhaka");

			Iterator mod = list.listIterator();  // Option 4 - retrieving with iterator
			while (mod.hasNext()) {
				System.out.println(mod.next());

			}

		}


	}
}
