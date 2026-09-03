package bitManipulation;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int n){
        if((n&1)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEven(n));
    }
}

// Time - O(1)
// Space- O(1)