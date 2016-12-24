package math;

import algorithm.Sort;
import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		Sort useSelSort=new Sort();
		useSelSort.selectionSort(array);
		System.out.println("The lowest number is: "+ array[0]);

		ConnectDB connectDB = new ConnectDB();

		List<String> lowestValue = new ArrayList<String>();

		try {
			//create table in database
			connectDB.Query("create table tbl_lowestNumber(column_lowestNumber Integer);");

			//Store data to the database
			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");

			//Retrieve data from the database
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data shown below is from the Table (tbl_lowestNumber)");
		for(String st:lowestValue){
			System.out.println(st);
		}





	}

}
