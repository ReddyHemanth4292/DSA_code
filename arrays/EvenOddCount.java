package arrays;

import java.util.Scanner;

public class EvenOddCount {

    public static int getEvenCount(int[] array){
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                cnt++;
            }
        }
        return cnt;
    }

    public static int getOddCount(int[] array){
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println("Even: "+ getEvenCount(inputArray));
        System.out.println("Odd: "+ getOddCount(inputArray));
    }
}

//Time  → O(n)
//Space → O(1)