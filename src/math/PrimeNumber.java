package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


		int i =0;
		int num =0;
		String  primeNumbers = "";
		for (i = 1; i <= 100000; i++)
		{
			int counter=0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 1000000 are :");
		System.out.println(primeNumbers);

		ConnectDB connectDB = new ConnectDB();
		List<String> arrayList = new ArrayList<String>();
		try {
			connectDB.InsertDataFromStringToMySql(primeNumbers,"primeNumber","primeNumber");
			arrayList = connectDB.readDataBase("primeNumber", "primeNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nData is reading from the Table (primeNumber Table) and displaying to the console:\n");
		for (String st:arrayList) {
			System.out.println(st);
		}




	}

}
