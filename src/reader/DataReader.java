package reader;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.FileInputStream;
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

		String textFile = System.getProperty("user.dir") + "\\src\\data\\self-driving-car";
		BufferedReader readText=null;
		String  readFile;
		StringBuffer fileData=new StringBuffer();

		ConnectDB test=new ConnectDB();
		try{
			readText=new BufferedReader(new FileReader(textFile));
			while((readFile=readText.readLine())!=null){
				fileData.append(readFile).append("\n");;
				System.out.println(readFile);
			}
		}
			catch(IOException ex){
				ex.printStackTrace();
			}
			finally{
				try {
					if (readText != null)
						readText.close();
				}catch(IOException exx){
					exx.printStackTrace();
				}
		}
		ConnectDB connectDB = new ConnectDB();       //database:core_java
		ConnectDB.connectMongoDB2();                 //Table Name: car_data
        ResultSet rs = null;                         //Column Name: car_text
		try {
     		connectDB.Query("DELETE FROM CAR_DATA;");
			String sql="INSERT INTO `core_java`.`car_data` (`car_text`) VALUES('"+fileData.toString()+"')";

			connectDB.directDatabaseQueryExecute(sql);
			System.out.println("\n\nData is reading from the Table and displaying to the console\n");
			rs =connectDB.Query("select * from car_data;");
			while(rs.next()) {
				String car_data = rs.getString("car_text");
				System.out.println(car_data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	/*Mongodb section start*/
		DBCursor cursor = null;
		try {
			ConnectDB.removeMongoDBDataDocument("car_data");    //Collection name:car_data
			BasicDBObject doc = new BasicDBObject();                          //DB name: core_java
			doc.put("text", fileData.toString());
			ConnectDB.insertMongoDBDataDocument("car_data",doc);

			System.out.println("\n\nData is reading from the MongoDB collection and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("car_data");
			while(cursor.hasNext()) {
				DBObject obj = cursor.next();
				String cartext = (String)obj.get("text");
				System.out.println(cartext);
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
