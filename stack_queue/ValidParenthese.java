package stack_queue;

import java.util.Stack;

public class ValidParenthese {
    public static boolean ValidParenthese(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                if (!stack.isEmpty()) {
                    if (ch != stack.pop()) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")";
        System.out.println(ValidParenthese(s));
    }
}
