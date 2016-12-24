package algorithm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by aleks_000 on 12/21/2016.
 */
public class Numbers {

	public static Properties loadProperties() throws IOException {
		Properties prop = new Properties();
		InputStream ism = new FileInputStream("src/MySql.properties");
		prop.load(ism);
		ism.close();
		return prop;
	}

	public static void main(String[] args) {

		try {
			if  (args.length != 1) {
				throw new Exception("Please provide data sample id");
			}
			int id = Integer.parseInt(args[0]);

			Properties prop = loadProperties();
			String driverClass = prop.getProperty("MYSQLJDBC.driver");
			String url = prop.getProperty("MYSQLJDBC.url");
			String userName = prop.getProperty("MYSQLJDBC.userName");
			String password = prop.getProperty("MYSQLJDBC.password");
			Class.forName(driverClass);
			Connection connect = DriverManager.getConnection(url, userName, password);

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT data FROM home_work.input WHERE id="+id);

			if  (!rs.next()){ throw new Exception("No records found for id="+id);}

			String res = rs.getString(1);

			List<String> items = Arrays.asList(res.split("\\s*,\\s*"));
			int[] input_data = new int[items.size()];
			int i =0;
			for (String item: items){
				try {
					input_data[i] = Integer.parseInt(item);
					++i;
				}catch(Exception e){}
			}

			Sort sort = new Sort();
			int[] orig = sort.selectionSort(input_data);

			sort.insertionSort(input_data);

			sort.bubbleSort(input_data);


            /*
            sort.printSortedArray(input_data);
            System.out.println("-----------------");
            sort.printSortedArray(orig);
            */

			StringBuilder builder = new StringBuilder();
			String separator = new String();
			for (int ii: input_data) {
				builder.append(separator).append(ii);
				separator=",";
			}
			String output_data = builder.toString();
			//System.out.println(output_data);

			int rowsUpdated = stmt.executeUpdate("DELETE FROM home_work.output WHERE id="+id);
			System.out.println("Deleted "+rowsUpdated+" rows");
			rowsUpdated = stmt.executeUpdate("INSERT INTO home_work.output VALUES(" + id + ",'" + output_data + "')");
			System.out.println("Inserted "+rowsUpdated+" rows:("+ id + "," + output_data + ")");

			stmt.close();
			connect.close();
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}