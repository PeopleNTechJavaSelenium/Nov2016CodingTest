package reader;

import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		ConnectDB connectDB = new ConnectDB();
		String textFile = System.getProperty("/Users/DAGR8DON/Desktop/DEC11/Nov2016CodingTest/src/data/self-driving-car");


		BufferedReader in = new BufferedReader(new FileReader("/Users/DAGR8DON/Desktop/DEC11/Nov2016CodingTest/src/data/self-driving-car"));
		String str;

		List<String> data = new ArrayList<String>();
		try {
			while((str = in.readLine()) != null){
                data.add(str);
            }
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] a = data.toArray(new String[0]);
		try {
			connectDB.InsertDataFromStringToMySql(a[0] , "TEXT", "text");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
