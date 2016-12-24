package reader;

import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		//reading data from file.
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			System.out.println("please fix the path");
		}
		br = new BufferedReader(fr);
		List<String> list = new ArrayList<>();//list to save file content
		String text = "";
		try {
			while ((text = br.readLine()) != null) {
				list.add(text);//adding file content to the list
				//System.out.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {

				if (br != null) {
					br = null;
				}
				if (fr != null) {
					fr = null;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			ConnectDB connectDB2 = new ConnectDB();
			List<String> readFileDataFromDataBase = new ArrayList<>();

			try {

				//create a table called tbl_DataReader in the database

				connectDB2.Query("create table tbl_DataReader(column_DataReader Text);");

				//Storing data from list inside the table DataReader
				connectDB2.InsertDataFromArryListStringToMySql(list, "tbl_DataReader", "column_DataReader");

				//retrieving data from the table tbl_DataReader from the database and storing it into the ArrayList called readFileFromDataBase
				readFileDataFromDataBase = connectDB2.readDataBase("tbl_DataReader", "column_DataReader");

			} catch (Exception e) {
				e.printStackTrace();
			}


		System.out.println("\nThe Data shown below is being read from tbl_DataReader:\n");
		for (String st : readFileDataFromDataBase) {
			System.out.println(st);
		}

	}

	}

	
	}


