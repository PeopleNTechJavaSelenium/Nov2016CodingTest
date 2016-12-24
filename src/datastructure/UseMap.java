package datastructure;
import databases.ConnectDB;
import java .util.LinkedHashMap;

import java.util.Map;
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


		List<String> healthy = new ArrayList<>();
		List<String> unhealthy = new ArrayList<>();
		healthy.add("Carrot");
		healthy.add("Tomato");
		unhealthy.add("Butter");
		unhealthy.add("Icecream");
		Map<String, List<String>> mapH = new LinkedHashMap<>();
		mapH.put("healthy", healthy);
		mapH.put("unhealthy", unhealthy);
		System.out.println("Retrieving data using For Each loop:");
		for (Map.Entry food : mapH.entrySet()) {
			System.out.println("Key= " + food.getKey() + ", Value=" + food.getValue());
		}
		System.out.println("Retrieving data using Iterator with while loop:");
		Iterator it = mapH.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entries = (Map.Entry) it.next();
			String key = (String) entries.getKey();
			List<String> value = (List<String>) entries.getValue();
			System.out.println("Key= " + key + ", Value= " + value);

		}
		ArrayList<String> listValue = new ArrayList<>();
		listValue.add("Carrot");
		listValue.add("Tomato");
		listValue.add("Butter");
		listValue.add("Icecream");
		//ArrayList<List<String>> listValue= new ArrayList<>();
		ArrayList<String> listKeys = new ArrayList<>();
		listKeys.add("healthy");
		listKeys.add("unhealthy");
		//for(Map.Entry<String,List<String>> map:mapH.entrySet()){
		//listValue.add(map.getValue());
		//listKeys.add(map.getKey());
		//}
		/*for(List<String> st1:listValue){
			//System.out.println(st1);
		}
		for(String st2:listKeys) {
			System.out.println(st2);
		}*/
		List<String> retrieveKey = new ArrayList<>();
		List<String> retrieveValue = new ArrayList<>();
		ConnectDB connectDB1 = new ConnectDB();
		try {

			//create Map Table in the database
			//connectDB1.Query("create table Map(MapValue Text,MapKey Text);");
			//Storing Data
			connectDB1.InsertDataFromArryListStringToMySql(listKeys, "Map", "MapKey");
			connectDB1.InsertDataFromArryListStringToMySql(listValue, "Map", "MapValue");
			//retrieving From database(below)
			retrieveValue = connectDB1.readDataBase("Map", "MapValue");
			retrieveKey = connectDB1.readDataBase("Map", "MapKey");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\n\nData Retrieved From Database: ");

		for (String st : retrieveValue) {
			if (st == null) {

			} else {
				System.out.println("Value= " + st);
			}
		}
		for (String st2 : retrieveKey) {
			if (st2 == null) {
			} else {
				System.out.println("key= " + st2);
			}

		}
	}

}
