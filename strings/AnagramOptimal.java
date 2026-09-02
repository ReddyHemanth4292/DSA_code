package strings;

import java.util.Scanner;

public class AnagramOptimal {
    public static boolean isAnagram(String s, String t){
        if(s==null || t==null || s.length()!=t.length()){
            return false;
        }
        int[] array=new int[26];
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            array[t.charAt(i)-'a']--;
        }
        for(int i=0;i< array.length;i++){
            if(array[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1.toLowerCase(),s2.toLowerCase()));
    }
}

//time-O(n)
//space - O(1)