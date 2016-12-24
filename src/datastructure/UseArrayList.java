package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;
import java.util.Random;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		int i=0;
		ArrayList<Integer> aList = new ArrayList();
		Random random = new Random();
		while(i<10 ){
			aList.add(random.nextInt(100));
			i++;
		}
		System.out.println("The List looks like :");
		aList.stream().forEach(s -> System.out.print(s+" "));
		System.out.println();
		//remove elements
		aList.remove(0);
		for (Integer integer :aList) {
			if(integer%2==0){
			}
		}
		aList.stream().forEach(s -> System.out.println("The removed elements "+s));
		//retrieve element
		int retValue=aList.get(3);
		System.out.println("Retrieved element is = "+retValue);
		System.out.println(aList);

		String str = Arrays.toString(aList.toArray());
		ConnectDB connectDB = new ConnectDB();
		List<String> mapValue = new ArrayList<>();     //database: core_java
		try {                                             //Table: arraylist
			connectDB.InsertDataFromStringToMySql(str,"arraylist","data"); //Column:data
			mapValue=connectDB.readDataBase("arraylist", "data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nData is reading from the Table (ArrayList) and displaying to the console");
		for(String st:mapValue){
			System.out.print(st);
			System.out.print("  ");
		}
	}
}
