package stack_queue;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean BalancedBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")()()(";
        System.out.println(BalancedBrackets(s));
    }
}
