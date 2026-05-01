package stack_queue;

public class CustomSatck {
    public static void main(String[] args) {
        Internalimpstack stack = new Internalimpstack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
