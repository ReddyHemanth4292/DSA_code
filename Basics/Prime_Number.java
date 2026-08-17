package Basics;

import java.util.Scanner;

public class Prime_Number{
    public static boolean isPrime2(int num) {
    if (num < 2) {
        return false;
    }

    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        boolean flag=true;
        int mid= num/2;
        for(int i=mid;i>1;i--){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(isPrime(input)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }

}

// time complexity : O(n)
// space complexity : O(1)