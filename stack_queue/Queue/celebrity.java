package stack_queue.Queue;

import java.util.Stack;

public class celebrity {
    public static int celebrity(int arr[][]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int val1 = stack.pop();
            int val2 = stack.pop();

            if (arr[val1][val2] == 1) {
                stack.push(val2);
            } else {
                stack.push(val1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (stack.peek() != i) {
                if (arr[stack.peek()][i] == 1 || arr[i][stack.peek()] == 0) {
                    return -1;
                }
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 } };
        System.out.println(celebrity(mat));
    }
}
