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
		int max=1000000;
		for(int number = 2; number<=max; number++){
			if(isPrime(number)){
				System.out.println(number);
			}
		}

	}


	public static boolean isPrime(int number){
		for(int i=2; i<number; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;

	}
}