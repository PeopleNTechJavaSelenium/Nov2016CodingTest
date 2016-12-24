package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

		ConnectDB connectDB = new ConnectDB();

		List<String> citiesOfUSA = new ArrayList<String>();
		citiesOfUSA.add("New York");
		citiesOfUSA.add("New Jersey");
		citiesOfUSA.add("New Hampshire");

		List<String> citiesOfCanada = new ArrayList<String>();
		citiesOfCanada.add("Toronto");
		citiesOfCanada.add("Montreal");
		citiesOfCanada.add("Vancouver");

		List<String> citiesOfUK = new ArrayList<String>();
		citiesOfUK.add("London");
		citiesOfUK.add("Manchester");
		citiesOfUK.add("Oxford");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("USA", citiesOfUSA);
		map.put("Canada", citiesOfCanada);
		map.put("UK", citiesOfUK);

		StringBuilder listString = new StringBuilder();

		for (Map.Entry<String, List<String>> entry: map.entrySet()){
			for (String s: entry.getValue()){
				System.out.println(entry.getKey()+" "+ s);
				connectDB.InsertDataFromStringToMySqlTwoCol("DSMap",entry.getKey(),"MapCountry",s,"MapCities");

			}

		}
		String sql = "SELECT * FROM DSMap";
		//System.out.println(connectDB.directDatabaseQueryExecute(sql,"DSMap"));
	}

}
