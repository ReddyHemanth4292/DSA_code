package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicate {
    public static Integer findFirstDuplicate(int[] array){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                return array[i];
            }
            set.add(array[i]);

        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.trim().split("\\s+");
        int[] arr=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i]);
        }
        Integer ans=findFirstDuplicate(arr);
        if(ans==null){
            System.out.println("No duplicate");
        }
        else{
            System.out.println(ans);
        }
    }
}

// time: O(N)
// space:O(N)