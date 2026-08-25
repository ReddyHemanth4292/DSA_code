package arrays;

import java.util.Scanner;

public class LargeAndSecLarge {
    public static void findLargeAndSecLarge(int[] array){
//        if(array.length==0){
//            System.out.println("Array is Empty");
//            return;
//        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                secMax=max;
                max=array[i];
            } else if (max>array[i] && array[i]>secMax) {
                secMax=array[i];
            }
        }
        if(secMax==Integer.MIN_VALUE){
            System.out.println("No second largest element");
            return;
        }
        System.out.println("Largest: "+ max);
        System.out.println("Second Largest: "+ secMax);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.isEmpty()){
            System.out.println("Given array is Empty");
            return;
        }
        String[] inputArray=str.split("\\s+");
        int[] arr=new int[inputArray.length];
        int i=0;
        for(String inp:inputArray){
            arr[i]=Integer.parseInt(inp);
            i++;
        }
        findLargeAndSecLarge(arr);
    }
}

//time: O(n)
//space: O(1)