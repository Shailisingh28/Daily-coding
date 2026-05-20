package stack_queue.Queue;

import java.util.Stack;

public class sumSubarrayMins {
    public static int sumSubarrayMins(int arr[]) {
        int pre[] = preSmaller(arr);
        int next[] = nextSmaller(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += (arr[i] * ((i - pre[i]) * (next[i] - i)));
        }
        return count;
    }

    public static int[] nextSmaller(int arr[]) {
        int next[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                next[i] = arr.length;
            } else {
                next[i] = stack.peek();
            }
            stack.push(i);
        }
        return next;
    }

    public static int[] preSmaller(int arr[]) {
        int pre[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                pre[i] = -1;
            } else {
                pre[i] = stack.peek();
            }
            stack.push(i);
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        System.out.println(sumSubarrayMins(arr));
    }
}
