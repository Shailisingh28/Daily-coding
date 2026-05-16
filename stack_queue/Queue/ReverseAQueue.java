package stack_queue.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {

    public static Queue<Integer> reverse(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        int size = queue.size();

        for (int i = 0; i < size; i++) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        int size = queue.size();

        for (int i = 0; i < size; i++) {
            System.out.println(queue.remove());
        }

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        reverse(queue);

        System.out.println("After reverse");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}