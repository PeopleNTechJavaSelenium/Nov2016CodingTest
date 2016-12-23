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

		ConnectDB connectDB = new ConnectDB();
		long startTime = System.currentTimeMillis();
		List<String> prime = new ArrayList<String>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2; i<=100; i++){
			if(isPrimeByCheckingEachValue(i)){
				//System.out.println(i);
				list.add(i);


			}
		}

		try {
			connectDB.InsertDataFromArryListToMySql(list, "PRIME", "PrimeNumber");
			prime = connectDB.readDataBase("PRIME", "PrimeNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:prime){
			System.out.println(st);
		}
	}
	public static boolean isPrimeByCheckingEachValue(int n){
		for (int i=2; i<n; i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static boolean isPrimeByCheckingCube(int n){
		if(n%2==0) return false;
		for (int i=3; i*i<=n; i+=2){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
