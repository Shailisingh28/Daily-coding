package stack_queue;

public class StackUsingArray {
    int data[];
    private final static int default_size = 10;

    StackUsingArray() {
        this(default_size);
    }

    StackUsingArray(int size) {
        data = new int[size];
    }

    int i = -1;

    public void push(int element) {
        if (i == data.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        data[++i] = element;
    }

    public int peek() {
        if (i == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return data[i];
    }

    public int pop() {
        if (i == -1) {
            throw new RuntimeException("Stack is empty");

        }
        return data[i--];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
