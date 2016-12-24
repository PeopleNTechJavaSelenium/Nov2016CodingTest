package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int count = 0;
		int fN = 100;     //First Number
		int lN = 30;      // Last Number
		int[] arr = new int[33];
		int i = 0;
		while (fN > lN) {
			count++;
			if (count <= 10) {
				//System.out.println(fN);
				arr[i] = fN;
				i++;
				fN--;
			} else if (count <= 20) {
				//System.out.println(fN);
				arr[i] = fN;
				i++;
				fN = fN - 2;
			} else if (count <= 30) {
				//System.out.println(fN);
				arr[i] = fN;
				i++;
				fN = fN - 3;
			} else if (count <= 40) {
				//System.out.println(fN);
				arr[i] = fN;
				i++;
				fN = fN - 4;
			}
		}
		for (i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		System.out.print(" ");
	}
		ConnectDB connectDB = new ConnectDB();
		List<String> patternValue = new ArrayList<>();     //database: core_java
		try {                                             //Table: pattern
			connectDB.InsertDataFromArryToMySql(arr, "pattern", "shownumber"); //Column:shownumber
			patternValue=connectDB.readDataBase("pattern", "shownumber");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nData is reading from the Table (Pattern) and displaying to the console");
		for(String st:patternValue){
			System.out.print(st);
			System.out.print("  ");
		}
	}
}
