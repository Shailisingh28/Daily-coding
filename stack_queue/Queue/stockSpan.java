package stack_queue.Queue;

import java.util.Arrays;
import java.util.Stack;

public class stockSpan {
    public static int[] stockSpan(int arr[], int n) {
        int[] greater = previousGreater(arr);
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = i - greater[i];
        }
        return ans;

    }

    public static int[] previousGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int greater[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                greater[i] = -1;
            } else {
                greater[i] = stack.peek();
            }
            stack.push(i);
        }
        return greater;
    }

    public static void main(String[] args) {
        int arr[] = { 120, 100, 60, 80, 90, 110, 115 };
        int n = 7;
        System.out.println(Arrays.toString(stockSpan(arr, n)));
    }
}
