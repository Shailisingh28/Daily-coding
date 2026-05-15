package stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class maxSlidingWindow {
    public static int[] nextGreaterElement(int arr[]) {
        int greater[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                greater[i] = arr.length;
            } else {
                greater[i] = stack.peek();
            }
            stack.push(i);

        }
        return greater;
    }

    public static int[] maxSlidingWindow(int arr[], int k) {
        int ans[] = new int[arr.length - k + 1];
        int greater[] = nextGreaterElement(arr);
        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (greater[j] < i + k) {
                j = greater[j];
            }
            ans[i] = arr[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
