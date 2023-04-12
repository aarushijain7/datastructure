package code.leetcode.stack;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s,t;

        s = "y#fo##f"; t = "y#f#o##f";
        System.out.println(backspaceCompare(s,t));

        s = "ab#c"; t = "ad#c";
        System.out.println(backspaceCompare(s,t));
        s = "a#c";t = "b";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        s=getProcessedString(s);
        t=getProcessedString(t);
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }

    }
    public static String getProcessedString(String s){
        if(s.equals("#")) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();
        for (char ch:characters){
            if(ch=='#' ){
                if(!stack.isEmpty())
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        StringBuilder string = new StringBuilder();
        while(!stack.isEmpty()){
            string.append(stack.pop());
        }
        return string.toString();
    }
}
