package math;

import java.util.Iterator;
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
        System.out.println("Enter the number:");
        //Stored the entered value in variable
        int num = scanner.nextInt();
        //Called the user defined function fact
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: "+factorial);
    }
    static int fact(int b)
    {
        if(b <= 1)
            //if the number is 1 then return 1
            return 1;
        else
            //else call the same function with the value - 1
            return b * fact(b-1);

    }
    static int fact1(int N)
    {
        int product = 1;
        for ( int j=1; j<=N; j++ )
            product *= j;
        return product;
    }
}