package code.leetcode.stack;

import java.util.Stack;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*
* */
public class ValidParentheses {
    public static void main(String[] args) {
        String s= "()[]{}";
        System.out.println(s+"is Valid:"+isValid(s));
        s="()";
        System.out.println(s+"is Valid:"+isValid(s));
        s="(]";
        System.out.println(s+"is Valid:"+isValid(s));
    }

    public static boolean isValid(String s) {
        if(s==null || s.isEmpty() || s.length()==1){
            return false;
        }
        Stack stack = new Stack<>();
        char[] charArr = s.toCharArray();
        for(char ch :charArr){
            if(ch=='}' || ch==')' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char openingbrace= (char)stack.pop();
                if((ch=='}' && openingbrace=='{') || (ch==']' && openingbrace=='[') || (ch==')' && openingbrace=='(')){
                    continue;
                }
                else {
                    return false;
                }
            }
            else {
                stack.add(ch);
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
