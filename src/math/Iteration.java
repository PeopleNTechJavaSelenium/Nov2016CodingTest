package math;

/**
 * Created by Renadh on 12/28/2016.
 */
public interface Iteration {

    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("The factorial of 5 is " + result);
    }
}