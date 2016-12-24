package datastructure;
import databases.ConnectDB;

import java.util.*;
import java.util.Iterator;
import java.util.TreeMap;
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
		//ConnectDB connectDB = new ConnectDB();
		List<String> dogs = new ArrayList<String>();
		dogs.add("GoldenRetriever");
		dogs.add("BullDog");
		dogs.add("Beagle");

		List<String> cats = new ArrayList<String>();
		cats.add("Persian Cat");
		cats.add("Munchkin");
		cats.add("Ragdol");

		Map<String, List<String>> mp = new LinkedHashMap<String, List<String>>();
		mp.put("Dogs Breed", dogs);
		mp.put("Cats Breed", cats);

		for(Map.Entry animal:mp.entrySet()) {
			System.out.println(animal.getKey() + "  " + animal.getValue());
			//connectDB.InsertDataFromStringToMySql(String, );
		}
	}

}
