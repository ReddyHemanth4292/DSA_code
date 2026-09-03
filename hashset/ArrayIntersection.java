package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayIntersection {
    public static HashSet<Integer> findIntersection(int[] array1, int[] array2){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }
        for(int i=0;i< array2.length;i++){
            if(set.contains(array2[i])){
                result.add(array2[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String[] strArr1=str1.trim().split("\\s+");
        String[] strArr2=str2.trim().split("\\s+");
        int[] arr1=new int[strArr1.length];
        int[] arr2=new int[strArr2.length];
        for(int i=0;i<strArr1.length;i++){
            arr1[i]=Integer.parseInt(strArr1[i]);
        }
        for(int i=0;i<strArr2.length;i++){
            arr2[i]=Integer.parseInt(strArr2[i]);
        }

        HashSet<Integer> set=findIntersection(arr1,arr2);
        for(int i : set){
            System.out.print(i+" ");
        }
    }
}

//time: O(N)
//space:O(N)