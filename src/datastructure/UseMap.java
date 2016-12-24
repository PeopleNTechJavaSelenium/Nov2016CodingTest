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

		Map<String, String> list = new LinkedHashMap<String, String>();
//        HashMap was changed to LinkedHashMap to execute the values in the order its written
		list.put("USA", "NY");
		list.put("Canada", "Toronto");
		list.put("UK", "London");
/*       The key entered ex. "USA" must be unique or else it will over write
         the previous input*/

		for(Map.Entry map:list.entrySet()) {
			System.out.println(map.getKey() + "  " + map.getValue());
		}
	}

}
