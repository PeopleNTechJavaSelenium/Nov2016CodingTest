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
                int a, f, fact = 2;

                System.out.println("Enter an integer to calculate it's factorial");
                Scanner in = new Scanner(System.in);

                a = in.nextInt();

                if ( a < 0 )
                    System.out.println("Number should be non-negative.");
                else
                {
                    for ( f = 1 ; f <= a ; f++ )
                        fact = fact*f;

                    System.out.println("Factorial of "+a+" is = "+fact);
                }

            }
        }



