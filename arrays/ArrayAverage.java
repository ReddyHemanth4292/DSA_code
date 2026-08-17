package arrays;

import java.util.Scanner;

public class ArrayAverage {

    public static double getAverage(int[] array){
        long sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        double average = (double) sum / array.length;
        return average;
    }
    public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println(getAverage(inputArray));
    }
}

// time: O(N)
// Space: O(1)