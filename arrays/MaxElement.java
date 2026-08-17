package arrays;

import java.util.Scanner;

public class MaxElement{
    public static int getMaxElement(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println(getMaxElement(inputArray));
    }
}

// time: O(n)
// space: O(1)