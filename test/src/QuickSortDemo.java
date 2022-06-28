import java.util.Arrays;

/**
 * Test class to sort array of integers using Quicksort algorithm in Java.
 * @author Javin Paul
 */
public class QuickSortDemo{

    public static void main(String args[]) {

        int[] unsorted = {9,8,7,6,5,4,3,2,1};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        bubbleSort(unsorted);

        System.out.println("Sorted array :" + Arrays.toString(unsorted));

    }

        public static void bubbleSort(int[] unsorted){
            boolean sorted;
            do {
                sorted = true;
                for (int i = 0; i < unsorted.length - 1; ++i) {
                    if (unsorted[i] > unsorted[i + 1]) {
                        int aux = unsorted[i];
                        unsorted[i] = unsorted[i + 1];
                        unsorted[i + 1] = aux;
                        sorted = false;
                    }
                }
            }while(!sorted);
        }

}
