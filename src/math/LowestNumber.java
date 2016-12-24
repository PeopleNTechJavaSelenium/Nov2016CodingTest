package math;

import databases.ConnectDB;

import com.mysql.jdbc.*;


import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		int lowestNumber = array[0];
		for (int i : array) {
			if(i < lowestNumber ){
				lowestNumber = i;
			}
		}
		System.out.println("The lowest number is "+lowestNumber);

		ConnectDB connectDB = new ConnectDB();
		List<String> lowestValue = new ArrayList<>();
		try {
			connectDB.InsertDataFromArryToMySql(array, "lowestnumber", "shownumber");
			lowestValue = connectDB.readDataBase("lowestnumber", "shownumber");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Data is reading from the Table (lowestNumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.print(st);
			System.out.println();
		}





	}

}
