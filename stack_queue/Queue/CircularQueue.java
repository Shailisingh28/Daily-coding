package stack_queue.Queue;

public class CircularQueue {
    int data[];
    int size = 0;
    int front = 0;
    int rear = -1;
    static int default_size = 10;

    CircularQueue() {
        this(default_size);
    }

    CircularQueue(int size) {
        data = new int[size];
    }

    public void add(int element) {
        if (size == data.length) {
            throw new RuntimeException("Full Queue");
        }
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Empty Queue");
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;

    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Empty Queue");
        }
        return data[front];
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.remove());
        queue.add(5);
        System.out.println();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
