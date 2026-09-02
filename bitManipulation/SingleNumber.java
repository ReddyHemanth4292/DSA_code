package bitManipulation;

import java.util.Scanner;

public class SingleNumber {
    public static int findSingleNumber(int[] array){
        int xor=0;
        for(int i:array){
            xor^=i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.trim().split("\\s+");
        int[] inputArr=new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            inputArr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(findSingleNumber(inputArr));

    }
}

// Time: O(N)
// Space: O(1)