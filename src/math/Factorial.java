package math;

import java.util.Scanner;

/**
 * Created by mrahman on 12/16/16.
 */

public class Factorial{

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a Number for Factorial: ");
        int num = stdin.nextInt();

        System.out.println("Factorial of "+num+" using Recursion: "+ factorialR(num));
        System.out.println("Factorial of "+num+" using Iteration: "+factorialI(num));


    }
    public static int factorialR(int num){
        if(num == 0){
            return 1;
        }
        return num * factorialR(num -1);
    }

    public static int factorialI(int num){
        int result = 1;
        while(num != 0){
            result = result*num;
            num--;
        }

        return result;
    }


}
