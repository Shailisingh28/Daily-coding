package stack_queue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;

    MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int element) {
        queue.add(element);
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
        return queue.remove();
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
        int top = queue.peek();
        queue.add(queue.remove());
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {

    }
}
