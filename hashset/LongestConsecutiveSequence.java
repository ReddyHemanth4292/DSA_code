package hashset;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive2(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i< array.length;i++){
            set.add(array[i]);
        }
        int maxLength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    public static int longestConsecutive(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        Arrays.sort(array);
        int maxLength=1;
        int length=1;
        for(int i=1;i< array.length;i++){
            if(array[i]==array[i-1]){
                continue;
            }
            if(array[i]-array[i-1]==1 ){
                length++;
            }else {
                maxLength=Math.max(length,maxLength);
                length=1;
            }
        }
        return Math.max(length,maxLength);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.trim().split("\\s+");
        int[] array=new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            array[i]=Integer.parseInt(strArr[i]);
        }
        //System.out.println(longestConsecutive(array));
        System.out.println(longestConsecutive2(array));
    }
}

// time: O(n2)
// space : O(1)