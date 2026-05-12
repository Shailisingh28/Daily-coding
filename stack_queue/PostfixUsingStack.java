package stack_queue;

import java.util.Stack;

public class PostfixUsingStack {
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    public static String operation(String val1, String val2, char op) {
        switch (op) {
            case '+':
                return val1 + val2 + op;
            case '-':
                return val1 + val2 + op;
            case '*':
                return val1 + val2 + op;
            case '/':
                return val1 + val2 + op;
        }
        return "";
    }

    public static String PostfixUsingStack(String str) {
        Stack<String> val = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                String s = "" + ch;
                val.push(s);
            } else if (operator.isEmpty() || ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char op = operator.pop();
                    val.push(operation(val1, val2, op));
                }
                operator.pop();
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char op = operator.pop();
                    val.push(operation(val1, val2, op));
                }
                operator.push(ch);
            }
        }
        while (!operator.isEmpty()) {
            String val2 = val.pop();
            String val1 = val.pop();
            char op = operator.pop();
            val.push(operation(val1, val2, op));
        }
        return val.peek();
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(PostfixUsingStack(str));
    }
}
