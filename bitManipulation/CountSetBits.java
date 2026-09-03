package bitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static int countSetBits(int n){
        int cnt=0;
        while(n>0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countSetBits(n));
    }
}

//space: O(1)
// time: O(number of set bits)