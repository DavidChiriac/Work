import java.io.ObjectStreamException;
import java.util.Scanner;

public class test {


    public static void main(String[] args){
        //System.out.println("Number:");
        //Scanner input = new Scanner(System.in);
        //int a = input.nextInt();
        //System.out.println(isPrime(a));

        //Fibonacci(10);

        //System.out.println(stringPalindrome("bob"));

        //System.out.println(integerPalindrome(10001));

        //System.out.println(isArmstrong(153));

        //System.out.println(factorialIterative(5));

        //System.out.println(factorialRecursive(1, 5));

        //System.out.println(reverseString("David"));

        Object[] arr = new Object[]{1,2,3,"cal",2,"cal",'f',5.431};
        Object[] newarr;
        newarr = removeDuplicates(arr);
        for(int i=0;i<newarr.length;++i){
            System.out.println(newarr[i]+" ");
        }
    }

    public static boolean isPrime(int number){
        for(int i=2;i<(int)Math.sqrt(number) + 1;++i){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

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

    public static boolean stringPalindrome(String str){
        for(int i = 0; i<str.length() / 2 + 1; ++i){
                if(str.charAt(i)!=str.charAt(str.length() - i - 1)){
                    return false;
            }
        }
        return true;
    }

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

    public static int factorialRecursive(int number, int max){
        if(number == max){
            return number;
        }
        else{
            return number*factorialRecursive(number + 1, max);
        }
    }

    public static String reverseString(String str){
        String newString = "";
        for(int i=0;i<str.length();++i){
            newString += str.charAt(str.length()-i-1);
        }
        return newString;
    }

    public static Object[] removeDuplicates(Object[] arr){
        Object[] newArr = new Object[]{};
        int index = 0;
        try{
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
        }
        catch (ArrayIndexOutOfBoundsException e){

        }
        return newArr;
    }

}
