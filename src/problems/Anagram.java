package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        System.out.println("Enter the first word :");

        Scanner s=new Scanner(System.in);
        String firstWord=s.nextLine();
        System.out.println("Enter the Second word :");

        String secondWord=s.nextLine();


        isAnagram(firstWord,secondWord);
        if (isAnagram(firstWord,secondWord)==true){
            System.out.println("GREAT!!! Given words are anagram.");
        }
        else{
            System.out.println("PLEASE TRY AGAIN...Given words are NOT anagram.");

        }
    }


    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);

    }
}
