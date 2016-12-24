package problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    static void isAnagram(String s1, String s2) {

        // remove whitespaces from s1 & s2
            String copyOfs1 = s1.replaceAll("\\s", "");
            String copyOfs2 = s2.replaceAll("\\s", "");

        // initialize setting status as true
            boolean status = true;

            if (copyOfs1.length() != copyOfs2.length() {
                // set status as false of copyOfs1 and copyOfs2
                // dont have same length
                    status = false;

        }
                else {

                // change the case of character of copyOfs1 and
                // copyOfs2 and converting them to char array
                    char[] s1Array = copyOfs1.toLowerCase().toCharArray();
                    char[] s2Array = copyOfs2.toLowerCase().toCharArray();

                // sort s1Array and s2Array
                    Arrays.sort(s1Array);
                    Arrays.sort(s2Array);

                // check s1Array and s2Array are equal
                    status = Arrays.equals(s1Array, s2Array);


    }
        // Output
        if (status) {

                System.out.println(s1+" and "+s2+" are not anagrams");
                    }
        else {
            System.out.println(s1+" and "+s2+" are not anagrams");

        }




    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");








    }
}
}