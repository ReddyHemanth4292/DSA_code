package arrays;

import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void print(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void moveZeros(int[] array){
        int index=0;
        for(int i=0;i< array.length;i++){
            if(array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        for(int i=index;i< array.length;i++){
            array[i]=0;
        }
        print(array);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        moveZeros(inputArray);
    }
}

// Time: O(n)
// Space: O(1)