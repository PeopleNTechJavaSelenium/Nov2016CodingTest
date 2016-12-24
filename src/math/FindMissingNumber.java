package math;

/**
 * Created by mrahman on 12/10/16.
 */
public class FindMissingNumber {

    public static int findMissingNumber(int [] array){
        int sum=0;
        int n;
        int missingN;
        for(int i=0;i<array.length;i++){
            sum= sum + array[i];//finding the sum of all numbers currently in the area.
        }
        n=10;
        missingN= n*(n+1)/2 - sum;// n*(n+1)/2 gives us the sum of all the numbers from 1-n.
        return missingN;


    }





    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int missingNumber= FindMissingNumber.findMissingNumber(array);
         System.out.println("The missing number is: "+missingNumber);




    }
}
