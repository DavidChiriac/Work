import java.util.Arrays;

/**
 * Test class to sort array of integers using Quicksort algorithm in Java.
 * @author Javin Paul
 */
public class QuickSortDemo{

    public static void main(String args[]) {

        // unsorted integer array
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));


        // sorting integer array using quicksort algorithm
        QuickSort.sort(unsorted);

        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));

    }

    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;++i){

        }
    }

}