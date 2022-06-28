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