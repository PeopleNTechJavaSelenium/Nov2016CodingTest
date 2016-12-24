package math;

import databases.ConnectDB;

import java.util.ArrayList;

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

		ArrayList arrayList = new ArrayList();
		int n=1000000;
//		for (int i = 2; i < n; i++) {
//			if (checkPrime1(i)) {
//				System.out.print(i + ",");
//			}
//		}
		System.out.println("");
		for (int i = 0; i < n; i++) {
			if (checkPrime(i)) {
				System.out.print(i + ",");
				arrayList.add(i);
			}
		}

		connectDB.InsertDataFromArryListToMySql(arrayList, "MathPrimeNum", "List");
	}
	public static boolean checkPrime(int n){

		boolean[] isPrime = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		//using Sieve of Eratosthenes
		for (int factor = 2; factor*factor <= n; factor++) {
			// if factor is prime, then mark multiples of factor as nonprime
			// suffices to consider mutiples factor, factor+1, ...,  n/factor
			if (isPrime[factor]) {
				for (int j = factor; factor*j <= n; j++) {
					isPrime[factor*j] = false;
				}
			}
		}

		return isPrime[n];
	}


	static boolean checkPrime1(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
