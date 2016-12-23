package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        String ourword = "abc";
        String[] ourArray = ourword.split("");
        permute(ourArray, ourArray.length);

    }

    private static void swap(String[] ourarray, int right, int left) {
        String temp = ourarray[right];
        ourarray[right] = ourarray[left];
        ourarray[left] = temp;
    }

    public static void permute(String[] ourArray, int currentPosition) {
        if (currentPosition == 1) {
            System.out.println(Arrays.toString(ourArray));
        } else {
            for (int i = 0; i < currentPosition; i++) {
                // subtract one from the last position (here is where you are
                // selecting the the next last item
                permute(ourArray, currentPosition - 1);

                // if it's odd position
                if (currentPosition % 2 == 1) {
                    swap(ourArray, 0, currentPosition - 1);
                } else {
                    swap(ourArray, i, currentPosition - 1);
                }
            }
        }
    }
}
