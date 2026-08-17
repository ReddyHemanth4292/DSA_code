package Basics;

import java.util.Scanner;

public class Palindrome {
    public static int reverse(int num){
        int rev=0; 
        while(num>0){
            int reminder=num%10;
            rev= rev*10+reminder;
            num/=10;
        }
        return rev;
    }
    public static boolean isPalindrome(int num){
        int revNum=reverse(num);
    return num==revNum;
}
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        if(isPalindrome(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}