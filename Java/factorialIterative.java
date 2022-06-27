public static int factorialIterative(int number){
    int factor = 1;
    if(number == 0 || number == 1){
        return 1;
    }
    else{
        for(int i = 2; i <= number; ++i){
            factor *= i;
        }
    }
    return factor;
}