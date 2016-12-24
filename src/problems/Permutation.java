package problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */

        System.out.println("Permutation of ABC are as Follow: ");
        String str = "ABC";
        StringBuffer strBuf = new StringBuffer(str);
        doPerm(strBuf,str.length());
    }

    public static void doPerm(StringBuffer str, int index){
        if(index <= 0)
            System.out.println(str);
        else {
            doPerm(str, index-1);
            int currPos = str.length()-index;
            for (int i = currPos+1; i < str.length(); i++) {
                swap(str,currPos, i);
                doPerm(str, index-1);
                swap(str,i, currPos);
            }
        }
    }

    public static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);












    }
}
