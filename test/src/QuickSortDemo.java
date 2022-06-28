import java.util.Arrays;

/**
 * Test class to sort array of integers using Quicksort algorithm in Java.
 * @author Javin Paul
 */
public class QuickSortDemo{

    public static void main(String args[]) {

        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        insertionSort(unsorted);

        System.out.println("Sorted array :" + Arrays.toString(unsorted));

    }

    public static void insertionSort(int[] unsorted){
        for (int i = 1; i < unsorted.length; i++) {
            int current = unsorted[i];
            int j = i;

            // create right place by moving elements
            while (j > 0 && unsorted[j - 1] > current) {

                // move
                unsorted[j] = unsorted[j - 1];
                j--;
            }

            // found the right place, insert now
            unsorted[j] = current;
        }
    }

}
