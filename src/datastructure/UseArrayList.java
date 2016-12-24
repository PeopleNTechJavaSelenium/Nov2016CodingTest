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
		list.add("BMW");
		list.add("AUDI");
		list.add("MERCEDEZ");

		System.out.println("Using for each loop");
		for(String carMake:list){
			System.out.println(carMake);
		}
		System.out.println("Using while loop with Iterator");
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


	}
}