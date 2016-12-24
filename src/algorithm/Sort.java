package algorithm;

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
                int temp, m;
        for(int n=0; n<array.length; n++){
            temp = array[n];
            for ( m = n-1; m >=0 && temp<array[m]; m--) {
                array[m + 1] = array[m];}
                array[m+1] = temp;}

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

        public int[] bubbleSort(int [] array) {
            final long startTime = System.currentTimeMillis();
            int [] list = array;
            //implement here
            int temp;
            for(int i=0; i<array.length-1; i++){
                for(int j=1;j<array.length-i; j++){
                    if(array[j-1]>array[j]) {
                        temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;}
                }
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;





    }
    

    public int [] quickSort(int [] array) {
        int[] list = array;
            //implement here


            return list;
        }

        public int[] heapSort ( int[] array){

            int[] list = array;
            //implement here


           return list;
        }


        public int[] bucketSort ( int[] array){

           int[] list = array;
            //implement here


            return list;
        }

        public int[] shellSort ( int[] array){

            int[] list = array;
            //implement here


            return list;
        }

         public static void printSortedArray(int [] array){

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
