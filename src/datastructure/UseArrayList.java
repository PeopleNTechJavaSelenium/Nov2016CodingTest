package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */


		List<String> list = new ArrayList<String>();
		list.add("Dina");
		list.add("Karina");
		list.add("Zabed");
		list.add("Zahid");

		list.forEach(System.out::println);

		System.out.println();
		list.remove(2);
		System.out.println("After removing index 2: Zahid here is the new list ");


		list.forEach(System.out::println);

		Iterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());



			System.out.println();
			for (String sibling : list) {
				System.out.println(sibling);


				int num = 4;
				while (num > 0) {
					System.out.println(num);
					num--;
				}
			}

		}

	}
}

