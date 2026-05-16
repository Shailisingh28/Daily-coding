package stack_queue.Queue;

public class ArrayImpofQueue {
    int data[];
    static int deafult_size = 10;
    int front = -1;
    int rear = 0;

    ArrayImpofQueue() {
        this(deafult_size);
    }

    ArrayImpofQueue(int size) {
        data = new int[size];
    }

    public void add(int element) {
        if (front == data.length - 1) {
            throw new RuntimeException("Queue is full");
        }
        data[++front] = element;
    }

    public int remove() {
        if (rear > front) {
            throw new RuntimeException("Queue is empty");
        }
        return data[rear++];
    }

    public int peek() {
        if (rear > front) {
            throw new RuntimeException("Queue is empty");
        }
        return data[rear];
    }

    public static void main(String[] args) {
        ArrayImpofQueue queue = new ArrayImpofQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
