package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static int findMajorityElement(int[] array){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: array){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if (map.get(i)> array.length/2) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.trim().split("\\s+");
        int[] arr=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i]);
        }

        System.out.println(findMajorityElement(arr));
    }
}

// time : O(n)
// apace : O(n)