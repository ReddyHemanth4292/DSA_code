package Basics;

import java.util.Scanner;

public class GCD{
    public static int getGCD(int a, int b){
        int small=Math.min(a, b);
        for(int i=small;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }

        return 1;
    }
    public static int euclideanGCD(int a, int b){
        if(b==0){
            return a;
        }
        int large= Math.max(a, b);
        int small=Math.min(a, b);
        return euclideanGCD(small, large%small);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(euclideanGCD(a,b));
    }
}

// Time: O(min(a,b))
// Space: O(1)