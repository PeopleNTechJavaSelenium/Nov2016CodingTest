package datastructure;

import java.util.LinkedList;
import java.util.Random;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		int i=0;
        LinkedList<Integer> list=new LinkedList();
        Random random=new Random();
        while(i<10 ){
		list.add(random.nextInt(100));
		i++;
		}
		System.out.println("The List looks like :");
		list.stream().forEach(s -> System.out.print(s+" "));
		System.out.println();
		list.remove(0);                             //remove elements
		for (Integer integer : list) {
		if(integer%2==0){
			}
		}
		list.stream().forEach(s -> System.out.println("Removed element :"+s));
		int retVal=list.get(3);                             //retrieve element
		System.out.println("Retrieved element is  :" + retVal);
		System.out.println("Height number is :" + list.peek());          // peek from the list
	}
}
