import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "aaa";

        vowelCountArraylist(input);
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


}