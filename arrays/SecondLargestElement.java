package arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondLargest(int[] array){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                secondMax=max;
                max=array[i];
            }
            else if(max>array[i] && array[i]>secondMax){
                secondMax=array[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        int ans=findSecondLargest(inputArray);
        if(ans==Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }
        else{
        System.out.println(findSecondLargest(inputArray));
        }
    }
}

// time: O(N)
// space: O(1)