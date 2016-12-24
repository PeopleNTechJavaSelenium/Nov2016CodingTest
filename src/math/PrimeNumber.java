package math;

import databases.ConnectDB;

import java.time.Duration;
import java.time.Instant;
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
		long startTime = System.currentTimeMillis();
		int countPrime=0;
		int j=0;
		int[] arr=new int[78499];
		for (int i=2;i<1000000;i++) {
			if (isPrimeNumber(i)) {
				//System.out.println(i);
				arr[j] = i;
				j++;
				countPrime++;
			}
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Total time :"+elapsedTime);

		System.out.println("The total number of primary numbers: "+countPrime);
		ConnectDB connectDB = new ConnectDB();
		List<String> primeValue = new ArrayList<>();     //database: core_java
		try {                                             //Table: prime
			connectDB.InsertDataFromArryToMySql(arr, "prime", "shownumber"); //Column:shownumber
			primeValue=connectDB.readDataBase("prime", "shownumber");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nData is reading from the Table (Prime) and displaying to the console");
		for(String st:primeValue){
			System.out.print(st);
			System.out.print("  ");
		}
	}

	public static boolean isPrimeNumber(int number){
		for(int i=2;i<number/2;i++){
			if(number%i==0){
			return false;
			}
		}
		return true;
	}
}

