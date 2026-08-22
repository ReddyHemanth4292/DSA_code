package strings;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void characterFrequency(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        map.forEach((key,value)->{
            System.out.println(key +" : "+value);
        });
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        characterFrequency(str);
    }
}