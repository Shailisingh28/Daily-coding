package stack_queue;

public class CustomQueue {
    int data[];
    private static final int default_size = 10;
    int end = -1;

    CustomQueue() {
        this(default_size);
    }

    CustomQueue(int size) {
        data = new int[size];
    }

    public boolean add(int element) {
        if (end == data.length - 1) {
            System.out.println("Queue is full");
            return false;
        }
        end++;
        data[end] = element;
        return true;
    }

    public int remove() {
        if (end == -1) {
            System.out.println("Empty Queue");
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i <= end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() {
        if (end == -1) {
            System.out.println("Empty Stack");
            return -1;
        }
        return data[0];
    }

    public int last() {
        if (end == -1) {
            System.out.println("Empty Stack");
            return -1;
        }
        return data[data.length - 1];
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(4);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
