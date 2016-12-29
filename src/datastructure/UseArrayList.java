package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abra on 12/28/16.
 */
public class UseArrayList {

	public static void main(String[] args) {

		List<String> List = new ArrayList<String>();
		List.add("Pizza");
		List.add("Rice");
		List.add("Chicken");

		System.out.println("Using for each loop:");
		for(String Food: List){
			System.out.println(Food);
		}

		System.out.println("Using iterator:");
		Iterator it = List.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}
}
