package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
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
		list.add("NY");
		list.add("CA");
		list.add("AZ");
		list.add("NC");
		list.add("SC");


//        for(String city:list){
//             System.out.println(city);
//        }
		//Arrays.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
