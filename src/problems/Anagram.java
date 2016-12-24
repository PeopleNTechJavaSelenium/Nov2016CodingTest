package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    static void checkIfAnagram(String word1, String word2){
        int word1Length=word1.length();
        int word2Length=word2.length();
        Boolean isAnagram=true;

        String word1WithoutWSpaces=word1.replaceAll("\\s","");
        String word2WithoutWSpaces=word2.replaceAll("\\s","");

        if(word1WithoutWSpaces.length() != word2WithoutWSpaces.length()){
            isAnagram=false;//Automatically means that the length is not equal hence the two words can't be the same
        }

        else{

            char[] word1Array= word1WithoutWSpaces.toLowerCase().toCharArray();
            char[] word2Array= word2WithoutWSpaces.toLowerCase().toCharArray();

            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            isAnagram=Arrays.equals(word1Array,word2Array);

        }
        if(isAnagram){
            System.out.println(word1+" and "+word2 +" are anagrams ");
        }
        else{
            System.out.println(word1+" and "+ word2+ " are not anagrams");
        }
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        checkIfAnagram("Fat cat", "tac atf");
        checkIfAnagram("mary","yarm");
        checkIfAnagram("Fat cat is a mad cat","Cat Fat mad cat a is ");
    }
}
