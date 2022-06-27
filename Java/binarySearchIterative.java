public static int binarySearchIterative(int[] array, int searchedElement){
    int Index0=0;
    int IndexN=array.length-1;

    while(array[(IndexN+Index0)/2]!=searchedElement){
        if(array[(IndexN+Index0)/2]>searchedElement){
            IndexN=(IndexN+Index0)/2-1;
        }
        else{
            Index0=(IndexN+Index0)/2+1;
        }
    }
    return Index0;
}