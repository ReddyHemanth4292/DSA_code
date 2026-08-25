package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void findIntersection(int[] array1, int[] array2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int i: array1){
            set1.add(i);
        }

        for(int i:array2){
            if(set1.contains(i)){
                result.add(i);
            }
        }
        if(result.isEmpty()){
            System.out.println("No common elements");
            return;
        }
        for(int i: result){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String[] strArr1= str1.trim().split("\\s+");
        String[] strArr2=str2.trim().split("\\s+");
        int[] arr1=new int[strArr1.length];
        int[] arr2=new int[strArr2.length];
        for(int i=0;i<strArr1.length;i++){
            arr1[i]=Integer.parseInt(strArr1[i]);
        }
        for(int i=0;i<strArr2.length;i++){
            arr2[i]=Integer.parseInt(strArr2[i]);
        }

        findIntersection(arr1,arr2);
     }
}

//time: O(n)
//space: O(n)