package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


		int i = 101;
		for(;i>90;){
			i--;
			System.out.print(i+" ");
		}
		for(;i>70;){
			i = i-2;
			System.out.print(i+" ");
		}
		for(;i>40;){
			i=i-3;
			System.out.print(i+" ");
		}
		for(;i>10;){
			i=i-4;
			System.out.print(i+" ");
		}




	}
}
