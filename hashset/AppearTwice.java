package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class AppearTwice {
    public static int findDuplicate(int[] array){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                return array[i];
            }
            set.add(array[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.trim().split("\\s+");
        int[] inputArr=new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            inputArr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(findDuplicate(inputArr));
    }
}

// time - O(n)
// space- O(n)