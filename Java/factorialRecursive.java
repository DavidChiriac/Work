public static int factorialRecursive(int number, int max){
    if(number == max){
        return number;
    }
    else{
        return number*factorialRecursive(number + 1, max);
    }
}