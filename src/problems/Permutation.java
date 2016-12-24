package problems;

import java.util.ArrayList;


/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

    static public void stringPermutation(String st)
    {
        stringPermutation("", st);
    }

    private static void stringPermutation(String permutation, String st)
    {
        if(st.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < st.length(); i++)
            {
                stringPermutation(permutation+st.charAt(i), st.substring(0, i)+st.substring(i+1, st.length()));
            }
        }
    }

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */

        String st="hello";
        stringPermutation(st);

        }

        }



