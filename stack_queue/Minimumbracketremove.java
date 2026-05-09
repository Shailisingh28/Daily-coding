package stack_queue;

import java.util.Stack;

public class Minimumbracketremove {
    public static int Minimumbracketremove(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        return count + stack.size();
    }

    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(Minimumbracketremove(s));
    }
}
