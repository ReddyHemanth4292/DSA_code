package Basics;

import java.util.Scanner;

public class ArmstrongNumber{
    public static int getDigitCnt(int num){
        if (num == 0) {
            return 1;
        }
        int cnt=0;
        while(num>0){
            cnt++;
            num/=10;
        }
        return cnt;
    }
    public static boolean isArmstrongNumber(int num){
        int sum=0;
        int tempNum=num;
        int digitCnt= getDigitCnt(num);
        while(tempNum>0){
            int rem=tempNum%10;
            sum+=Math.pow(rem,digitCnt);
            tempNum/=10;
        }

        return num==sum;
    }
public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(isArmstrongNumber(input)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
}
}

// time complexity=O(d) - digit cnt (you can say O(log N))
// space complexity=O(1)