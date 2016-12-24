package math;

public class Pattern {
    public Pattern() {
    }

		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

    public static void main(String[] args) {
			for(int i=100; i >= 0; --i){
				if(100 >= i && i >= 90){
					i = i;
					System.out.print(i + ",");
				}else
					if(90 > i && i >= 70){
					--i;
					System.out.print(i + ",");
				}else
					if (70 > i && i >= 50){
					i -= 2;
					System.out.print(i + ",");
				}else
					if (50 > i && i >= 40){
					i -= 2;
					System.out.print(i + ",");
				}else
					if (40 > i && i >= 20){
					i -= 3;
					System.out.print(i + ",");
				}else
					if (20 > i && i >= 0){
					i -= 3;
					System.out.print(i + ",");
				}
			}

		}
	}