package problems;

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

        duplicate(st);
    }
    public static void duplicate(String sentence){
        String[] words = sentence.split(" ");
        int[] wordcount = new int[words.length];
        int totalLenDup = 0;
        int duplicates = 0;
        for(int i = 0; i < words.length; i++){
            wordcount[i] = 1;
            if(words[i]=="")continue;
            for(int j = 0; j < words.length; j++){
                if(i!=j && words[i].equals(words[j])){
                    words[j]="";
                    wordcount[i]++;
                }
            }
            if(wordcount[i]>1){
                duplicates++;
                totalLenDup+=words[i].length();
            }
            else{
                continue;
            }
            System.out.println(words[i]+" occurrence: "+wordcount[i]);
        }
        System.out.println("\n\nTotal Duplicates: "+duplicates);
        System.out.println("Average Length of Duplicates: "+totalLenDup/duplicates);
    }

}