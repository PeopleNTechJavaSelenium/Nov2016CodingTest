package problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Permutation{
    public Permutation(){
    }
    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */

        System.out.println("Enter any word for permutation: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String str = "ABC";
        System.out.println("\nPermutations for " + str + " are: \n" + permutationFinder(str));
        System.out.println("\nPermutations for " + input + " are: \n" + permutationFinder(input));
    }

    public static HashSet permutationFinder(String str) {
        HashSet perm = new HashSet();
        if(str == null) {
            return null;
        } else if(str.length() == 0){
            perm.add("");
            return perm;
        }
        else{
            char initial = str.charAt(0);
            String str2 = str.substring(1);
            Set words = permutationFinder(str2);
            Iterator it = words.iterator();

            while(it.hasNext()){
                String strNew = (String)it.next();

                for(int i = 0; i <= strNew.length(); ++i){
                    perm.add(charInsert(strNew, initial, i));
                }
            }
            return perm;
        }
    }
    public static String charInsert(String str, char k, int j){
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + k + end;
    }
}