package stack_queue;

import java.util.Stack;

public class celebrity {
    public static int celebrity(int m[][]) {
        int n = m.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            int val1 = stack.pop();
            int val2 = stack.pop();
            if (m[val1][val2] == 1) {
                stack.push(val2);
            } else {
                stack.push(val1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != stack.peek()) {
                if (m[stack.peek()][i] == 1 || m[i][stack.peek()] == 0) {
                    return -1;
                }
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        int m[][] = { { 1, 1 },
                { 1, 1 },
        };
        System.out.println(celebrity(m));
    }
}
