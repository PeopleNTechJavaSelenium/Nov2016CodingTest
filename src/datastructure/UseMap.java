package datastructure;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

			List<String> dinaFriends = new ArrayList<String>();
			dinaFriends.add("Maria");
			dinaFriends.add("Lavina");
			dinaFriends.add("Rafid");

			List<String> karinaFriends = new ArrayList<>();
			karinaFriends.add("Karen");
			karinaFriends.add("Faisal");
			karinaFriends.add("Jasmin");


			List<String> zabedFriends = new ArrayList<>();
			zabedFriends.add("Tanim");
			zabedFriends.add("Craig");

			List<String> zahidFriends = new ArrayList<>();
			zahidFriends.add("Asma");
			zahidFriends.add("Sozal");

		Map<String, List<String>> friends = new LinkedHashMap<String, List<String>>();
			friends.put("Dina", dinaFriends);
			friends.put("Karina", karinaFriends);
			friends.put("Zabed", zabedFriends);
			friends.put("Zahid",  zahidFriends);

		for (Map.Entry<String, List<String>> allfriends: friends.entrySet()) {
			System.out.println(allfriends.getKey()+ ":"+ allfriends.getValue());

			System.out.println();

			Iterator it = friends.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry print = (Map.Entry) it.next();
				System.out.println(print.getKey()+ ":"+ print.getValue());

			}
		}


	}
}



