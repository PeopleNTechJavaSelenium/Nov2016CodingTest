package datastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.

		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, String> list = new HashMap<>();
		list.put("USA", "NJ");
		list.put("Mexico", "Mexico City");
		list.put("Canada", "Torento");

		for(Map.Entry Map:list.entrySet()){
			System.out.println(Map.getKey() + " " + Map.getValue());
		}




	}

}
