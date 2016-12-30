package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			list.add("CA");
			list.add("TX");
			list.add("NY");

			for (int i = 0; i < list.size(); i++) { //Option 2 - using for loops to print out all three states
				System.out.println(list.get(i));
			}

			for (String state : list) {   //Option 3 - using foreach loops to print out all the states. A lot is happening in the background. Iterator and stuff
				System.out.println(state);

				list.remove(1);

				System.out.println("-----------");

				System.out.println("Modified list: ");

				for (String modstate : list) {   //Option 3 - using foreach loops to print out all the states. A lot is happening in the background. Iterator and stuff
					System.out.println(state);
				}

				Iterator it = list.listIterator();
				while(it.hasNext()){
					System.out.println(it.next());



				}

			}

		}

	}