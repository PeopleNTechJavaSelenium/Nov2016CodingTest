package algorithm;
import com.mongodb.*;
//import com.mongodb.client.MongoCollection;
import databases.ConnectDB;
//import org.bson.Document;

import java.lang.reflect.Array;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.util.*;

/*
 *Created by PIIT_NYA on 12/11/2016.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++) {

			num[i] = rand.nextInt(1000000);

		}


		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();

		String sql="";

		//Selection Sort
		Sort algo = new Sort();
		int[] arrsorted = algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		try {
			connectDB.directDatabaseQueryExecute("delete from tbl_algorithm");
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('Selection Sort',";
			sql=sql+selectionSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {


			ConnectDB.removeMongoDBDataDocument("tbl_algorithm");
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "3");
			doc.put("sort", "Selection Sort");
			doc.put("time", selectionSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);

		}catch (Exception e) {
			e.printStackTrace();
		}


		/*Mongodb secion end*/


		//Insertion Sort
		arrsorted = algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('Insertion Sort',";
			sql=sql+insertionSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "2");
			doc.put("sort", "Insertion Sort");
			doc.put("time", insertionSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/


		//Continue for rest of the Sorting Algorithm....
		//bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('bubble Sort',";
			sql=sql+bubbleSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "3");
			doc.put("sort", "bubble Sort");
			doc.put("time", bubbleSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/

		//merge Sort
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in mergeSort Sort take: " + mergeSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('merge Sort',";
			sql=sql+mergeSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "4");
			doc.put("sort", "merge Sort");
			doc.put("time", mergeSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/

		//quick Sort
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in quickSort Sort take: " + quickSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('quick Sort',";
			sql=sql+quickSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "5");
			doc.put("sort", "quick Sort");
			doc.put("time", quickSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/

		//heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in heapSort Sort take: " + heapSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('heap Sort',";
			sql=sql+heapSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "61");
			doc.put("sort", "heap Sort");
			doc.put("time", heapSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/


		//bucket Sort

		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bucketSort Sort take: " + bucketSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('bucket Sort',";
			sql=sql+bucketSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "7");
			doc.put("sort", "bucket Sort");
			doc.put("time", bucketSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/

		//shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shellSort Sort take: " + shellSortExecutionTime + " milli sec");

		try {
			sql="INSERT INTO `core_java`.`tbl_algorithm` (`sort`, `time`, `size`,UnSortedelements,Sortedelements) VALUES('shell Sort',";
			sql=sql+shellSortExecutionTime+","+num.length+",'"+Arrays.toString(num)+"','"+Arrays.toString(arrsorted)+"')";

			connectDB.directDatabaseQueryExecute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section*/
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("id", "8");
			doc.put("sort", "shell Sort");
			doc.put("time", shellSortExecutionTime);
			doc.put("size", num.length);
			doc.put("UnSortedelements", Arrays.toString(num));
			doc.put("Sortedelements", Arrays.toString(arrsorted));
			ConnectDB.insertMongoDBDataDocument("tbl_algorithm",doc);
		}catch (MongoException e) {
			e.printStackTrace();
		}

		/*Mongodb secion end*/

		displaySortingMongoDb();
		displaySortingMysqlDb();
	}

	public static void displaySortingMongoDb() {
		DBCursor cursor = null;
		try {

			System.out.println("\n\nData is reading from the MongoDB Collection (tbl_algorithm) and displaying to the console\n");
			cursor =ConnectDB.getMongoDBDataDocument("tbl_algorithm");
			while(cursor.hasNext()) {
				DBObject obj = cursor.next();
				String sort = (String)obj.get("sort");
				long time = ((long)obj.get("time"));
				int size = (int)obj.get("size");
				System.out.println("Total Execution Time of " + size	+ " numbers in "+sort+" take: " + time + " milli sec");
			}
		}catch (MongoException e) {
			e.printStackTrace();
		}finally {
			if (cursor!= null) {
				cursor.close();
			}
		}
	}

	public static void displaySortingMysqlDb() {
		ResultSet rs = null;
		try {
			System.out.println("\n\nListing from the MysqlDB");
			System.out.println("\n\nData is reading from the Table (tbl_algorithm) and displaying to the console\n");
			ConnectDB connectDB = new ConnectDB();

			rs =connectDB.Query("select sort,time,size from tbl_algorithm");
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
