package strings;

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequent {
    public static Character findMostFrequentCharacter(String s){
        if(s.isEmpty()){
            return null;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        char maxElement=s.charAt(0);
        int maxValue=map.get(maxElement);
        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(i))>maxValue){
                maxElement=s.charAt(i);
                maxValue=map.get(s.charAt(i));
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Character ans=findMostFrequentCharacter(str);
        if(ans==null){
            System.out.println("String is Empty");
        }
        else{
            System.out.println(ans);
        }
    }
}

// time - O(N)
// space - O(N)