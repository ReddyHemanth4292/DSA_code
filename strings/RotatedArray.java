package strings;

import java.util.Scanner;

public class RotatedArray {
    public static boolean isRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String concatStr=s1+s1;
        return concatStr.contains(s2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isRotation(str1,str2));
    }
}

//time: O(N)
//space: O(1)