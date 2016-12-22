package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


		for(int i=100;i>=0;i--){
			if(100>=i&&i>=90){i=i;System.out.print(i+",");}
			else if(90>i&&i>=70){i=i-1;System.out.print(i+",");}
			else if(70>i&&i>=50){i=i-2;System.out.print(i+",");}
			else if(50>i&&i>=40){i=i-2;System.out.print(i+",");}
			else if(40>i&&i>=20){i=i-3;System.out.print(i+",");}
			else if(20>i&&i>=0){i=i-3;System.out.print(i+",");}

			//System.out.print(i+",");
			/*
			ConnectDB connectDB = new ConnectDB();

		List<String> lowestValue = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
			 */
		}
		
		

	}
}
