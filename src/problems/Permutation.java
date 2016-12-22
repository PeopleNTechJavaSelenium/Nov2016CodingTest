package problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

    //public static void main(String[] args)

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        //permutation("123");

    public static void main(String[] args) {
        System.out.println("Enter any string for permutation: ");
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        // Scanner s=new Scanner(System.in);
        // String firstWord=s.nextLine();
        String s1 = "ABC";

        String s2 = input;
        // String s3 = "MORE";

        System.out.println("\nPermutations for " + s1 + " are: \n" +
                permutationFinder(s1));


        System.out.println("\nPermutations for " + s2 + " are: \n" +
                permutationFinder(s2));





    }


        public static Set<String> permutationFinder (String str){
            Set<String> perm = new HashSet<String>();
            //Handling error scenarios
            if (str == null) {
                return null;
            } else if (str.length() == 0) {
                perm.add("");
                return perm;

            }
            char initial = str.charAt(0); //first character
            String rem = str.substring(1); // full string without first character
            Set<String> words = permutationFinder(rem);
            for (String strNew : words) {
                for (int i = 0; i <= strNew.length(); i++) {
                    perm.add(charInsert(strNew, initial, i));
                }
            }
            return perm;
        }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }


}
