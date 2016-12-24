
package algorithm;

import java.util.Random;
import java.sql.ResultSet;
import java.sql.*;



public class Numbers {
	public static Connection connection;
	public static ResultSet data;

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
*/

	public static void main(String[] args) {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

        //Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");


		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			//connectDB.directDatabaseQueryExecute("delete from algorithm");
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('Selection Sort',";
			sql=sql+selectionSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('Insertion Sort',";
			sql=sql+insertionSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Continue for rest of the Sorting Algorithm....
		//bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('bubble Sort',";
			sql=sql+bubbleSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}


		//merge Sort
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in mergeSort Sort take: " + mergeSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('merge Sort',";
			sql=sql+mergeSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}


		//quick Sort
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in quickSort Sort take: " + quickSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('quick Sort',";
			sql=sql+quickSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}


		//heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in heapSort Sort take: " + heapSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('heap Sort',";
			sql=sql+heapSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}



		//bucket Sort

		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bucketSort Sort take: " + bucketSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('bucket Sort',";
			sql=sql+bucketSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}



		//shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shellSort Sort take: " + shellSortExecutionTime + " milli sec");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql= new String();
			sql="INSERT INTO `testDB`.`sort` (`sort`, `time`, `size`) VALUES('shell Sort',";
			sql=sql+shellSortExecutionTime+","+num.length+")";

			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		displaySortingMysqlDb();
	}


	public static void displaySortingMysqlDb() {
		ResultSet rs = null;
		try {
			System.out.println("\n\nListing from the MysqlDB");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql="";
			String query = "select sort,time,size from testDB.numbers;";
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String sort = rs.getString("sort");
				String time = rs.getString("time");
				String size = rs.getString("size");
				System.out.println("Total Execution Time of " + size	+ " numbers in "+sort+" take: " + time + " milli sec");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs!= null) {
				rs=null;
			}
		}
	}



}
