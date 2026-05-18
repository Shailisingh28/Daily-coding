package stack_queue.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Interleave {
    public Queue<Integer> interleave(Queue<Integer> queue) {
        int n = queue.size();
        if (n % 2 != 0) {
            throw new RuntimeException("Not applicable for odd length");
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n / 2; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < n / 2; i++) {
            queue.add(queue.remove());
        }
        for (int i = 0; i < n / 2; i++) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
            queue.add(queue.remove());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 8; i++) {
            queue.add(i);
        }

        Interleave obj = new Interleave();

        System.out.println(obj.interleave(queue));
    }
}
