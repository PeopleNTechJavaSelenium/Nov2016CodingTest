package math;

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
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int sum = 0;
        int idx = -1;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0)
            {
                idx = i;
            }
            else
            {
                sum += array[i];
            }
        }

// the total sum of numbers between 1 and arr.length.
        int total = (array.length + 1) * array.length / 2;

        System.out.println("missing number is: " + (total - sum) + " at index " + idx);

    }
}
