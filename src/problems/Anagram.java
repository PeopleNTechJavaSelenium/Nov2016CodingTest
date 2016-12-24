package problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a1 = "Tacos";
        String a2 = "Coast";

        int lettersA1[] = new int[Character.MAX_VALUE];
        int lettersA2[] = new int[Character.MAX_VALUE];

        if (a1.length() != a2.length()) // making sure they are equal in size.
            System.out.print("Not equal in size");
        else {
            for (int i = 0; i < a1.length(); ++i) {

                lettersA1[a1.toLowerCase().charAt(i)]++; // for case sensitive part.
                lettersA2[a2.toLowerCase().charAt(i)]++;
            }
            boolean ang = true;
            for (int i = 0; i < lettersA1.length && ang; ++i) {
                if (lettersA1[i] != lettersA2[i]) {
                    ang = false;
                }
            }
            if (ang) {
                System.out.println(a1+" "+a2+" are anagram");
            } else {
                System.out.print("They are not anagram");
            }
        }
    }
}

