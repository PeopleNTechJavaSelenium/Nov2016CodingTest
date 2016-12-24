package problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {
    public DuplicateWord() {
    }
    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        LinkedHashMap unique = new LinkedHashMap();
        String[] uniqueString = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language".split(" ");
        int value = uniqueString.length;

        for(int i = 0; i < value; ++i) {
            String string = uniqueString[i];
            if(unique.get(string) == null) {
                unique.put(string, Integer.valueOf(1));
            } else {
                unique.put(string, Integer.valueOf(((Integer)unique.get(string)).intValue() + 1));
            }
        }
        String K = join(unique.keySet(), ", ");
        ArrayList L = new ArrayList(unique.values());
        System.out.println("Output = " + K);
        System.out.println("Values = " + L);
    }
    public static String join(Collection<String> s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator iter = s.iterator();
        while(iter.hasNext()) {
            buffer.append((String)iter.next());
            if(iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}