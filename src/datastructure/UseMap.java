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

		Map<String, String> mList = new LinkedHashMap<String, String >();
		mList.put("Honda", "Civic");
		mList.put("BMW", "M6");
		mList.put("Audi", "R8");

		for (Map.Entry map :mList.entrySet()) {
			System.out.println(map.getKey()+ " " + map.getValue());

		}

		Iterator<Map.Entry<String, String>> iterator = mList.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println("Key :" + entry.getKey() + "Value" + entry.getValue());
		}

	}

}