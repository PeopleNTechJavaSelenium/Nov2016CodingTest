package math;

import java.util.ArrayList;
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
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


        Arrays.sort(array);
        //System.out.println(array.length);
        int a=array[0];
        int n=array[array.length];
        int z=array[n+1];
        int m;///missing one
        for(int i=0; i<=n;i++ ){


            if (array[i]!=i+1){
                m=i+1;
                System.out.println("This is the missing number"+m);

            }

        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int a1[] = { 10, 2, 1, 4, 5, 3, 7, 8, 6,16 };
        Arrays.sort(a1);
        int j = a1[0];
        for (int i=0;i<a1.length;i++)
        {
            if (j==a1[i])
            {
                j++;
                continue;
            }
            else
            {
                arr.add(j);
                i--;
                j++;
            }
        }
        System.out.println("missing numbers are ");
        for(int r : arr)
        {
            System.out.println(" " + r);
        }


    }
}








