package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
        ConnectDB connectDB = new ConnectDB();
        List<Integer> list = new ArrayList<Integer>();
        List<String> pat = new ArrayList<String>();
        int a = 100;
        while (a > 0) {
            if (a > 90) {
                a--;
                //System.out.print(a + ",");
                list.add(a);
            } else if (a > 70) {
                a -= 2;
                list.add(a);
               // System.out.print(a + ",");
            } else if (a > 40) {
                a -= 3;
                list.add(a);
                //System.out.print(a + ",");
            } else if (a > 0) {
                a -= 4;
               // System.out.print(a + ",");
                list.add(a);
            }

        }
        try {
            connectDB.InsertDataFromArryListToMySql(list, "PATTERN", "Pattern");
            pat = connectDB.readDataBase("PATTERN", "Pattern");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (PATTERN) and displaying to the console");
        for (String st : pat) {
            System.out.println(st);
        }
    }
}
