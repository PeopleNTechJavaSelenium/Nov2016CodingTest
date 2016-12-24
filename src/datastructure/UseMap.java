package datastructure;

import java.util.*;
import java.sql.*;


public class UseMap {
	public static void main(String args[]) {

	/*
     * Demonstrate how to use Map that includes storing and retrieving elements.
     * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
     * Use For Each loop and while loop with Iterator to retrieve data.
     *
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     */
	HashMap<Integer, String> ballondor = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
      ballondor.put(1, "Ronaldo");
      ballondor.put(2, "Messi");
      ballondor.put(3, "Griezmann");
      ballondor.put(4, "Neymar");
      ballondor.put(5, "Suarez");

	/* Display content using Iterator*/
	Set set = ballondor.entrySet();
	Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
		Map.Entry mentry = (Map.Entry)iterator.next();
		System.out.print("Ranked: "+ mentry.getKey() + " is: ");
		System.out.println(mentry.getValue());
	}

	/* Get values based on key*/
	String var= ballondor.get(2);
      System.out.println("The ranked 2 is: "+var);

      /* Remove values based on key*/
      ballondor.remove(3);
      System.out.println("Map key and values after removal:");
	Set set2 = ballondor.entrySet();

	Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
		Map.Entry mentry2 = (Map.Entry)iterator2.next();
		System.out.print("Ranked: "+mentry2.getKey() + " is: ");
		System.out.println(mentry2.getValue());
	}
		TreeMap sortedHashMap = new TreeMap(ballondor);
		System.out.println("Sorted HashMap: " + sortedHashMap);
	}
}


