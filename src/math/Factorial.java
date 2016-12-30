package math;

/**
 * Created by mrahman on 12/16/16.
 */
public class Factorial {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //Recursion

            public static void main(String[] args) {
                int n = 5;
                int result = factorial(n);
                System.out.println("The factorial of 5 is " + result);
            }

            public static int factorial(int n) {
                if (n == 0) {
                    return 1;
                } else {
                    return n * factorial(n - 1);
                }
            }
        }





