package problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("","ABC");

    }
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.print(perm + word+" ");
        } else {
            for (int i = 0; i < word.length() ; i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }

        }
    }
}
