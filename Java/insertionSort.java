public static void insertionSort(int[] unsorted){
    for (int i = 1; i < unsorted.length; i++) {
        int current = unsorted[i];
        int j = i;

        while (j > 0 && unsorted[j - 1] > current) {
            unsorted[j] = unsorted[j - 1];
            j--;
        }

        unsorted[j] = current;
    }
}