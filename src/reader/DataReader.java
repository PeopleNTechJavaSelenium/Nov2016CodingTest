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
		 ***https://github.com/PeopleNTechJavaSelenium/NovCoreJavaClassProject2016/blob/master/src/reader/UserBufferdReader.java
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;
		String path1 = "/Users/ahmadkarim/Desktop/projects/Nov2016CodingTest-master/src/data/self-driving-car";
		String path2 = "\\Users\\ahmadkarim\\Desktop\\projects\\Nov2016CodingTest-master\\src\\data\\self-driving-car";
		///Users/ahmadkarim/Desktop/projects/Nov2016CodingTest-master/src/data

		try {
			fr = new FileReader(path1);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
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
		finally{

			try{

				if(br != null){
					br = null;
				}if(fr != null){
					fr = null;
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

	}

}
