package reader;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;


public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		BufferedReader read = null;
		String data = "";
		StringBuffer filedata = new StringBuffer();
		try {
			read = new BufferedReader(new FileReader(textFile));

			while ((data = read.readLine()) != null) {
				//System.out.println(data);
				filedata.append(data).append("\n");;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (read != null)
					read.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();
		ResultSet rs = null;
		try {
			connectDB.directDatabaseQueryExecute("delete from tbl_datareader");
			String sql="INSERT INTO `core_java`.`tbl_datareader` (`cardata`) VALUES('"+filedata.toString()+"')";

			connectDB.directDatabaseQueryExecute(sql);
			System.out.println("\n\nData is reading from the Table (tbl_datareader) and displaying to the console\n");
			rs =connectDB.Query("select cardata from tbl_datareader");
			while(rs.next()) {
				String cardata = rs.getString("cardata");
				System.out.println(cardata);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section start*/
		DBCursor  cursor = null;
		try {
			ConnectDB.removeMongoDBDataDocument("tbl_datareader");
			BasicDBObject doc = new BasicDBObject();
			doc.put("cardata", filedata.toString());
			ConnectDB.insertMongoDBDataDocument("tbl_datareader",doc);

			System.out.println("\n\nData is reading from the MongoDB collection (tbl_datareader) and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("tbl_datareader");
			while(cursor.hasNext()) {
				DBObject obj = cursor.next();
				String cardata = (String)obj.get("cardata");
				System.out.println(cardata);
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
