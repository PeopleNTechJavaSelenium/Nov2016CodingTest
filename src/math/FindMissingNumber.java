package math;

import java.util.Arrays;

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
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        Arrays.sort(array);

        findMissingNum(array);

    }

    private static void findMissingNum(int[] number){
        // take max length as last number in array
        int k[] = new int[number[number.length-1]];
        int m=0;
        if(number[0]!=1){
            for (int x = 1; x < number[0]; x++) {
                k[m] =  x;
                m++;
            }
        }
        for (int i = 0; i < number.length -1; i++) {
            int j = i+1;
            int difference = number[j] - number[i] ;
            if(difference != 1 ){
                for (int x = 1; x < difference; x++) {
                    k[m] = number[i] + x;
                    m++;
                }
            }
        }
        System.out.println("Missing numbers in array :");
        for (int l = 0; l < m ; l++) {
            System.out.println( k[l]+" ");
        }
    }
}
