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
			
		num[i] = rand.nextInt(10000);
			
		}
		ConnectDB connectDB = new ConnectDB();

		List<String> randomArray = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(num, "random_array", "column_random_array");
			randomArray = connectDB.readDataBase("random_array", "column_random_array");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (random_array) and displaying to the console");
		for(String st:randomArray){
			System.out.println(st);
		}
/*
		for(int j=0; j<num.length; j++){

			//num[j] = rand.nextInt(10000);
			System.out.println(num[j]);

		}
*/

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		System.out.println("========Sorted by Selection Sort :========");
		/*for(int j=0; j<num.length; j++){
			//num[j] = rand.nextInt(10000);
			System.out.println(num[j]);
		}
		*/

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		try {
			connectDB.InsertDataFromArryToMySql(algo.bubbleSort(num), "Sorting", "BubbleSort");
			//lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

		algo.mergeSort(num);
		algo.printSortedArray(num);
		long mergeSortExecutionTime = algo.executionTime;
		try {
			connectDB.InsertDataFromArryToMySql(algo.mergeSort(num), "Sorting", "Megersort");
			//lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");

		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		try {
			connectDB.InsertDataFromArryToMySql(algo.quickSort(num), "Sorting", "QuickSort");
			//lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");

		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		try {
			connectDB.InsertDataFromArryToMySql(algo.heapSort(num), "Sorting", "HeapSort");
			//lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");

		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		try {
			connectDB.InsertDataFromArryToMySql(algo.bucketSort(num), "Sorting", "BucketSort");
			//lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");

		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		try {
			connectDB.InsertDataFromArryToMySql(algo.shellSort(num), "Sorting", "ShellSort");
			//lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Execution Time of " + num.length + " numbers in Shel Sort take: " + shellSortExecutionTime + " milli sec");



	}

}
