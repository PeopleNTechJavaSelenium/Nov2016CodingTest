package datastructure;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.*;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Integer> list = new ArrayList();

		ArrayList<Integer> listcopy = new ArrayList();

		Random rand = new Random();
		//add elements
		for (int i = 0; i < 10; i++)
			list.add(rand.nextInt(100));

		System.out.println("The arraylist contains the following elements: " + list);

		//peek elements
		//there is no peel method for arrylist

		//remove elements.
		list.remove(0);
		System.out.println("The arraylist contains the following elements  after remove item from index 0: " + list);


		//retrieve elements.
		int item = list.get(0);
		System.out.println("The item is the index 0 is: " + item);


		System.out.println("\n**For Each each loop with Iterator**\n");
		System.out.println("Retrieving items using iterator");
		for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
			System.out.print(it.next() + " ");
		}

		System.out.println("\n\n**while loop with Iterator**\n");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}


		//System.out.println("\n\n**After sorting the ArrayList**\n");
		//list.stream().forEach(s -> System.out.print(s + " "));
		String tmpunsorted = convertToString(list);
		Collections.sort(list);
		String tmpsorted = convertToString(list);

		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();
		ResultSet rs = null;
		try {

			connectDB.directDatabaseQueryExecute("delete from tbl_arraylist");
			String sql = "INSERT INTO `core_java`.`tbl_arraylist` (unsortedelements,sortedelements) VALUES('" + tmpunsorted + "','" +tmpsorted  + "')";

			connectDB.directDatabaseQueryExecute(sql);

			System.out.println("\n\nData is reading from the Table (tbl_arraylist) and displaying to the console\n");
			rs = connectDB.Query("select * from tbl_arraylist");
			while (rs.next()) {
				System.out.println("\n\n**After unsortedelements the ArrayList**\n");
				System.out.println(rs.getString("unsortedelements"));
				System.out.println("\n\n**After sortedelements the ArrayList**\n");
				System.out.println(rs.getString("sortedelements"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {
			ConnectDB.removeMongoDBDataDocument("tbl_arraylist");
			BasicDBObject doc = new BasicDBObject();
			doc.put("unsortedelements", tmpunsorted);
			doc.put("sortedelements", tmpsorted);

			ConnectDB.insertMongoDBDataDocument("tbl_arraylist", doc);

			System.out.println("\n\nData is reading from the MongoDB Collection (tbl_arraylist) and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("tbl_arraylist");
			while (cursor.hasNext()) {
				DBObject obj = cursor.next();
				System.out.println("\n\n**After unsortedelements the ArrayList**\n");
				System.out.println((String) obj.get("unsortedelements"));
				System.out.println("\n\n**After sortedelements the ArrayList**\n");
				System.out.println((String) obj.get("sortedelements"));

			}
		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (cursor != null) {
				cursor = null;
			}
		}
		/*Mongodb section end*/

	}

	static String convertToString(ArrayList<Integer> numbers) {
		StringBuilder builder = new StringBuilder();
		for (int number : numbers) {
			builder.append(number);
			builder.append(",");
		}
		builder.setLength(builder.length() - 1);
		return builder.toString();
	}
}
