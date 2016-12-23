package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String s1 = "CAT";
        String s2 = "ACT";
        int lettersS1[] = new int[Character.MAX_VALUE];
        int lettersS2[] = new int[Character.MAX_VALUE];
        if (s1.length() != s2.length())
            System.out.print("The 2 strings are not equal hence, they are not Anagram");
        else {
            for (int i = 0; i < s1.length(); ++i) {
                lettersS1[s1.toLowerCase().charAt(i)]++;
                lettersS2[s2.toLowerCase().charAt(i)]++;
            }
            boolean anag = true;
            for (int i = 0; i < lettersS1.length && anag; i++) {
                if (lettersS1[i] != lettersS2[i]) {
                    anag = false;
                }
            }
            if (anag) {
                System.out.print("The 2 strings are Anagram");
            } else {
                System.out.print("The 2 strings are not Anagram");
            }
        }
    }
}
