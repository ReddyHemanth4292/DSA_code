package bitManipulation;

import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int n, int[] array){
        int xor=0;
        for(int a :array){
            xor^=a;
        }
        for(int i=1;i<=n;i++){
            xor^=i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        int n=sc.nextInt();
        String[] strArr=str.trim().split("\\s+");
        int[] inputArr=new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            inputArr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(findMissingNumber(n,inputArr));
    }
}

//Time: O(n)
//space: O(1)