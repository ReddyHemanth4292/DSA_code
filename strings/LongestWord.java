package strings;

import java.util.Scanner;
public class LongestWord {
    public static String findLongestWord(String s){
        if (s == null || s.trim().isEmpty()) {
            return "";
        }
        String[] words=s.split("\\s+");
        int maxLength=0;
        String longestWord="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>maxLength){
                longestWord=words[i];
                maxLength=longestWord.length();
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        System.out.println(findLongestWord(line));
    }
}

//space: O(N)
//time: O(n)