
import java.util.ArrayList;



public class UseArrayList {

	public static void main(String[] args)  {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */


		// create an array list
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " + al.size());

		// add elements to the array list
		al.add("Cats");
		al.add("Apples");
		al.add("Eggs");
		al.add("Birds");
		al.add("Dogs");
		al.add("Foxs");
		al.add(1, "deez");
		System.out.println("Size of array list after additions: " + al.size());

		// display the array list
		System.out.println("Contents of array list: " + al);

		// Remove elements from the array list
		al.remove("F");
		al.remove(2);
		System.out.println("Size of array list after deletions: " + al.size());
		System.out.println("Contents of array list: " + al);







		}

	}



