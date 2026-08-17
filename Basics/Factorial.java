package Basics;

import java.util.Scanner;

public class Factorial{
    public static long getFactorial(int num){
        long ans=1;
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(getFactorial(input));
    }
}

// time complexity - O(n)
// space complexity - O(1)