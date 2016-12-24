package datastructure;
import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		LinkedList<String> list = new LinkedList<String>();
		list.add("fish");
		list.add("meat");
		list.add("carrot");
		list.add("sushi");
		list.add("ice");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======================");
		System.out.println("This is from peek: " + list.peek());
		System.out.println("This is from peekFirst: " + list.peekFirst());
		System.out.println("This is from peekLast: " + list.peekLast());
		list.removeFirst();
		list.addFirst("tuna");
		list.addLast("apple");
		list.remove(3);
		System.out.println("======================");
		for (String item : list) {
			System.out.println(item);

		}
		System.out.println("The food in position or index 2: "+list.get(2));
		ConnectDB connectDB = new ConnectDB();

		List<String> linkedLiat = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryListStringToMySql(list,"LinkedList","LinkedList");
			linkedLiat = connectDB.readDataBase("LinkedList", "LinkedList");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nData is reading from the Table (LinkedList Table) and displaying to the console:\n");
		for (String st:linkedLiat) {
			System.out.println(st);
		}
	}

}
