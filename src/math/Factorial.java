package math;
import java.util.Scanner;
/**
 * Created by mrahman on 12/16/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}


