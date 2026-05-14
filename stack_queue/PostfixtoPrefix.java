package stack_queue;

import java.util.Stack;

public class PostfixtoPrefix {
    public static String operation(String val1, String val2, char operator) {
        switch (operator) {
            case '+':
                return operator + val1 + val2;
            case '*':
                return operator + val1 + val2;
            case '/':
                return operator + val1 + val2;
            case '-':
                return operator + val1 + val2;
        }
        return "";
    }

    public static String PostfixtoPrefix(String str) {
        Stack<String> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                String s = "" + (ch - '0');
                stack.push(s);
            } else {
                String val2 = stack.pop();
                String val1 = stack.pop();
                stack.push(operation(val1, val2, ch));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println(PostfixtoPrefix(str));
    }
}
