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

        int n, c, fact = 1;

        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0)
            System.out.println("Number should be postive.");
        else {
            for (c = 1; c <= n; c++)
                fact = fact * c;

            System.out.println("Factorial of " + n + " is = " + fact);


        }

    }
}