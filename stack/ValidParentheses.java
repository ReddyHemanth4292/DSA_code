package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        List<Character> openBracketList=new ArrayList<>(List.of('{','(','['));
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(openBracketList.contains(curr)){
                stack.add(curr);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                else if((curr == '}' && stack.peek() == '{') || (curr==')' && stack.peek()=='(') || (curr==']' && stack.peek()=='[')) {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isValid(str));
    }
}

//time:O(N)
//space:O(N)