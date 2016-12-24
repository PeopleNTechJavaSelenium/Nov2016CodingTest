package problems;


public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "Salman";
        String b = "Mansal";

        checkanagram(a, b);
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
            System.out.println("Anagram string a : "+a+" string b: "+b);
        } else {
            System.out.println("Not Anagram string a : "+a+" string b: "+b);
        }

    }
}
