package datastructure;

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
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("USA", "NY");
		map.put("Australia", "Sydney");
		map.put("Canada", "Montreal");

		for(Map.Entry<String,String> cursor:map.entrySet()){
			System.out.println("Key: " + cursor.getKey()+" "+ "Value: " + cursor.getValue());
		}

	}

}
