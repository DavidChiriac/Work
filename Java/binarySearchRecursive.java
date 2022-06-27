public static void binarySearchRecursive(int[] array, int searchedElement, int Index0,int IndexN){
    if(array[(IndexN+Index0)/2]==searchedElement){
        System.out.println(searchedElement + " can be found in the array at position: "+(IndexN+Index0)/2);
    }
    else if(array[(IndexN+Index0)/2]>searchedElement){
        binarySearchRecursive(array,searchedElement,Index0,(IndexN+Index0)/2-1);
    }
    else{
        binarySearchRecursive(array,searchedElement,(IndexN+Index0)/2+1,IndexN);
    }
}