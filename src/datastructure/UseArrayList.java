package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> list= new ArrayList<>();
		list.add("Hey");
		list.add(",How are you");
		list.add("I will remove this element");//Will not show in the output because it will be removed at this line.
		list.remove(2);
		/*System.out.println("This is the output using For Each loop:");
		for(String st:list){
			System.out.print(st+" ");
		}*/
		System.out.println("\nThis is the output using Iteration:");
		Iterator it= list.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		List<String> readArrayListDataFromDB= new ArrayList<>();
		ConnectDB connectToDB=new ConnectDB();
		try {
			//creating table tbl_ArrayList in MYSQL.
			connectToDB.Query("create table tbl_ArrayList(column_ArrayList Text);");

			//Storing Data from ArrayList list into the table tbl_ArrayList.
			connectToDB.InsertDataFromArryListStringToMySql(list,"tbl_ArrayList","column_ArrayList" );

			//Retrieving data from DB into the arraylist readArrayListDataFromDB.
			readArrayListDataFromDB=connectToDB.readDataBase("tbl_ArrayList","column_ArrayList");
		}catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nThis is the output of the data retrieved from the database via an ArrayList and is being displayed to the console using for each loop:");
		for(String st:readArrayListDataFromDB){
			System.out.print(st+" ");
		}

	}

}
