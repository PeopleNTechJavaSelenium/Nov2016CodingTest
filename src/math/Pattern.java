package math;

import databases.ConnectDB;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		ConnectDB connectDB = new ConnectDB();
		int num=100;

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				connectDB.InsertDataFromStringToMySql(Integer.toString(num),"MathPattern","List");
				System.out.print(num + " ");
				num=num-i;
			}
			
		}
		
		
		

	}
}
