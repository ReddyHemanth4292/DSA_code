package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountVowels {
    public static void countVowelsAndConsonants(String s){
        int vowelsCnt=0;
        int consonantsCnt=0;
        List<Character> vowelsList=new ArrayList<>(List.of('a','e','i','o','u'));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || !Character.isLetter(s.charAt(i))){
                continue;
            }
            char ch=Character.toLowerCase(s.charAt(i));
            if(vowelsList.contains(ch)){
                vowelsCnt++;
            }
            else {
                consonantsCnt++;
            }
        }
        System.out.println("Vowels: "+ vowelsCnt);
        System.out.println("Consonants: "+ consonantsCnt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        countVowelsAndConsonants(str);
    }
}