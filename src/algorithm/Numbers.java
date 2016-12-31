package algorithm;
import databases.ConnectDB;

import java.util.Random;

/*
 *Created by PIIT_NYA on 12/11/2016.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

		ConnectDB connectDB = new ConnectDB();

		//insert unsorted elements to SortingUnsortedElements table
		connectDB.InsertDataFromArryToMySql(num, "SortingUnsortedElements","UnsortedElements" );


		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;

		System.out.println("Total Execution Time of "+ num.length + " numbers using Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Insertion Sort take: " + insertionSortExecutionTime + " milli sec");


		//BubbleSort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");


		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Merge Sort take: " + mergeSortExecutionTime + " milli sec");

		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Quick Sort take: " + quickSortExecutionTime + " milli sec");

		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Heap Sort take: " + heapSortExecutionTime + " milli sec");

		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Bucket Sort take: " + bucketSortExecutionTime + " milli sec");

		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers using Heap Sort take: " + shellSortExecutionTime + " milli sec");

	}

}
