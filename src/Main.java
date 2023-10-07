import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;

        swapNumberSelf(x, y);
        System.out.println();

        System.out.println("x is " + x + " : " + "y is " + y);


    }

    public static String reverseStringStringBuilder(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    public static void checkVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                System.out.println("Given string contains " + input.charAt(i) + " at the index " + i);
            }
        }
    }

    public static int vowelCountIter(char chars)
    {
        if (chars == 'a' || chars == 'e' || chars == 'i'
                || chars == 'o' || chars == 'u') {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int vowelCountRecur(String str, int l)
    {
        if (l == 1) {
            return vowelCountIter(str.charAt(l - 1));
        }

        return vowelCountRecur(str, l - 1)
                + (str.charAt(l - 1));
    }

    public static void vowelCountArraylist(String str){
        str = str.toLowerCase();
        int count = 0;
        String vow ="aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))){
                count++;
            }
        }

        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
    }

    public static void swapNumNoThird(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x is " + x + " : " + "y is " + y);
    }

    public static void swapNumNoThirdXOR(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x is " + x + " : " + "y is " + y);
    }

    // The following method is useful if there is a case
    // where a number is swapping with itself
    public static void swapNumberSelf(int xp, int yp)
    {
        if (xp == yp) // Check if the two addresses are same
             System.out.println("x is " + xp + " : " + "y is " + yp);
            //return;
        xp = xp + yp;
        yp = xp - yp;
        xp = xp - yp;
        System.out.println("x is " + xp + " : " + "y is " + yp);
    }

    public static void swapNoThirdOneLine(int x, int y)
    {
        x = (x * y) / (y = x);
        System.out.println("x is " + x + " : " + "y is " + y);
    }

    public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static boolean isPrimeImprov(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static boolean isPrimeOpt(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i < Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static boolean isContainOnlyOddNumbers(List<Integer> list){
        for(int i : list){
            if(i%2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isContainOnlyOddNumbersLambda(List<Integer> list){
        return list.stream().noneMatch(no->no%2==0);
    }

    public static int fibRecursion(int n)
    {
        if (n <= 1)
            return n;
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void PrintFibonacciIter(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static boolean isPalindromeNumber(int number){
        int reversed_n = 0;
        while (number > 0) {
            reversed_n = reversed_n * 10 + number % 10;
            number = number / 10;
        }
        if(reversed_n == number)
            return true;
        else
            return false;
    }

    public static int reverseNumber(int number){
        int reversed_n = 0;
        while (number > 0) {
            reversed_n = reversed_n * 10 + number % 10;
            number = number / 10;
        }
        return reversed_n;
    }





}