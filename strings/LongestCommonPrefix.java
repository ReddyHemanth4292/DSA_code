package strings;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i< strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if (str.trim().isEmpty()) {
            System.out.println("");
            return;
        }
        String[] strArr=str.trim().split("\\s+");
        System.out.println(longestCommonPrefix(strArr));
    }
}

// O(N)
//O(1)