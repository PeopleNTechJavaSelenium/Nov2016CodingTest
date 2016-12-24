package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/*  Read this numbers, find the pattern then implement the logic from this pattern. which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


		int count = -1, skip = 0;
		for (int i = 100; i >= 0; i--) {
			if (count == 10) {
				count = 0;
				skip++;
			}
			count++;
			i = i - skip;
			System.out.println(i);
		}


	}
}