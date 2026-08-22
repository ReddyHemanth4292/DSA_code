package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    public static boolean findTwoSumOptimized(int[] array, int target){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i< array.length;i++){
            int required = target - array[i];
            if(set.contains(required)){
                return true;
            }
            set.add(array[i]);
        }
        return false;
        
    }
    public static boolean findTwoSum(int[] array,int target){
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]+array[j]==target) return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        //System.out.println(findTwoSum(inputArray,target));
        System.out.println(findTwoSumOptimized(inputArray,target));
    }
}