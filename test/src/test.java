import java.util.Scanner;

public class test {


    public static void main(String[] args){
        System.out.println("Number:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int number){
        for(int i=2;i<(int)Math.sqrt(number) + 1;++i){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
