package algorithm;
import databases.ConnectDB;

import java.util.*;
import java.lang.System.*;

import static java.lang.System.exit;

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

		int[] num = new int[10000];
		int maxForBucketSort=0;
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(1000000);
			if (maxForBucketSort < num[i]) {
				maxForBucketSort = num[i];
			}
		}


		Sort algo = new Sort();
		int choice;
		System.out.println("Please Enter your Choice[1 - 8] for Sorting Algorithms");
		System.out.println("1. Selection Sort");
		System.out.println("2. Insertion Sort");
		System.out.println("3. Bubble Sort");
		System.out.println("4. Bucket Sort");
		System.out.println("5. Shell Sort");
		System.out.println("6. Heap Sort");
		System.out.println("7. Merge Sort");
		System.out.println("8. Quick Sort");
		System.out.println("Hit any number to Exit");
		System.out.println();
		Scanner stdin = new Scanner(System.in);
		choice = stdin.nextInt();

		ConnectDB connectDB = new ConnectDB();
		List<String> sort = new ArrayList<>();
		switch (choice) {

			case 1: {
				//Selection Sort
				algo.selectionSort(num);
				printSort(algo.selectionSort(num));
				long selectionSortExecutionTime = algo.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
				try { //Database: core_java  table: selectionsort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "selectionsort", "sortednumber");
					sort= connectDB.readDataBase("selectionsort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (SelectionSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			case 2: {
				//Insertion Sort
				algo.insertionSort(num);
				printSort(num);
				long insertionSortExecutionTime = algo.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
				try { //Database: core_java  table: insertionsort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "insertionsort", "sortednumber");
					sort= connectDB.readDataBase("insertionsort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (InsertionSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			//Continue for rest of the Sorting Algorithm....
			case 3: {
				algo.bubbleSort(num);
				printSort(num);
				long bubbleSortExecutionTime=algo.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
				try { //Database: core_java  table: bubblesort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "bubblesort", "sortednumber");
					sort= connectDB.readDataBase("bubblesort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (BubbleSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			case 4: {
				algo.bucketSort(num,maxForBucketSort);
				printSort(num);
				long bucketSortExecutionTime=algo.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bucketSortExecutionTime+ " milli sec");
				try { //Database: core_java  table: bucketsort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "bucketsort", "sortednumber");
					sort= connectDB.readDataBase("bucketsort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (BucketSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			case 5: {
				algo.shellSort(num);
				printSort(num);
				long shellSortExecutionTime=algo.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + shellSortExecutionTime + " milli sec");
				try { //Database: core_java  table: shellsort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "shellsort", "sortednumber");
					sort= connectDB.readDataBase("shellsort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (ShellSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			case 6: {
				HeapSort hs=new HeapSort();
				hs.sort(num);
				printSort(num);
				long heapSortExecutionTime=hs.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + heapSortExecutionTime + " milli sec");
				try { //Database: core_java  table: heapsort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "heapsort", "sortednumber");
					sort= connectDB.readDataBase("heapsort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (HeapSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			case 7: {
				Mergesort ms = new Mergesort();
				ms.sort(num);
				printSort(num);
				long mergeSortExecutionTime=ms.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime+ " milli sec");
				try { //Database: core_java  table: mergesort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "mergesort", "sortednumber");
					sort= connectDB.readDataBase("mergesort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (MergeSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			case 8: {
				QuickSort qs=new QuickSort();
				qs.sort(num);
				printSort(num);
				long quickSortExecutionTime=qs.executionTime;
				System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + quickSortExecutionTime + " milli sec");
				try { //Database: core_java  table: quicksort  column: sortednumber
					connectDB.InsertDataFromArryToMySql(num, "quicksort", "sortednumber");
					sort= connectDB.readDataBase("quicksort", "sortednumber");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Data is reading from the Table (QuickSort) and displaying to the console");
				for(String st:sort){
					System.out.print(st);
					System.out.println();
				}
				break;
			}
			default:
				exit(0);
		}
	}
	public static void printSort(int[] num) {
		System.out.println("");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}