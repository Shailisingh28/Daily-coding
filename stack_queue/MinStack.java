package stack_queue;

import java.util.Stack;

public class MinStack {
    public static int MinStack(int arr[]) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> support = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            original.push(arr[i]);
            if (!support.isEmpty() && arr[i] > support.peek()) {
                support.push(support.peek());
            } else {
                support.push(arr[i]);
            }
        }
        return support.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 9, 2 };
        System.out.println(MinStack(arr));
    }
}
