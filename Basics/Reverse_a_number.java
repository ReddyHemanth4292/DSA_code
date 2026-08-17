package Basics;
import java.util.Scanner;

public class Reverse_a_number {
    public static int reverse(int num){
        int rev=0; 
        while(num>0){
            int reminder=num%10;
            rev= rev*10+reminder;
            num/=10;
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(reverse(input));
    }
}
