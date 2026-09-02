package bitManipulation;

import java.util.Scanner;

public  class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n>0 && (n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
// Time: O(1)
//Space; O(1)