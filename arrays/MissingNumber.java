package arrays;

import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int n,int[] array){
        long expectedSum=(long)n*(n+1)/2;
        long currSum=0;
        for(int i=0;i<array.length;i++){
            currSum+=array[i];
        }
        return (int)(expectedSum-currSum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size-1];
        for(int i=0;i<size-1;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println(findMissingNumber(size , inputArray));
    }
}

// Time: O(N)
// space: O(1)