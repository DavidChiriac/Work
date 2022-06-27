public static boolean integerPalindrome(int number){
    int aux = number, reverse = 0;
    while(aux != 0){
        reverse = reverse * 10 + aux % 10;
        aux /= 10;
    }
    if(reverse == number){
        return true;
    }
    return false;
}