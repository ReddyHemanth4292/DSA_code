package arrays;

import java.util.Scanner;

public class MinElement {
public static int getMinElement(int[] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println(getMinElement(inputArray));
    }
}

// Time  → O(n)
// Space → O(1)