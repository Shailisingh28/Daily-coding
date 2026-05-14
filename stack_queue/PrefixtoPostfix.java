package stack_queue;

import java.util.Stack;

public class PrefixtoPostfix {
    public static String evaluate(String val1, String val2, char operator) {
        switch (operator) {
            case '+':
                return val1 + val2 + operator;
            case '-':
                return val1 + val2 + operator;
            case '*':
                return val1 + val2 + operator;
            case '/':
                return val1 + val2 + operator;
        }
        return "";
    }

    public static String PrefixtoPostfix(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                String s = "" + str.charAt(i);
                stack.push(s);
            } else {
                String val1 = stack.pop();
                String val2 = stack.pop();
                char op = str.charAt(i);
                stack.push(evaluate(val1, val2, op));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println(PrefixtoPostfix(str));
    }
}
