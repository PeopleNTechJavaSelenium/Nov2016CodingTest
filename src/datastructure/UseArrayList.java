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
            List<String> list = new ArrayList<>();
            list.add("Belgium");
		    list.add("Bangladesh");
		    list.add("Bhutan");

		System.out.println("Using for loop:");
		for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i));
			}

		System.out.println("Using for each loop:");
			for(String Country:list){
				System.out.println(Country);
			}

		System.out.println("Using Iterator: ");
		Iterator it = list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}



	}

}
