package stack_queue.Queue;

import java.util.Arrays;
import java.util.Stack;

public class nextLargerElement {
    public static int[] nextLargerElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
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
        int[] arr = { 1, 3, 2, 4 };
        System.out.println(Arrays.toString(nextLargerElement(arr)));
    }
}
