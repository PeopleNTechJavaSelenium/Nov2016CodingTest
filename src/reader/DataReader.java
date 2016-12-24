package reader;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;


public class DataReader {
	public DataReader() {
	}
	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		FileReader fr = null;
		BufferedReader br = null;
		String path1 = "/Users/yassine/ideaprojects/Nov2016CodingTest/src/data/self-driving-car";
		String path2 = "\\Users\\yassine\\ideaprojects\\Nov2016CodingTest\\src\\data\\self-driving-car";

		try {
			fr = new FileReader(path1);
		} catch (FileNotFoundException var16) {
			System.out.println("please fix the path");
		}

		br = new BufferedReader(fr);
		String text = "";

		try {
			while((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch(IOException Ex) {
			Ex.printStackTrace();
		} finally{
			try{
				if(br != null){
					br = null;
				}
				if(fr != null){
					fr = null;
				}
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}