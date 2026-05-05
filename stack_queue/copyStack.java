package stack_queue;

import java.util.Stack;

public class copyStack {
    public static Stack<Integer> copyStack(Stack<Integer> original) {
        Stack<Integer> copy = new Stack<>();
        Stack<Integer> help = new Stack<>();
        while (original.size() > 0) {
            help.push(original.pop());
        }
        while (help.size() > 0) {
            copy.push(help.pop());
        }
        return copy;
    }

    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        System.out.println(original);
        Stack<Integer> copy = copyStack(original);
        System.out.println(copy);

    }
}
