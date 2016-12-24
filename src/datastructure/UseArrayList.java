package datastructure;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.*;
import java.sql.*;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		/*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
		ArrayList<String> listArray = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
		listArray.add("Kamran");
		listArray.add("Salman");
		listArray.add("Farhan");
		listArray.add("Kenan");
		listArray.add("Adnan");

		System.out.println("For Content: " + listArray);

	  /*Remove elements from array list like this*/
		listArray.remove(1);
		listArray.remove("Kenan");


		// forEach loop as of Java 1.8
		System.out.println("Display using for each loop");
			for (String content:listArray) {
				System.out.println( content);
			}

		// while loop with iterator
		System.out.println("Display using While loop with iterator");
		Iterator<String> iterator = listArray.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sorting
		Collections.sort(listArray);
		System.out.println(listArray);

// Saving to database using string buffer


		String listString = "";

		for (String s : listArray)
		{
			listString += s + "\t";
		}

		try {
            Connection connection;
            ResultSet rs;
            rs = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");
            Statement stmt = connection.createStatement();
			String sql = "INSERT INTO `testDB`.`arraylist` (sorted) VALUES('" + listString  + "')";

            stmt.execute(sql);

			System.out.println("\n\nData is reading from the Table (arraylist) and displaying to the console\n");
			String query = "select * from arraylist;";
            rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("\n\n**After sortedelements the ArrayList**\n");
				System.out.println(rs.getString("sorted"));
			}
		} catch (SQLException e) {
            e.printStackTrace();
            for(Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            System.out.println("Error in fetching data");
        }
		}


	}


