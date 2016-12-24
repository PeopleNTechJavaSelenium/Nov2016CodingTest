package reader;

import databases.ConnectDB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		FileReader fr = null;
		BufferedReader br = null;

		String path = System.getProperty("user.dir") + "//src//data//self-driving-car";




		try{
			fr = new FileReader(path);
		}catch(FileNotFoundException exp){
			exp.printStackTrace();
		}

		try{
			br = new BufferedReader(fr);
			String text = "";
			while((text = br.readLine()) !=null)

				System.out.print(text);

		}catch(IOException ex){
			ex.printStackTrace();
		}

		finally {
			try{
				if(br !=null)
					br = null;
				if(fr !=null)
					fr=null;
			}catch(Exception e){
				e.printStackTrace();
			}

		}

		//for database connection
		Scanner s = null;
		try {
			s = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<String> list= new ArrayList<String>();
		while (s.hasNext()){
			list.add(s.next());
		}
		s.close();



		ConnectDB connectDB = new ConnectDB();


		List<String> displayText = new ArrayList<String>();
		try {
			//connectDB.InsertDataFromArryListStringToMySql(list, "tbl_reader", "column_reader");
			displayText = connectDB.readDataBase("tbl_reader", "column_reader");

		} catch (Exception e) {
			e.printStackTrace();
		}

		for(String st:displayText){
			System.out.print(st);  //if no ln in println all the text will print in horizontally

			//System.out.println(st);
		}

	}

}
