package problems;

import java.util.*;
/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming language . Java is also an Island of Indonesia. Java is widely used language";
        List<String> list = Arrays.asList(st.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String j : uniqueWords) {

            System.out.println("[ "+j + " ]=> " + Collections.frequency(list, j));

        }

    }

}
