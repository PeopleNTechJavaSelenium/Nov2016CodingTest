package math;

import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.*;


import java.util.ArrayList;
import java.util.List;

public class LowestNumber {
	public static Connection connection;
	public static ResultSet data;


	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{1, 211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
		int res = lowFind(array);
		System.out.println("Lowest number from array is" + res);


		String lowestValue = new String();
		try {
			InsertDataFromArryToMySql(array, "lowestNumber", "lnumber");
			readDataBase("lowestNumber","lnumber");

		} catch (Exception e) {
			e.printStackTrace();
		}



	}

	public static int lowFind(int[] Arr) {
		int small = Arr[0];
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] < small) {
				small = Arr[i];
			}
		}
		return small;
	}


	public static void InsertDataFromArryToMySql(int[] ArrayData, String tableName, String columnName)
	//InsertDataFromArryListToMySql

	//  public void InsertDataFromArryToMySql()
	{

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			String sql = new String();
			PreparedStatement ps = null;

			//  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

			for (int n = 0; n < ArrayData.length; n++) {

				ps = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
				ps.setInt(1, ArrayData[n]);
				ps.executeUpdate();
				//System.out.println(list[n]);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void readDataBase(String tableName, String columnName) throws Exception {
		//List<String> data = new ArrayList<String>();

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
			Statement stmt = connection.createStatement();
			ResultSet rs = null;
			rs = stmt.executeQuery("select * from " + tableName);
			while (rs.next()) {
				String data = rs.getString(columnName);
				//System.out.println("Data is reading from the Table (lowest number) and displaying to the console");
				System.out.println(data);

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}




