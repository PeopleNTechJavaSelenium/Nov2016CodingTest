package datastructure;

import databases.ConnectDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap map = new HashMap();
		map.put("Rajib",new Double(3434.34));
		map.put("Aurick",new Double(123.22));
		map.put("Aura",new Double(1378.00));

		Set set=map.entrySet();                 // Get a set of the entries

		Iterator i=set.iterator();               // Get an Iterator

		while(i.hasNext()) {                         // Display elements
			Map.Entry mEntry=(Map.Entry) i.next();
			System.out.print(mEntry.getKey()+": ");
			System.out.println(mEntry.getValue());
		}

		SortedSet<String> keys = new TreeSet<String>(map.keySet());         //sort by HashMapKey

		SortedSet<String> values = new TreeSet<String>(map.values());          // Sorted List by hashmap values:

		List<Map<String, List<String>>> maps = new ArrayList<Map<String, List<String>>>();              //nested map
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Virginia");                                            // And so on..
		map1.put("Fairfax", arraylist1);

		maps.add(map1);                                                        // And so on...
		System.out.println("Fairfax is in State: " + map1.get("Fairfax"));
		String str = Arrays.toString(maps.toArray());
		ConnectDB connectDB = new ConnectDB();
		List<String> mapValue = new ArrayList<>();     //database: core_java
		try {                                             //Table: usemap
			connectDB.InsertDataFromStringToMySql(str,"usemap","data"); //Column:data
			mapValue=connectDB.readDataBase("usemap", "data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nData is reading from the Table (UseMap) and displaying to the console");
		for(String st:mapValue){
			System.out.print(st);
			System.out.print("  ");
		}
}
}
