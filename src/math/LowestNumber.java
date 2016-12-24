package math;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{1, 211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

	/*
		ConnectDB connectDB = new ConnectDB();

		List<String> lowestValue = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
*/

		int res = lowFind(array);
		//System.out.println(res);

		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();
		ResultSet rs = null;
		try {
			connectDB.directDatabaseQueryExecute("delete from tbl_lowestNumber");
			String sql="INSERT INTO `core_java`.`tbl_lowestNumber` (`lowestNumber`,`array`) ";
			sql = sql + " VALUES("+res+",'"+ Arrays.toString(array)+"')";

			connectDB.directDatabaseQueryExecute(sql);

			System.out.println("\n\nData is reading from the Table (tbl_lowestNumber) and displaying to the console\n");
			rs =connectDB.Query("select * from tbl_lowestNumber");
			while(rs.next()) {
				System.out.println(rs.getString("lowestNumber"));
				System.out.println(rs.getString("array"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {
			ConnectDB.removeMongoDBDataDocument("tbl_lowestNumber");
			BasicDBObject doc = new BasicDBObject();
			doc.put("lowestNumber", res);
			doc.put("array", Arrays.toString(array));

			ConnectDB.insertMongoDBDataDocument("tbl_lowestNumber",doc);

			System.out.println("\n\nData is reading from the MongoDB Collection (tbl_lowestNumber) and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("tbl_lowestNumber");
			while(cursor.hasNext()) {
				DBObject obj = cursor.next();
				System.out.println((int)obj.get("lowestNumber"));
				System.out.println((String)obj.get("array"));
			}
		}catch (MongoException e) {
			e.printStackTrace();
		}finally {
			if(cursor!=null){
				cursor=null;
			}
		}
		/*Mongodb section end*/
	}
	public static int lowFind(int[] Arr){
		int small =Arr[0];
		for(int i=0;i<Arr.length;i++){
			if(Arr[i]<small){
				small = Arr[i];
			}
		}
		return small;
	}
}
