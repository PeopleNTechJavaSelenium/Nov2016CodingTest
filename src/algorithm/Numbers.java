package algorithm;
import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;
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

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Insertion Sort
		//Random rand = new Random();
		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}
		//Sort algo=new Sort();

		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....

		//bubble Sort
		//Random rand2 = new Random();
		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");


		//Random rand3 = new Random();
		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge sort takes: " + mergeSortExecutionTime+ " milli sec");

		//Random rand4 = new Random();
		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}

		algo.quickSort(num);
		long quickSortExecutionTime=algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick sort takes: " + quickSortExecutionTime+ " milli sec");

		//Random rand5 = new Random();
		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}
		algo.heapsort(num);
		long heapSortExecutionTime=algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in heap sort takes: " + heapSortExecutionTime+ " milli sec");

		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}

		algo.bucketSort(num);
		long bucketSortExecutionTime= algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bucket sort takes: " + bucketSortExecutionTime+ " milli sec");

		for(int i=0; i<num.length; i++){

			num[i] = rand.nextInt(1000000);

		}
		algo.shellSort(num);
		long shellSortExecutionTime=algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shell sort takes: " + shellSortExecutionTime+ " milli sec");

		algo.printSortedArray(num);

		List<String> sortedDataRetrieve = new ArrayList<String>();
		ConnectDB connectDB1=new ConnectDB();

		try {

			//create table sort in the database
			connectDB1.Query("create table sort(sort Integer);");
			//storing data to table sort in the database
			connectDB1.InsertDataFromArryToMySql(num, "sort", "sort");
			//retrieving From database(below)
			sortedDataRetrieve = connectDB1.readDataBase("sort", "sort");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data Being retrieved from Database");
		for(String st:sortedDataRetrieve){
			System.out.println(st);
		}

	}

}
