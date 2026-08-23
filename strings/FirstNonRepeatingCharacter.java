package strings;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static Character findFirstNonRepeating(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        Character result=findFirstNonRepeating(str);
        if(result==null){
            System.out.println("No non-repeating character");
        }
        else{
            System.out.println(result);
        }
    }
}

// time: o(n)
//space: O(n)