package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*DONE
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

        printPrimes(1000000);
    }

    private static void printPrimes(int max) {
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int check) {
        for (int i = 2; i < check/2; i++) {
            if (check % i == 0) {
                return false;
            }
        }
        return true;
    }

}
