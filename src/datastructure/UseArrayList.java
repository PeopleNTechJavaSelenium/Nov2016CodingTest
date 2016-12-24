package datastructure;
import databases.ConnectDB;

import java.util.*;
import java.util.Arrays;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ConnectDB connectDB = new ConnectDB();
		ArrayList<String> al=new ArrayList<String>();//creating arraylist
		al.add("Bob");
		al.add(0,"Nancy");
		al.add("tom");
		al.add(2,"vincent");
		al.add("ali");
		al.add("susan");

		al.remove(4);

		System.out.println("ArrayList elements:	"+al);


		System.out.println("******* Using forEach loop to print out*******");

		for (String s: al
			 ) {System.out.println(s);

		}
		System.out.println("*******Now using iterator and while loop to print out*******");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		connectDB.InsertDataFromArryListToMySql(al,"ArrayListTBL","arrList");

		}

		}

	}


