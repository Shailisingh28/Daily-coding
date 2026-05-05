package stack_queue;

import java.util.Stack;

public class minInsertions {
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int add = 0;
        int count = 0;
        int close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else {
                if (!stack.isEmpty()) {
                    count++;
                    if (count == 2) {
                        stack.pop();
                        count = 0;
                    }
                } else {
                    close++;
                    if (close == 2) {
                        add++;
                    }
                }
            }
        }
        return stack.size() + 2 * add;
    }

    public static void main(String[] args) {
        String s = "))())(";
        System.out.println(minInsertions(s));
    }
}
