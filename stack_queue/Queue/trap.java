package stack_queue.Queue;

import java.util.Stack;

public class trap {
    public static int trap(int arr[]) {
        int next[] = nextGreater(arr);
        int pre[] = preGreater(arr);
        int totalWater = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.min(next[i], pre[i]) == -1)
                continue;
            totalWater += Math.min(next[i], pre[i]) - arr[i];
        }
        return totalWater;
    }

    public static int[] nextGreater(int arr[]) {
        int next[] = new int[arr.length];
        next[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            next[i] = Math.max(next[i + 1], arr[i]);
        }
        return next;
    }

    public static int[] preGreater(int arr[]) {
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = Math.max(arr[i], pre[i - 1]);
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}
