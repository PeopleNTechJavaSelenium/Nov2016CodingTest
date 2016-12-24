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

        //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
       //"java is a very useful language java is not so difficult to learn"

        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
        for (String string : "Flower, Flower, Plant, Plant, Plant".split(", ")) {
            if(unique.get(string) == null)
                unique.put(string, 2);
            else
                unique.put(string, unique.get(string) + 2);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString);
        System.out.println("Values = " + value);

    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();

    }

}


