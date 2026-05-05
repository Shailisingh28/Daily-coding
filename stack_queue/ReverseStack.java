package stack_queue;

import java.util.Stack;

public class ReverseStack {

    public static void reverse(Stack<Integer> original) {
        if (original.isEmpty())
            return;
        int top = original.pop();
        reverse(original);
        puchAtback(original, top);
    }

    public static void puchAtback(Stack<Integer> original, int x) {
        Stack<Integer> help = new Stack<>();
        if (original.isEmpty()) {
            original.push(x);
            return;
        }
        while (!original.isEmpty()) {
            help.push(original.pop());
        }
        original.push(x);
        while (!help.isEmpty()) {
            original.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original: " + stack);

        reverse(stack);

        System.out.println("Reversed: " + stack);
    }
}
