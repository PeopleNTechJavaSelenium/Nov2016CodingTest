package datastructure;
import java.util.*;
public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> list = new Stack<String>();
		list.push("7");
		list.push("8");
		list.push("99.99");
		Scanner sn = new Scanner(System.in);
		for (int i=0; i<10;i++){
			System.out.println("enter a value ");
			list.push(sn.next());
		}
		list.pop();

		System.out.println("Peek Element is  " + list.peek());
		System.out.println(list.search(8));



		for (String Item :list
			 ) {System.out.println("modified list:	"+list);

		}

		Iterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(list.pop());
		}


	}

}
