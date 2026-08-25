package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedWord {
    public static String findFirstRepeatedWord(String sentence){
        String[] strArr=sentence.trim().split("\\s+");
        HashSet<String> set=new HashSet<>();
        for(int i=0;i< strArr.length;i++){
            if(set.contains(strArr[i])){
                return strArr[i];
            }
            set.add(strArr[i]);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=findFirstRepeatedWord(str);
        if(ans==null){
            System.out.println("No raepeated word");
        }
        else{
            System.out.println(ans);
        }
    }
}