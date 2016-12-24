package math;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created by mrahman on 12/10/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = 10;
        int arrayTotal = 0;

        for (int i = 0; i < array.length; i++) {
            n += i + 1;
            arrayTotal += array[i];
        }
        int missingNumber = n - arrayTotal;
        System.out.println("Missing number is: "+missingNumber);
    }
}