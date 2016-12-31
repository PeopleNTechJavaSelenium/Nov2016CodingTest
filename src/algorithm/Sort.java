package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 * Store all the sorted data into one of the databases.
	 */




    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
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

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();

        int [] list = Arrays.copyOf(array, array.length);
        //implemented here

        int i,j;
        int temp=0;

        for(i = 1; i < list.length;i++){
            for (j = i; j >0; j--) {
                if (list[i]>list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);
        //implemented here
        
        int temp=0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length-1; j++) {
                if(list[j-1]<list[j]){
                    temp=list[j-1];
                    list[j-1]=list[j];
                    list[j]=temp;
                }

            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);
        //implemented here

        mergeSortMethod(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
}

    public static void mergeSortMethod(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];

        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        mergeSortMethod(left);
        mergeSortMethod(right);
        merge(left, right, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < leftSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    public int [] quickSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);
        //implemented here

        quickSort(list, 0, array.length - 1);


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

}
    private static void quickSort(int[] array, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(array, i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(array, lowerIndex, j);
        if (i < higherIndex)
            quickSort(array, i, higherIndex);
    }
    private static void exchangeNumbers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);
        //implemented here

        HeapSort heapSort = new HeapSort();
        heapSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private class HeapSort {

        private int[] a;
        private int n;
        private int left;
        private int right;
        private int largest;


        public void buildheap(int[] a) {
            n = a.length - 1;
            for (int i = n / 2; i >= 0; i--) {
                maxheap(a, i);
            }
        }

        public void maxheap(int[] a, int i) {
            left = 2 * i;
            right = 2 * i + 1;

            if (left <= n && a[left] > a[i]) {
                largest = left;
            } else {
                largest = i;
            }

            if (right <= n && a[right] > a[largest]) {
                largest = right;
            }
            if (largest != i) {
                exchange(i, largest);
                maxheap(a, largest);
            }
        }

        public void exchange(int i, int j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

        public void sort(int[] myarray) {
            a = myarray;
            buildheap(a);
            for (int i = n; i > 0; i--) {
                exchange(0, i);
                n = n - 1;
                maxheap(a, 0);
            }
        }
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);
        //implemented here

        int maxVal = maxFind(list);//list.length;
        int[] bucket = new int[maxVal+1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < list.length; i++) {
            bucket[list[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                list[outPos++] = i;
            }
        }




        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public static int maxFind(int[] Arr){
        int small =Arr[0];
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>small){
                small = Arr[i];
            }
        }
        return small;
    }


    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = Arrays.copyOf(array, array.length);
        //implemented here

        int inner, outer;
        int temp;

        int h = 1;
        while (h <= list.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < list.length; outer++) {
                temp = list[outer];
                inner = outer;

                while (inner > h - 1 && list[inner - h] >= temp) {
                    list[inner] = list[inner - h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h - 1) / 3;
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
