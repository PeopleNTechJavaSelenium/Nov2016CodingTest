        package math;

        /**
         * Created by mrahman on 12/16/16.
         */
        public class Factorial {

            public static void main(String[] args) {


                int a = 5;

                //call the recursive function to generate factorial
                int result = fact(a);
                long result1= factorial(a);


                System.out.println("Factorial of the number using recursion is: " + result);
                System.out.println("Factorial of the number using iteration is  is: " + result1);
            }

            static int fact(int b) {
                if (b <= 1)
                    //if the number is 1 then return 1
                    return 1;
                else
                    //else call the same function with the value - 1
                    return b * fact(b - 1);
            }

            public static long factorial(int num) {
                long result = 1;
                if (num == 0) {
                    return 1;
                } else {
                    for (int i = 2; i <= num; i++) {
                        result *= i;
                    }
                    return result;
                }
            }
        }



