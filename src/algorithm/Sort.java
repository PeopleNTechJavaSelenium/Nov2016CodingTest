package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 * Store all the sorted data into one of the databases.
	 */


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
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }

        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int size = array.length;
        if (size < 2)
            return list;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];

        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < leftSize) {
            arr[k++] = right[j++];
        }
    }


    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
            recursiveQuickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {
        int idx = partition(array, startIdx, endIdx);
        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }
        if (endIdx > idx) {
            recursiveQuickSort(array, idx, endIdx);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left];


        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                left++;
                right--;
            }
        }
        return left;
    }

    
    public int [] heapSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        for( int i = array.length / 2; i >= 0; i-- )  /* buildHeap */
            percDown( array, i, array.length );
        for( int i = array.length - 1; i > 0; i-- )
        {
            swapReferences( array, 0, i );            /* deleteMax */
            percDown( array, 0, i );
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    private static int leftChild( int i )
    {
        return 2 * i + 1;
    }
    private static void percDown(int[] a, int i, int n )
    {
        int child;
        int tmp;

        for( tmp = a[ i ]; leftChild( i ) < n; i = child )
        {
            child = leftChild( i );
            if( child != n - 1 && a[ child ]<( a[ child + 1 ] ))
                child++;
            if( tmp<( a[ child ] )  )
                a[ i ] = a[ child ];
            else
                break;
        }
        a[ i ] = tmp;
    }
    public static final void swapReferences(int[] a, int index1, int index2 )
    {
        int tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

        
        



    public int [] bucketSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        int max = maxValue(array);
        int [] bucket=new int[max+1];
        for (int i=0; i<bucket.length; i++) {
                bucket[i]=0;
            }

            for (int i=0; i<array.length; i++) {
                bucket[array[i]]++;
            }

            int outPos=0;
            for (int i=0; i<bucket.length; i++) {
                for (int j=0; j<bucket[i]; j++) {
                    array[outPos++]=i;
                }
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        }
    static int maxValue(int[] a)
    {
        int maxValue = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] > maxValue)
                maxValue = a[i];
        return maxValue;
    }

    
    public int [] shellSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
            int inner, outer;
            int temp;

            int h = 1;
            while (h <= array.length / 3) {
                h = h * 3 + 1;
            }
            while (h > 0) {
                for (outer = h; outer < array.length; outer++) {
                    temp = array[outer];
                    inner = outer;

                    while (inner > h - 1 && array[inner - h] >= temp) {
                        array[inner] = array[inner - h];
                        inner -= h;
                    }
                    array[inner] = temp;
                }
                h = (h - 1) / 3;
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    /*
    public static void main(String[] args) {

        int [] array = {5,3,0,2,4,1,0,5,2,3,1,4};
        System.out.println("Before: " + Arrays.toString(array));
        int a[]= shellSort(array);
        System.out.println("After:  " + Arrays.toString(array));

    }
    */
}

