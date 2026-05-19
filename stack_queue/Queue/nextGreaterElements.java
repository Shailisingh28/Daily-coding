package stack_queue.Queue;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElements {
    public static int[] nextGreaterElements(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i % arr.length]) {
                stack.pop();
            }
            if (i < arr.length) {
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(arr[i % arr.length]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3 };
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
