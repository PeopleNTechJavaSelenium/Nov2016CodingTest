package math;

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


        System.out.println("Factorial of 5 using Recursion: "+ fact(5));

        int givenNumber = 5;
        for (int i = 1; i<5 ; i++) {
            givenNumber = givenNumber *i;
        }
        System.out.println("Factorial of 5 using Iteration: "+ givenNumber);
    }
    public static long fact(long x) {
        if (x<=1)
            return 1;
        else
            return x *(fact(x-1)) ;

    }
}
