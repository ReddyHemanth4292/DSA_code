package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t){
        if(s==null || s.isEmpty() || t==null || t.isEmpty() || s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)) ){
                if(!set.contains(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }
                else{
                    return false;
                }
            }
            else{
                if(map.get(s.charAt(i))!= t.charAt(i) ){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(isIsomorphic(str1,str2));
    }
}

// time: O(n)
// space: O(n)