public static void Fibonacci(int number){
    if(number > 2){
        int fibo1 = 1, fibo2 = 1, nextFibo;
        System.out.print(fibo1 +" "+fibo2);
        for(int i = 3; i <= number; ++i){
            nextFibo=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=nextFibo;
            System.out.print(" "+fibo2);
        }
    }
}