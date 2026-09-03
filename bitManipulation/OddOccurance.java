package bitManipulation;

import java.util.Scanner;

public class OddOccurance {
    public static int findOddOccurring(int[] array){
        int result=0;
        for(int i:array){
            result^=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.trim().split("\\s+");
        int[] arr=new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(findOddOccurring(arr));
    }
}

// space- O(1)
// time - O(n)