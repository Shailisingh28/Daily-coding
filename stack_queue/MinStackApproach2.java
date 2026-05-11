package stack_queue;

import java.util.Stack;

public class MinStackApproach2 {
    static Stack<Integer> stack = new Stack<>();
    static int min;

    public static void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min = stack.peek();
        } else {
            if (val >= min) {
                stack.push(val);
            } else {
                stack.push(2 * val - min);
                min = val;
            }
        }
    }

    public static void pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Empty");
        } else if (stack.peek() < min) {
            min = 2 * min - stack.peek();

        }
        stack.pop();
    }

    public static int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Empty");
        } else if (stack.peek() > min) {
            return stack.peek();
        } else {
            return min;
        }
    }

    public static int getmin() {
        return min;
    }

    public static void main(String[] args) {

    }
}
