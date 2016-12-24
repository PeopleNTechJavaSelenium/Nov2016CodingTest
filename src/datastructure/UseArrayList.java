package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ConnectDB connectDB = new ConnectDB();

		ArrayList<Integer> arrayList = new ArrayList();

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			arrayList.add(rnd.nextInt(1000));
		}

		Iterator itr = arrayList.iterator();


		System.out.println("Unsorted ArrayList");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}


		Collections.sort(arrayList);

		System.out.println("\nSorted ArrayList");

		for(int counter: arrayList){
			System.out.print(counter+" ");
		}
		connectDB.InsertDataFromArryListToMySql(arrayList,"DSArrayList","List");
		System.out.println("Sorted ArrayList Exported to DB:core_java Table:DSArrayList");



	}
}

