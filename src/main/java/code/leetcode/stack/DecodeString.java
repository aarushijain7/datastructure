package code.leetcode.stack;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("10[leetcode]"));
    }
    public static String decodeString(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch:chars){
            if (ch == ']') {
                StringBuilder str = new StringBuilder();
            while(!(stack.peek()=='[')){
                str.append(stack.pop());
            }
            stack.pop();
            StringBuilder times = new StringBuilder();
            while (!stack.isEmpty() && isNumeric(stack.peek()+"")){
                times.append(stack.pop());
            }
            times=times.reverse();
            int number = Integer.parseInt(times.toString());
            char[] chars1 = str.reverse().toString().toCharArray();
            for (int i=number;i>0;i--){
                for (char ch1:chars1){
                    stack.push(ch1);
                }
            }
            }
            else{
                stack.push(ch);
            }
        }

        return stack.toString().replaceAll("[^a-zA-Z]", "");
    }
    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
