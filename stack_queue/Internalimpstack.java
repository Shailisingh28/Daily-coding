package stack_queue;

public class Internalimpstack {
    int data[];
    private static final int default_size = 10;

    Internalimpstack() {
        this(default_size);
    }

    Internalimpstack(int size) {
        data = new int[size];
    }

    int ptr = -1;

    public boolean push(int element) {
        if (ptr == data.length - 1) {
            System.out.println("Stack is fulled cannot insert");
            return false;
        }
        ptr++;
        data[ptr] = element;
        return true;
    }

    public int pop() {
        if (ptr == -1) {
            System.out.println("canot pop from empty stack");
            return -1;
        }
        return data[ptr--];
    }

    public int peek() {
        if (ptr == -1) {
            System.out.println("canot pop from empty stack");
            return -1;
        }
        return data[ptr];
    }

    public static void main(String[] args) {
        Internalimpstack obj = new Internalimpstack(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.peek());

    }
}
