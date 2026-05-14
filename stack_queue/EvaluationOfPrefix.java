package stack_queue;

import java.util.Stack;

public class EvaluationOfPrefix {
    public static int operation(int val1, int val2, char operator) {
        switch (operator) {
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

    public static int EvaluationOfPrefix(String str) {
        Stack<Integer> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                stack.push(str.charAt(i) - '0');
            } else {
                stack.push(operation(stack.pop(), stack.pop(), str.charAt(i)));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println(EvaluationOfPrefix(str));
    }
}
