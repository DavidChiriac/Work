public static int[] removeDuplicates(int[] arr){
    int[] newArr = new int[arr.length];
    int index = 0;
    for(int i = 0; i < arr.length; ++i){
        int ok = 1;
        for(int j = 0; j < newArr.length; ++j){
            if(arr[i] == newArr[j]){
                ok = 0;
                j= newArr.length;
            }
        }
        if(ok == 1){
            newArr[index] = arr[i];
            index++;
        }
    }
    return newArr;
}