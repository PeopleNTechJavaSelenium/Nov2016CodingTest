package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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


		FileReader fr = null;
		BufferedReader br = null;


		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("please fix the path");
		}
		br = new BufferedReader(fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){
				System.out.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Part:2 of the example
		finally {   //Talks about keyword Finally in Selenium4 video around 3:20 minutes

			try{
				if(br != null){
					br = null;
				}if (fr != null){
					fr = null;
				}
			}catch(Exception ex){
				ex.printStackTrace();

			}
		}
	
	}

}
