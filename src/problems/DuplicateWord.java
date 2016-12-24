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

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


        List< String > list = Arrays.asList(st.split(" "));
        int size = list.size();

        int i = 0;
        Map< String, Integer > duplicateCountMap = new HashMap<>();
        for (int j = 0; size > j; j++) {
            int count = 0;
            for (i = 0; size > i; i++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                    duplicateCountMap.put(list.get(j), count);
                }
            }
        }
        System.out.println(duplicateCountMap);
        System.out.println("length of the sentence: "+ size);
        int total = st.length()/size;
        System.out.println("Average length of the words: " + total);

    }

}
