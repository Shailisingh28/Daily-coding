package stack_queue.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelement {
    public static Queue<Integer> reverse(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size() || k <= 0) {
            return queue;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int remaining = queue.size() - k;
        for (int i = 0; i < remaining; i++) {
            queue.add(queue.remove());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);
        Queue<Integer> reverse = reverse(queue, 1);
        int size = reverse.size();
        for (int i = 0; i < size; i++) {
            System.out.print(reverse.remove() + " ");
        }
    }
}
