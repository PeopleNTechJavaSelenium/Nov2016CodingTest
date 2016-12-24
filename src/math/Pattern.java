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
		List<Integer> list= new ArrayList<>();

		for(int i=100;i>=0;i--){
			if(100>=i&&i>=90){
				i=i;
				list.add(i);
				//System.out.print(i+",");
			}
			else if(90>i&&i>=70){
				i=i-1;
				list.add(i);
				//System.out.print(i+",");
			}
			else if(70>i&&i>=50){
				i=i-2;
				list.add(i);
				//System.out.print(i+",");
			}
			else if(50>i&&i>=40){
				i=i-2;
				list.add(i);
				//System.out.print(i+",");
			}
			else if(40>i&&i>=20){
				i=i-3;
				list.add(i);
				//System.out.print(i+",");
			}
			else if(20>i&&i>=0){
				i=i-3;
				list.add(i);
				//System.out.print(i+",");
			}

		}


		ConnectDB connectDB = new ConnectDB();

		List<String> patternList = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryListIntToMySql(list,"Pattern","PatternColumn");
			patternList = connectDB.readDataBase("Pattern", "PatternColumn");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (Pattern Table) and displaying to the console");
		for(String st:patternList){
			System.out.print(st+" ");
		}



	}
}
