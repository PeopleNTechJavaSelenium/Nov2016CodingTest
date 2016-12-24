package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static boolean isItPrime(int n) {

		if (n <= 1) {
			return false;
		}
		if (n <= 2) {
			return true;
		}// checking to make sure that we start from 2
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

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

		List<Integer> primeNumbers = new ArrayList<>();
		for (int n = 2; n <= 1000000; n++) {
			if (isItPrime(n)) {
				primeNumbers.add(n);
			}
		}
		for(Integer int1:primeNumbers){
			System.out.println(int1);
		}
		ConnectDB connectDB1 = new ConnectDB();

		List<String> primeNumbers1 = new ArrayList<String>();
		try {

			//create tbl_primeNumbers in the database
			connectDB1.Query("create table tbl_primenumbers(column_primeNumbers Integer);");
			//takes 53 minutes to store all 78498 rows to the database.
			connectDB1.InsertDataFromArryListIntToMySql(primeNumbers, "tbl_primenumbers", "column_primeNumbers");
			//retrieving From database(below)
			primeNumbers1 = connectDB1.readDataBase("tbl_primenumbers", "column_primeNumbers");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data shown below is from the Table (tbl_primenumbers)");
		for (String pm : primeNumbers1) {
			System.out.println(pm);
		}


	}
}

