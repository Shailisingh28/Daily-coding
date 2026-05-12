package stack_queue;

import java.util.Stack;

class InfixUsingStack {
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    public static int operation(int val1, int val2, char op) {
        switch (op) {
            case '+':
                return val1 + val2;
            case '-':
                return val1 - val2;
            case '*':
                return val1 * val2;
            case '/':
                return val1 / val2;
        }
        return 0;
    }

    public static int InfixUsingStack(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                val.push(ch - '0');
            } else if (operator.isEmpty() || ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    char op = operator.pop();
                    val.push(operation(val1, val2, op));
                }
                operator.pop();
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    char op = operator.pop();
                    val.push(operation(val1, val2, op));
                }
                operator.push(ch);
            }
        }
        while (val.size() > 1) {
            int val2 = val.pop();
            int val1 = val.pop();
            char op = operator.pop();
            val.push(operation(val1, val2, op));
        }
        return val.peek();
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(InfixUsingStack(str));
    }

}