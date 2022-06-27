public static int reverseNumber(int number){
    int aux=0;
    while(number!=0){
        aux = aux*10+number%10;
        number/=10;
    }
    return aux;
}