package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

        public int[] selectionSort ( int[] array){

            final long startTime = System.currentTimeMillis();
            int[] list = array;

            for (int j = 0; j < array.length - 1; j++) {
                int min = j;
                for (int i = j + 1; i < array.length; i++) {
                    if (array[i] < array[min])
                        min = i;
                }

                int temp = array[min];
                array[min] = array[j];
                array[j] = temp;
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
        for (int j=1; j<array.length; j++){
            int key = array[j];
            int i= j-1;
            while ((i>-1) && (array[i]>key)){
                array[i+1] =array[i];
                i--;
            }
            array[i+1]= key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int temp = 0;
        for (int i =0; i<array.length; i++){
            for (int j=1; j<array.length-1; j++){
                if (array[j-1]>array[j]){
                    temp= array[j-1];
                    array[j-1]= array[j];
                    array[j]= temp;

                }
            }
        }

        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        int i;
        int[] a = {2, 4, 6, 8, 10};
        mergeSort(a);
        System.out.println(array.toString());


        return list;
    }
    

    public int[] quickSort( int [] array) {
        int[] list = array;
        //implement here
        int i;
        int[] a = {};
        quickSort(array);
        System.out.println("\n Sorted array is: \n");
        for (i = 0; i < 10; i++) ;
        System.out.println(array[i]);

        return list;
    }
    
    public int [] heapSort( int[] array, int i, int size ){
        int [] list = array;
        //implement here
        for(int i1=(array.length-1)/2; i>=0; i--){
            heapSort(array,i,array.length-1);
        }
        int left = 2*i + 1;
        int right = 2*i + 2;
        int max;
        if (left<=size && array[left] > array[i]){
        max=left;
        }
        else
        {
            max=i;
        }
        if(right<=size && array[right]>array[max]){
            max = right;
        }
        return list;
    }


    public int [] bucketSort(int [] array, int maxVal){
        int [] list = array;
        //implement here
        int [] bucket = new int[maxVal+1];
        for (int i =0; i< bucket.length; i++){
            bucket[i]=0;
        }
        for (int i=0; i<array.length; i++){
            bucket[array[i]]++;
        }
        return list;
    }

    public void main( String[] args ) {

    }
    
    public int [] shellSort(int [] array) {
        int[] list = array;
        //implement here
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
      while (h>0) {
          for (outer=h; outer< array.length; outer++){
              temp= array[outer];
              inner=outer;

              while (inner >h-1 && array[inner-h]>=temp){
                  array[inner]= array[inner-h];
                  inner-=h;
              }
              array[inner]=temp;
          }
          h = (h - 1) / 3;
        }

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
