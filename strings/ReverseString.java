package strings;

import java.util.Scanner;

public class ReverseString {
    public static  String reverseString(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static String reverse(String s){
        char[] charArr=s.toCharArray();
        int i=0;
        int j=charArr.length-1;
        while(i<j){
            char temp=charArr[i];
            charArr[i]=charArr[j];
            charArr[j]=temp;
            i++;
            j--;
        }
        return new String(charArr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //System.out.println(reverse(str));
        System.out.println(reverseString(str));
    }
}

// space : O(N);
// time : O(n)