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
		list.add("Sid");
		list.add("Himal");
		list.add("Aman");
		list.add("Indra");
		list.add("Sujan");
		list.add(1,"Saroj");

		System.out.println("Using for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.remove(2);
		list.remove("Saroj");
		System.out.println();
		System.out.println("Using for each loop and after deletion");
		for(String state:list){
			System.out.println(state);
		}
		System.out.println();
		System.out.println("Using peek to see what is in index 2");
		System.out.println(list.get(2));
		System.out.println();
		System.out.println("Using while loop with Iterator");
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
