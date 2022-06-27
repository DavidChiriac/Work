public static int Gcd(int a, int b){
    if(a==b){
        return a;
    }
    else if (a>b){
        return Gcd(a-b,b);
    }
    else{
        return Gcd(a,b-a);
    }
}