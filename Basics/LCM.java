package Basics;

import java.util.Scanner;

public class LCM{
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        int large= Math.max(a, b);
        int small=Math.min(a, b);
        return GCD(small, large%small);
    }
    public static int getLCM(int a, int b){
        return (a / GCD(a,b)) * b;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(getLCM(a,b));
    }
}

//time: O(min(a,b))
// space: O(1)