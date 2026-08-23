package strings;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String s){
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            set.add(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeDuplicates(str));
    }
}

//time: O(N)
//Space: O(n)