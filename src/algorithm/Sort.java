package algorithm;

public class Sort {

    long executionTime = 0;

    /*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 * Store all the sorted data into one of the databases.
	 */
//Selection Sort
    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //Insertion Sort
    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //Bubble Sort
    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int j;
        boolean flag = true; // set flag to true to begin first pass
        int temp; // holding variable
        while (flag) {
            flag = false; // set flag to false awaiting a possible swap
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) // change to > for ascending sort
                {
                    temp = array[j]; // swap elements
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true; // shows a swap occurred
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //Merge Sort



//Quick Sort

 //Heap Sort

//Bucket Sort
    public int [] bucketSort(int [] array,int max){
        final long startTime = System.currentTimeMillis();
        //implement here
        int[] list = new int[max + 1];
        int[] sorted_sequence = new int[array.length];
        for (int i = 0; i < array.length; i++)
            list[array[i]]++;
        int outPos = 0;
        for (int i = 0; i < list.length; i++)
            for (int j = 0; j < list[i]; j++)
                sorted_sequence[outPos++] = i;
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return sorted_sequence;
    }
//Shell Sort
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
int [] list = array;
//implement here
int temp, i, j;
for (int increment = array.length / 2; increment > 0; increment /= 2) {
for(i = increment; i < array.length; i++) {
                temp = array[i];
                for (j = i; j >= increment; j -= increment) {
                    if (temp < array[j - increment]) {
                        array[j] = array[j - increment];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
