package math;

import java.util.Scanner;

public class PrimeNumber {
public PrimeNumber(){
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
			String primeNumbers = "";
			for(int i = 1; i <= 100000; ++i){
				int counter = 0;

				for(int j = i; j >= 1; --j){
					if(i % j == 0){
						++counter;
					}
				}
				if(counter == 2){
					primeNumbers = primeNumbers + i + " ";
				}
			}
			System.out.println("The prime numbers from 1 to 1000000 are : ");
			System.out.println(primeNumbers);
		}
	}