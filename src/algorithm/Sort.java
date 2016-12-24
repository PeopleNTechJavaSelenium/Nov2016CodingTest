package algorithm;

public class Sort
    {


        long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helping methods.
	 * Store all the sorted data into one of the databases.
	 */


        public int[] selectionSort(int[] array)
            {
                final long startTime = System.currentTimeMillis();
                int[] list = array;

                for (int i = 0; i < array.length; i++)
                    {
                        for (int j = i + 1; j < array.length; j++)
                            {
                                if (array[j] < array[i])
                                    {
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


            public int[] insertionSort(int[] array)
            {
                final long startTime = System.currentTimeMillis();
                int[] list = array;

                int in, out;
                for (out = 1; out < list.length; out++)
                    {
                        int temp = list[out];
                        in = out;
                        while (in > 0 && list[in - 1] >= temp)
                            {
                                list[in] = list[in - 1];
                                --in;
                            }
                        list[in] = temp;
                    }


                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - startTime;
                this.executionTime = executionTime;
                return list;
            }

             public int[] bubbleSort(int[] array)
                 {

                     final long startTime = System.currentTimeMillis();
                     int[] list = array;

                     int i, j, temp = 0;
                     for (i = 0; i < list.length - 1; i++)
                         {
                             for (j = 0; j < list.length - 1 - i; j++)
                                 {
                                     if (list[j] > list[j + 1])
                                         {
                                             temp = list[j];
                                             list[j] = list[j + 1];
                                             list[j + 1] = temp;
                                         }

                                 }
                         }
                     final long endTime = System.currentTimeMillis();
                     final long executionTime = endTime - startTime;
                     this.executionTime = executionTime;
                     return list;
                 }

                public int[] mergeSort ( int[] array)
                {


                    final long startTime = System.currentTimeMillis();
                    int[] list = array;


                    final long endTime = System.currentTimeMillis();
                    final long executionTime = endTime - startTime;
                    this.executionTime = executionTime;
                    return list;
                }


                public int[] quickSort ( int[] array)
                {
                    final long startTime = System.currentTimeMillis();
                    int[] list = array;


                    final long endTime = System.currentTimeMillis();
                    final long executionTime = endTime - startTime;
                    this.executionTime = executionTime;
                    return list;
                }

                public int[] heapSort ( int[] array)

                {
                        final long startTime = System.currentTimeMillis();
                        int[] list = array;


                        final long endTime = System.currentTimeMillis();
                        final long executionTime = endTime - startTime;
                        this.executionTime = executionTime;
                        return list;
               }


                public int[] bucketSort ( int[] array)
                {
                            final long startTime = System.currentTimeMillis();
                            int[] list = array;


                            final long endTime = System.currentTimeMillis();
                            final long executionTime = endTime - startTime;
                            this.executionTime = executionTime;
                            return list;
                 }

                public int[] shellSort ( int[] array){
                final long startTime = System.currentTimeMillis();
                int[] list = array;


                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - startTime;
                this.executionTime = executionTime;
                return list;
            }

        public static void printSortedArray(int array)
            {
                for (int i = 0; i < array.length; i++)
                    {
                        System.out.println(array[i]);
                    }
            }
    }
