package reader;

import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

	public static void main(String[] args)throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
        List<String> list = new ArrayList<>();

        BufferedReader br = null;
        try{
            String text;
            br = new BufferedReader(new FileReader(textFile));
            while((text = br.readLine())!= null){
                System.out.println(text);
                list.add(text);
            }

        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        ConnectDB connectDB = new ConnectDB();

        List<String> dataReader = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryListStringToMySql(list,"DataReader","DataReader");
            dataReader = connectDB.readDataBase("DataReader", "DataReader");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nData is reading from the Table (DataReader Table) and displaying to the console:\n");
        for (String st:dataReader) {
            System.out.println(st);
        }
    }
}
