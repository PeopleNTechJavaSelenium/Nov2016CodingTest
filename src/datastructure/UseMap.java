package datastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseMap {


	public static void main(String[] args) {

		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Renadh", 22);
		map.put("Osman", 23);
		map.put("Noman", 25);

		System.out.println(map.get("Renadh"));

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		map.replace("Osman", 23, 21);
		map.put("Maheeb", 21);

		System.out.println("----------------------------------");

		System.out.println("New list: ");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);

		}

	}

}