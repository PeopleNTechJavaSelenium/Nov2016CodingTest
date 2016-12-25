package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {
    public static boolean useAnagram (String str1, String str2) {
    char[] word1 = str1.toLowerCase().toCharArray();
    char[] word2 = str2.toLowerCase().toCharArray();

    Arrays.sort(word1);
    Arrays.sort(word2);

    return Arrays.equals(word1, word2);
}

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            System.out.println(useAnagram("cat", "act"));


    }
}
