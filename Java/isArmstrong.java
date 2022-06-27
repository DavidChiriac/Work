public static boolean isArmstrong(int number){
    int sum=0;
    int copy = number;
    while(copy!=0){
        sum+=(copy % 10) * (copy % 10) * (copy % 10);
        copy /= 10;
    }
    if(sum == number){
        return true;
    }
    return false;
}