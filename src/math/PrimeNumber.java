package math;

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

		for(int i=2; i<=1000000; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}

	}
	public static boolean isPrime(int n){
		for (int i=2; i<n; i++){
			if(n%i==0)
				return false;
		}
		return true;
	}

}
