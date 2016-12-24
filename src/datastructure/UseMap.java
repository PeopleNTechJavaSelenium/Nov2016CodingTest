package datastructure;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.sql.ResultSet;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();
		ResultSet rs = null;
		try {
			connectDB.directDatabaseQueryExecute("delete from tbl_map");
			ConnectDB.removeMongoDBDataDocument("tbl_map");
		}catch (Exception ex){
			ex.printStackTrace();
		}

		List<String> citiesOfUSA = new ArrayList<String>();
		citiesOfUSA.add("NY");
		citiesOfUSA.add("CA");

		List<String> citiesOfCanada = new ArrayList<String>();
		citiesOfCanada.add("Toronto");
		citiesOfCanada.add("Montreal");

		List<String> citiesOfUK = new ArrayList<String>();
		citiesOfUK.add("London");
		citiesOfUK.add("Manchestar");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("USA", citiesOfUSA);
		map.put("Canada", citiesOfCanada);
		map.put("UK", citiesOfUK);

		/*for loop*/
		System.out.println("**For Each loop**");
		for(Map.Entry city:map.entrySet()){
			System.out.println(city.getKey()+ " = " +   city.getValue());
			try{
				String sql = "INSERT INTO `core_java`.`tbl_map` (`getkey`,`getvalue`) VALUES('" + city.getKey() + "','" +city.getValue()  + "')";
				connectDB.directDatabaseQueryExecute(sql);

				BasicDBObject doc = new BasicDBObject();
				doc.put("getkey", city.getKey());
				doc.put("getvalue", city.getValue().toString());

				ConnectDB.insertMongoDBDataDocument("tbl_map", doc);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/* Using While Loop*/
		System.out.println("\n\n**While Loop with Iterator**");
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}


		try {

			System.out.println("\n\nData is reading from the Table (tbl_map) and displaying to the console\n");
			rs = connectDB.Query("select * from tbl_map");
			while (rs.next()) {
				System.out.println(rs.getString("getkey") + " = " + rs.getString("getvalue"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {

			System.out.println("\n\nData is reading from the MongoDB Collection (tbl_map) and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("tbl_map");
			while (cursor.hasNext()) {
				DBObject obj = cursor.next();
				System.out.println((String) obj.get("getkey")+ " = " + (String) obj.get("getvalue"));
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

}
