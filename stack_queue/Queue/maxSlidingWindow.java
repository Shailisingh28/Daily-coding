package stack_queue.Queue;

import java.util.Arrays;
import java.util.Stack;

public class maxSlidingWindow {
    public static int[] maxSlidingWindow(int arr[], int k) {
        int next[] = nexgreater(arr);
        int ans[] = new int[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;// 0
            while (next[j] < k + i) {
                j = next[j];// 1
            }
            ans[i] = arr[j];
        }
        return ans;
    }

    public static int[] nexgreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int next[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
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

    public static void main(String[] args) {
        int[] arr = { 4, 0, -1, 3, 5, 3, 6, 8 };
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));

    }
}
