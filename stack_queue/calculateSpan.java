package stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class calculateSpan {
    public static int[] calculateSpan(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];
        result[0] = -1;
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = i - result[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 120 };
        System.out.println(Arrays.toString(calculateSpan(arr)));
    }
}
