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
        int [] list = array;

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
        int [] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int i;
        int j;
        int temp=0;

        for (i=0; i < list.length -1; i++){
            for (j=0; j < list.length -1-i; j++ ){
                if (list[j] > list[j +1]){
                    temp=list[j];
                    list[j] = list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here

        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
       // int [] list = array;
        //implement here
        private static int[] a;
        private static int n;
        private static int left;
        private static int right;
        private static int largest;


    public static void buildheap(int []a) {
        n = a.length-1;
        for(int i=n/2; i>=0; i--){
            maxheap(a,i);
        }
    }

    public static void maxheap(int[] a, int i) {
        left = 2*i;
        right = 2*i+1;

        if(left <= n && a[left] > a[i]){
            largest=left;
        } else {
            largest=i;
        }

        if(right <= n && a[right] > a[largest]) {
            largest=right;
        }
        if(largest!=i) {
            exchange(i, largest);
            maxheap(a, largest);
        }
    }

    public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sort(int[] myarray) {
        a = myarray;
        buildheap(a);
        for(int i=n; i>0; i--) {
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }

    public static void main(String[] args) {
        int []numbers={55,2,93,1,23,10,66,12,7,54,3};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
        





    public int [] bucketSort(int [] array){
        //int [] list = array;
        //implement here
        public static void sort(int[] a, int maxVal) {
            int [] bucket=new int[maxVal+1];

            for (int i=0; i<bucket.length; i++) {
                bucket[i]=0;
            }

            for (int i=0; i<a.length; i++) {
                bucket[a[i]]++;
            }

            int outPos=0;
            for (int i=0; i<bucket.length; i++) {
                for (int j=0; j<bucket[i]; j++) {
                    a[outPos++]=i;
                }
            }
        }


        public static void main(String[] args) {
            int maxVal=5;
            int [] data= {5,3,0,2,4,1,0,5,2,3,1,4};

            System.out.println("Before: " + Arrays.toString(data));
            sort(data,maxVal);
            System.out.println("After:  " + Arrays.toString(data));
        }
        


    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        public static void sort(int[] array) {
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
        }

        public static void main(String[] args) {

            int [] array = {5,3,0,2,4,1,0,5,2,3,1,4};
            System.out.println("Before: " + Arrays.toString(array));
            sort(array);
            System.out.println("After:  " + Arrays.toString(array));

        }
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
