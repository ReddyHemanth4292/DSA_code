package arrays;

import java.util.Scanner;

public class ArraySum {
    public static long getArraySum(int[] array){
        long sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println(getArraySum(inputArray));
    }
}

// time: O(n)
// space: O(1)