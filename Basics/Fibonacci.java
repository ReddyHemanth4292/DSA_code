package Basics;

import java.util.Scanner;

public class Fibonacci{
    public static void printFibonacci(int num){
        int prev2=0;
        int prev1=1;
        int curr;
        for(int i=0;i<num;i++){
            if(i<2){
                System.out.println(i+" ");
            }
            else{
                curr=prev1+prev2;
                System.out.println(curr+" ");
                prev2=prev1;
                prev1=curr;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        printFibonacci(input);
    }
}

// time complexity - O(N)
// space complexity - O(1)