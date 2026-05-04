package stack_queue;

import java.util.Stack;

public class minAddToMakeValid {
    public static int minAddToMakeValid(String s) {
        Stack<Character> close = new Stack<>();
        int add = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                close.push(ch);
            } else {
                if (!close.isEmpty()) {
                    close.pop();
                } else {
                    add++;
                }
            }
        }
        return close.size() + add;
    }

    public static void main(String[] args) {
        String s = "()))";
        System.out.println(minAddToMakeValid(s));
    }
}
