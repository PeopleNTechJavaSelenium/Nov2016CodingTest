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
		int n=100;
		int counter=1;
		List<Integer> pattern =new ArrayList<Integer>();
		pattern.add(n);
		while(n>0){
			if(counter>=1 && counter<=10){
				n=n-1;
				pattern.add(n);
				counter++;

			}
			if(counter>=11 && counter<=20){
				n=n-2;
				pattern.add(n);
				counter++;
			}
			if(counter>=21 && counter<=30){
				n=n-3;
				pattern.add(n);
				counter++;
			}
			if (counter>=31 && counter<=40){
				n=n-4;
				pattern.add(n);
				counter++;
			}

		}

		List<String> readPatternTableFromDB=new ArrayList<>();

		ConnectDB connectToDB=new ConnectDB();
		try {
			//creating table to store data.
			connectToDB.Query("create table tbl_pattern(column_pattern Integer);");

			//Storing Data
			connectToDB.InsertDataFromArryListIntToMySql(pattern,"tbl_pattern","column_pattern" );

			//Retrieving data
			readPatternTableFromDB=connectToDB.readDataBase("tbl_pattern","column_pattern");
		}catch (Exception e) {
			e.printStackTrace();
		}

		//Output the data we just acquired from the DB.
		for(String pt:readPatternTableFromDB){
			System.out.print(pt + " ");
		}



		
		
		

	}
}
