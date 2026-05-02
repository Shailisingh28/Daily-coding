package stack_queue;

public class CircularQueue {
    int data[];
    private static final int default_size = 10;
    int front = 0;
    int end = 0;
    int size = 0;

    CircularQueue() {
        this(default_size);
    }

    CircularQueue(int size) {
        data = new int[size];
    }

    public boolean add(int element) {
        if (size == data.length) {
            System.out.println("Full");
            return false;
        }
        data[end++] = element;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() {
        if (size == 0) {
            System.out.println("Empty queue");
            return -1;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.remove();
        queue.add(5);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
