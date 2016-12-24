package math;

import databases.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
	//	int smallest = Integer.MAX_VALUE;
	//	for(int i =0;i<array.length;i++) {
	//		if(smallest > array[i]) {
	//			smallest = array[i];
	//		}
	//	}
	//	System.out.println("Smallest number in array is : " +smallest);
	//}
		Arrays.sort(array);
		System.out.println("The lowest number from this array is: " + array[0]);
		ConnectDB connectDB = new ConnectDB();
		Object lowestValue = new ArrayList();
		try {
			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		Iterator e = ((List)lowestValue).iterator();

		while(e.hasNext()) {
			String st = (String)e.next();
			System.out.println(st);
		}

	}
}
