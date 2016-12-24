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
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6, 9, 11, 12, 13, 15, 16, 17, 18, 19, 14};

        int [] myArray = new int[array.length+1];

        for(int i=0; i<array.length;i++){
            myArray[array[i]-1] = 1;
        }
        //for(int num : array)
        //    System.out.println(num);
        int c =0;
        while(myArray[c]!=0)
            c++;
        c++;
        System.out.println("The missing number is "+c);

    }
}
