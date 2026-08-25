package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] array){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                return true;
            }
            set.add(array[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr= str.trim().split("\\s+");
        int[] arr=new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(containsDuplicate(arr));
    }
}