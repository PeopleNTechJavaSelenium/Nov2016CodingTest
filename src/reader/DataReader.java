//String path1 = "/Users/ahmadkarim/Desktop/projects/Nov2016CodingTest-master/src/data/self-driving-car";
	//	String path2 = "\\Users\\ahmadkarim\\Desktop\\projects\\Nov2016CodingTest-master\\src\\data\\self-driving-car";

package reader;

import databases.ConnectDB;

import java.io.BufferedReader;
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

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		ConnectDB connectDB = new ConnectDB();

		BufferedReader bufferedReader = null;
		String data;
		StringBuilder fileData = new StringBuilder();

		try{
			bufferedReader = new BufferedReader(new FileReader(textFile));
			while ((data = bufferedReader.readLine()) != null){
				System.out.println(data);
				fileData.append(data).append("\n");
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}catch(IOException ie){
				ie.printStackTrace();
			}
		}

		connectDB.InsertDataFromStringToMySql(fileData.toString(),"DataReader","String");

		System.out.println("Text file exported to table: DataReader\n\nReading from DB:");
		try {
			System.out.println(connectDB.readDataBase("DataReader","String"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}