package math;
import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		List<Integer> list = new ArrayList<Integer>();
		int i = 100;
		while (i > 0) {
			if (i > 90) {
				i--;
				list.add(i);
			} else if (i > 70) {
				i -= 2;
				list.add(i);
			} else if (i > 40) {
				i -= 3;
				list.add(i);
			} else if (i > 0) {
				i -= 4;
				list.add(i);
			}


			for (int j : list
					) {
				System.out.println(j);

			}
		}

	}
}