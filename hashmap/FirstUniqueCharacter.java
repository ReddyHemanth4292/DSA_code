package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static int firstUniqueCharacter(String s){
        if(s==null || s.isEmpty()){
            return -1;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(firstUniqueCharacter(str));
    }
}

// Time : O(N)
// Space : O(N)