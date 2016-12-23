package datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> list = new LinkedHashMap<Integer, String>();
		list.put(1, "Hello");
		list.put(2, "World");
		list.put(3, "Java");

		for(Map.Entry map:list.entrySet()){
			System.out.println(map.getKey()+ "  " +   map.getValue());
		}
		list.remove(1);
		System.out.println();
		System.out.println("Retrieving data after deletion");
		Iterator it = list.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
