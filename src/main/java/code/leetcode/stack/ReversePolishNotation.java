package code.leetcode.stack;

import java.util.Stack;

/*
* You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.


Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
* */
public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println("ideal output:9, actual output is:"+evalRPN(args));
    }
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for (String str:tokens){
            int num1,num2;
            switch (str){
                case "+":
                    num1=stack.pop();
                    num2 = stack.pop();
                    stack.add(num1+num2);
                    break;
                case "-":
                    num1=stack.pop();
                    num2 = stack.pop();
                    stack.add(num2-num1);
                    break;
                case "*":
                    num1=stack.pop();
                    num2 = stack.pop();
                    stack.add(num1*num2);
                    break;
                case "/":
                    num1=stack.pop();
                    num2 = stack.pop();
                    stack.add(num2/num1);
                    break;
                default:
                    stack.add(Integer.parseInt(str));
                    break;
            }
        }
        return stack.pop();
    }
}
