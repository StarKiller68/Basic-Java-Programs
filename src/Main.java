import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "aaa";

        checkVowel(input);
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


}