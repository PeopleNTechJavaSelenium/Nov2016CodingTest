package math;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.sql.ResultSet;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		String sPattern = "";
		int i = 101;
		for(;i>90;){
			i--;
			//System.out.print(i+",");
			sPattern = sPattern + Integer.toString(i)+",";
		}
		for(;i>70;){
			i = i-2;
			//System.out.print(i+",");
			sPattern = sPattern + Integer.toString(i)+",";
		}
		for(;i>40;){
			i=i-3;
			//System.out.print(i+",");
			sPattern = sPattern + Integer.toString(i)+",";
		}
		for(;i>10;){
			i=i-4;
			//System.out.print(i+",");
			sPattern = sPattern + Integer.toString(i)+",";
		}

		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();
		ResultSet rs = null;
		try {
			connectDB.directDatabaseQueryExecute("delete from tbl_pattern");
			String sql="INSERT INTO `core_java`.`tbl_pattern` (`patterndata`) VALUES('"+sPattern+"')";

			connectDB.directDatabaseQueryExecute(sql);

			System.out.println("\n\nData is reading from the Table (tbl_pattern) and displaying to the console\n");
			rs =connectDB.Query("select patterndata from tbl_pattern");
			while(rs.next()) {
				String patterndata = rs.getString("patterndata");
				System.out.println(patterndata);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {
			ConnectDB.removeMongoDBDataDocument("tbl_pattern");
			BasicDBObject doc = new BasicDBObject();
			doc.put("patterndata", sPattern);
			ConnectDB.insertMongoDBDataDocument("tbl_pattern",doc);

			System.out.println("\n\nData is reading from the MongoDB Collection (tbl_pattern) and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("tbl_pattern");
			while(cursor.hasNext()) {
				DBObject obj = cursor.next();
				String patterndata = (String)obj.get("patterndata");
				System.out.println(patterndata);
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
}
