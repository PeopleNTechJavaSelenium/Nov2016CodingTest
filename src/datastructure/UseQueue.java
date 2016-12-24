package datastructure;
import java.util.*;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> le = new LinkedList<>();
		le.add("OH");
		le.add("DC");
		le.add("NYC");
		le.add("NC");
		le.add("VA");
		le.add("WA");


		for (String j:le
				) {System.out.println(" Before manipulation "+ j.toString());

		}
		le.poll();
		Iterator it = le.iterator();
		while(it.hasNext()) {
			System.out.println(" After manipulation "+le.element());
			le.remove();
		}





	}

}
