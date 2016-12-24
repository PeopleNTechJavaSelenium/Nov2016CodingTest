package problems;
import java.util.*;

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
        String s = "12345";
        String[] arr = s.split("");
        permuteIT(arr, arr.length);

    }

    public static void swapDem(String[] arr, int right, int left) {
        String hold = arr[right];
        arr[right] = arr[left];
        arr[left] = hold;
    }

    public static void permuteIT(String[] arr, int currentPosition) {
        if (currentPosition == 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 0; i < currentPosition; i++) {

                permuteIT(arr, currentPosition - 1);

                if (currentPosition % 2 == 1) {
                    swapDem(arr, 0, currentPosition - 1);
                } else {
                    swapDem(arr, i, currentPosition - 1);
                }
            }


        }
    }
}