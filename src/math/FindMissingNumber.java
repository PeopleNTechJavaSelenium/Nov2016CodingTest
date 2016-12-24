package math;

/**
 * Created by mrahman on 12/10/16.
 */
public class FindMissingNumber {
    static int sumNum(int n)
    {
        int sum = (n * (n+1))/ 2;

        return sum;
    }
    static int sumElements(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = 10;
        int sumNum = sumNum(n);
        int sumElements = sumElements(array);
        int missingNumber = sumNum - sumElements;

        System.out.println("Missing Number is = " + missingNumber);


    }

    }
