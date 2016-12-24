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
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.

        System.out.println("factorial of" + n + "using recursion in Java is: " + factorial(n));
        System.out.println("factorial of" + n + "using iteration in Java is: " + fact(n));
    }

    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1);
    }
    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }

        return result;
    }
}
