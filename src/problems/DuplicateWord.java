package problems;

import java.util.HashMap;
import java.util.Scanner;
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

        int key;
        int count=0;
        double sum=0.0;
        double avg=0.0;

        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String[] strArr = st.split(" ");

        for(int i=0;i<strArr.length;i++){
            if(hm.containsKey(strArr[i])){
                key = hm.get(strArr[i]);
                hm.put(strArr[i],key+1);
            }
            else{
                hm.put(strArr[i],1);
            }
        }
        System.out.println(hm);
        for (String word : strArr) {
            double wordLength = word.length();
            sum += wordLength;
            count++;
        }
        if (count > 0) {
            avg=sum/count;
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println("Average word length = " +avg);
    }
}
