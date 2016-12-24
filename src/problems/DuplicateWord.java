package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by mrahman on 4/9/16.
 */
/*
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

 //   }

//}
public class DuplicateWord {

    public static void main(String[] args) {
        countRepeatedWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
    }

    public static void countRepeatedWords(String wordToFind) {
        String[] words = wordToFind.split(" ");
        HashMap<String, Integer> wordMap = new LinkedHashMap<String, Integer>();

        for (String word : words) {
            wordMap.put(word,
                    (wordMap.get(word) == null ? 1 : (wordMap.get(word) + 1)));
        }

        System.out.println(wordMap);
    }

}