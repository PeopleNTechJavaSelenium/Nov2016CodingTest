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

        String word[]=st.toLowerCase().replace(".","").split(" ");
        int sum=0;
        int count1=0;
        float averageLength;
        for (int i = 0; i < word.length; i++) {
            int count = 0;

            for (int j = 0; j < word.length; j++) {

                if (word[i].equals(word[j])) {

                    if (j < i) {
                        break;
                    }

                    count++;
                }
            }

            if (count > 1) {
                System.out.println("the word " + word[i] + " occured " + count + " times");
                sum=sum+word[i].length();
                count1++;
            }
        }
        averageLength=(float)sum/count1;
        System.out.println("The average length of duplicated words is: "+averageLength);



    }


    }


