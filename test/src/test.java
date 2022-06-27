import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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

        /*int[] arr = new int[]{1,2,3,4,5,1,2,3,8,5};
        int[] newarr = removeDuplicates(arr);
        for(int i=0;i<newarr.length;++i){
            System.out.println(newarr[i]+" ");
        }*/

        //printingPiramid(10);

        //printingStar(10);

        //printDublicateCharacters("Java");

        /*int a=13,b=2;
        System.out.print("Greatest common divisor of "+a+" and "+b+" is "+Gcd(a,b));*/

        //System.out.println(squareRoot(25,0.00001));

        //printFromFile("text");

        //writeInFile("text", "Salut, mai!\nCe faci?");

        /*int[] array={1,2,3,4,5};
        reverseArrayInPlace(array);
        System.out.print(Arrays.toString(array));*/

        //System.out.println(reverseWordsOfSentence("David este smecher, si mereu va fi asa!"));

        //System.out.println(isLeapYear(1904));

        /*int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        binarySearchRecursive(array,16,0,array.length-1);

        System.out.println("Element can be found on position: " + binarySearchIterative(array,16));*/

        //System.out.println(isAnagram("Mary","army"));

        //System.out.println(reverseNumber(1234));

        //System.out.println(firstNonRepeatingCharacter("abcdefghija"));

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

    public static void printingPiramid(int levels){
        for(int i=1;i<levels;++i){
            for(int j=0;j<i;++j){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void printingStar(int levels){
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printDublicateCharacters(String str){
        for(int i=0;i<str.length()-1;++i){
            int index=str.indexOf(str.charAt(i),i+1);
            int counter=1;
            try {
                do {
                    str = str.substring(0, index) + str.substring(index + 1, str.length());
                    index = str.indexOf(str.charAt(i), index);
                    counter++;
                } while (index != -1);
                if (counter>1)
                    System.out.println(str.charAt(i) + ": " + counter);
            }catch (StringIndexOutOfBoundsException e){

            }
        }
    }

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

    public static double squareRoot(double n, double l) {
        double x = n;
        double root;
        int count = 0;
        while (true)
        {
            count++;
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < l)
                break;
            x = root;
        }
        return root;
    }

    public static void printFromFile(String fileName){
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void writeInFile(String fileName, String text){
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void reverseArrayInPlace(int[] array){
        for(int i=0;i<array.length/2;++i){
            int aux = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=aux;
        }
    }

    public static String reverseWordsOfSentence(String sentence){
        String[] words = sentence.split(" ");
        String reverse = "";
        for(int i=words.length-1;i>0;--i){
            reverse += words[i]+" ";
        }
        reverse+=words[0];
        return reverse;
    }

    public static boolean isLeapYear(int year){
        if(year%4!=0){
            return false;
        }
        else{
            if(year%100==0 && year%400!=0)
                return false;
        }
        return true;
    }

    public static void binarySearchRecursive(int[] array, int searchedElement, int Index0,int IndexN){
        if(array[(IndexN+Index0)/2]==searchedElement){
            System.out.println(searchedElement + " can be found in the array at position: "+(IndexN+Index0)/2);
        }
        else if(array[(IndexN+Index0)/2]>searchedElement){
            binarySearchRecursive(array,searchedElement,Index0,(IndexN+Index0)/2-1);
        }
        else{
            binarySearchRecursive(array,searchedElement,(IndexN+Index0)/2+1,IndexN);
        }
    }

    public static int binarySearchIterative(int[] array, int searchedElement){
        int Index0=0;
        int IndexN=array.length-1;

        while(array[(IndexN+Index0)/2]!=searchedElement){
            if(array[(IndexN+Index0)/2]>searchedElement){
                IndexN=(IndexN+Index0)/2-1;
            }
            else{
                Index0=(IndexN+Index0)/2+1;
            }
        }
        return Index0;
    }

    public static boolean isAnagram(String str1, String str2){
        boolean ok=false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()==str2.length()){
            for (int i=0;i<str1.length()-1;++i){
                if(str2.indexOf(str1.charAt(i))!=-1){
                    if(str2.indexOf(str1.charAt(i)) != str1.charAt(i)){
                        ok=true;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if (ok) {
            return true;
        }
        return false;
    }

    public static int reverseNumber(int number){
        int aux=0;
        while(number!=0){
            aux = aux*10+number%10;
            number/=10;
        }
        return aux;
    }

    public static char firstNonRepeatingCharacter(String str){
        Hashtable<Character,Integer> apps = new Hashtable<Character, Integer>();
        for(int i=0;i<str.length();++i){
            Integer nr = (apps.get(str.charAt(i)) == null) ? 1 : apps.get(str.charAt(i))+1 ;
            apps.put(str.charAt(i),nr);
        }
        for(int i=0;i<str.length();++i){
            Integer nr = apps.get(str.charAt(i));
            if (nr==1){
                return str.charAt(i);
            }
        }
        return ' ';
    }

}
