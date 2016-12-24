package com.mkyong;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {

		// create a Map
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jan");
		map.put("2", "Feb");
		map.put("3", "Mar");
		map.put("4", "Apr");
		map.put("5", "May");
		map.put("6", "Jun");

		// Map -> Set -> Iterator -> Map.Entry -> troublesome, not recommend!
		System.out.println("\nExample 1...");
		Iterator<Entry<String,String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String,String> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}


		System.out.println("\nExample 2...");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}


		System.out.println("\nExample 3...");
		for (Object key : map.keySet()) {
			System.out.println("Key : " + key.toString() + " Value : " + map.get(key));
		}


		System.out.println("\nExample 4...");
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
	}

}

