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

        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Tuna");
        list.add("Tofu");
        list.add("Shrimp");
        list.add("Coffee");


        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for(String item:list){
         System.out.println(item);
        }


        ConnectDB connectDB = new ConnectDB();

        List<String> arrayList = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryListStringToMySql(list,"ArrayList","ArrayList");
            arrayList = connectDB.readDataBase("ArrayList", "Arraylist");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nData is reading from the Table (ArrayList Table) and displaying to the console:\n");
        for (String st:arrayList) {
            System.out.println(st);
        }
        }


    }




