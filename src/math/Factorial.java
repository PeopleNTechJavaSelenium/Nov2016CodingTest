package math;

import com.sun.org.apache.xpath.internal.SourceTree;

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
        Scanner stdin = new Scanner(System.in);
        int n;
        System.out.print("Please input a number: ");
        n = stdin.nextInt();
        //System.out.println(factofN(n));
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        }
        public static int factofN(int n) {
        if(n==1)
            return 1;
        else
        return n*factofN(n - 1);
    }
}

