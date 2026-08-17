package arrays;

import java.util.Scanner;

public class ElementFrequency {
    public static int getFrequency(int[] array, int num){
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
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
        int number=sc.nextInt();
        System.out.println(getFrequency(inputArray, number));
    }
}

// time: O(N)
// space: O(1)