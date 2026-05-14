package stack_queue;

import java.util.Stack;

public class EvaluationOfPostfix {
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

    public static int EvaluationOfPostfix(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                stack.push(ch - '0');
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(operation(val1, val2, ch));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println(EvaluationOfPostfix(str));
    }
}
