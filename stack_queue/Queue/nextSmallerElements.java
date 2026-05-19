package stack_queue.Queue;

import java.util.Arrays;
import java.util.Stack;

public class nextSmallerElements {
    public static int[] nextSmallerElements(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7 };
        System.out.println(Arrays.toString(nextSmallerElements(arr)));
    }
}
