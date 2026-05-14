package stack_queue;

import java.util.Stack;

public class PrefixtoInfix {
    public static String operation(String val1, String val2, char operator) {
        switch (operator) {
            case '+':
                return '(' + val1 + operator + val2 + ')';
            case '-':
                return '(' + val1 + operator + val2 + ')';
            case '*':
                return '(' + val1 + operator + val2 + ')';
            case '/':
                return '(' + val1 + operator + val2 + ')';
        }
        return "";
    }

    public static String PrefixtoInfix(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                String s = "" + str.charAt(i);
                stack.push(s);
            } else {

                stack.push(operation(stack.pop(), stack.pop(), str.charAt(i)));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println(PrefixtoInfix(str));
    }
}
