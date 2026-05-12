package stack_queue;

import java.util.Stack;

public class PrefixUsingStack {
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        }
        return 0;
    }

    public static String operation(String v1, String v2, char op) {
        switch (op) {
            case '+':
                return op + v1 + v2;
            case '-':
                return op + v1 + v2;
            case '*':
                return op + v1 + v2;
            case '/':
                return op + v1 + v2;
        }
        return "";
    }

    public static String PrefixUsingStack(String str) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                String s = "" + ch;
                val.push(s);
            } else if (op.isEmpty() || ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    val.push(operation(val1, val2, operator));
                }
                op.pop();
            } else {
                while (!op.isEmpty() && op.peek() != '(' && precedence(ch) <= precedence(op.peek())) {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    val.push(operation(val1, val2, operator));
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            String val2 = val.pop();
            String val1 = val.pop();
            char operator = op.pop();
            val.push(operation(val1, val2, operator));
        }
        return val.peek();

    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(PrefixUsingStack(str));
    }
}
