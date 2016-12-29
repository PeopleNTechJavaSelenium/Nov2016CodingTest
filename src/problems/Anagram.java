package problems;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner stdin = new Scanner(System.in);
        String ana1, ana2;
        System.out.print("Enter first word: ");
        ana1 = stdin.next();
        System.out.print("Enter second word: ");
        ana2 = stdin.next();

        checkanagram(ana1, ana2);


    }

    public static void checkanagram(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        char temp = ' ';
        boolean anagram = false;
        int i;
        for (i = 0; i < a1.length(); i++) {
            anagram = false;
            temp = a1.charAt(i);

            for (int j = 0; j < b1.length(); j++) {
                if (temp == b1.charAt(j)) {
                    anagram = true;
                    break;
                }
            }
            if (!anagram) {
                break;
            }
        }
        if (i == a1.length()) {
            System.out.println(a+" IS an anagram of "+b);
        } else {
            System.out.println(a+" IS NOT an anagram of "+b);
        }

    }
}