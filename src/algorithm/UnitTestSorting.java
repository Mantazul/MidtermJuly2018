package algorithm;

import org.testng.Assert;
import java.sql.Array;
import java.util.Arrays;

public class UnitTestSorting<unSortedArray> {

    
    private static int min;
    
    /*
          This class is about Unit testing for Sorting Algorithm.
         */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        for (int j=0; j< sortedArray.length-1; j++){
            int min = j;
            for (int i=j+1; i<sortedArray.length; i++){
            }
            if (sortedArray[j] < sortedArray[min]);
            min = j;
        }
        int temp= sortedArray[min];
        int j = 0;
        sortedArray[min]= sortedArray[j];
        sortedArray[j] = temp;
        for (int n = 0; n<sortedArray.length; n++);
   
        System.out.println();

    }
            }


