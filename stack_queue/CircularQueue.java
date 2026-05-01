package stack_queue;

public class CircularQueue {
    int data[];
    private static final int default_size = 10;
    int front = 0;
    int end = 0;
    int size = 0;

    public CircularQueue() {
        this(default_size);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean add(int element) {
        if (data.length == size) {
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = element;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() {
        if (data.length == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = data[front++];
        front = front % size;
        size--;
        return removed;
    }
}
