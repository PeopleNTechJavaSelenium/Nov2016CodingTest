package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {
    public Anagram() {
    }
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println("Type in your first word :");
        Scanner s = new Scanner(System.in);
        String firstWord = s.nextLine();
        System.out.println("Type in your second word :");
        String secondWord = s.nextLine();
        isAnagram(firstWord, secondWord);

        if(isAnagram(firstWord, secondWord)) {
            System.out.println("The two words are anagram");
        }
        else{
            System.out.println("The two words are NOT anagram");
        }
    }

    public static boolean isAnagram(String firstWord, String secondWord){
        char[] wd1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] wd2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(wd1);
        Arrays.sort(wd2);
        return Arrays.equals(wd1, wd2);
    }
}