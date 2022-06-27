public static void reverseArrayInPlace(int[] array){
    for(int i=0;i<array.length/2;++i){
        int aux = array[i];
        array[i]=array[array.length-1-i];
        array[array.length-1-i]=aux;
    }
}