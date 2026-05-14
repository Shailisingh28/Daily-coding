package stack_queue;

import java.util.Stack;

public class PostfixtoInfix {
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

    public static String PostfixtoInfix(String str) {
        Stack<String> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                String s = "" + ch;
                stack.push(s);
            } else {
                String val2 = stack.pop();
                String val1 = stack.pop();
                char operator = ch;
                stack.push(operation(val1, val2, operator));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println(PostfixtoInfix(str));
    }
}
