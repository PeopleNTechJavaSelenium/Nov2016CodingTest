package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};


		ConnectDB connectDB = new ConnectDB();


		int minNum = findMin(array);

		connectDB.InsertDataFromStringToMySql(Integer.toString(minNum), "MathLowestNumber", "List");

		System.out.println("Lowest Number in Array: " + minNum + "\nExported to DB:core_java Table:MathLowestNumber");


	}


	public static int findMin(int[] Arr){
		int min =Arr[0];
		for(int i=0;i<Arr.length;i++){
			if(Arr[i]<min){
				min = Arr[i];
			}
		}
		return min;



	}

}
